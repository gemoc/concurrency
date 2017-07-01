#! /bin/bash

case "${0}" in
	/*) absolute=1 ;;
	*) absolute=0 ;;
esac
if [ $absolute -eq 1 ] ; then
	SCRIPTDIR=$(dirname "$0")
else
	SCRIPTDIR="$(cd "${0%/*}" 2>/dev/null; echo "$PWD")"
fi

showUsage () {                                       
	echo "Usage: `basename $0` [-?|-h|--help] [options...]"
	echo "Valid options are:" 
	echo "    -e|--eclipse <dir>   tells the existing eclipse installation to use"
	echo "    -a|--archive <file>  tells to install Eclipse from the archive given in argument"
	echo "    -k                   keep the Eclipse installation after the build (use only with -a option)" 
	echo "    -b|--builddir <dir>  tells the build directory to use, default is current directory"
	echo "    -u <svn-url>         sets the SVN url to checkout, default"
	echo "                         is ${TIMESQUARESVNURL}"
	echo "    -r|--rev <rev>       sets the SVN revision to checkout, defaults to HEAD"
	echo "    -p|--patch <file>    applies a patch file after source checkout. Patch is applied in the source"
	echo "                         toplevel directory (..../timesquare/) with a striping number of 0 (-p0)"
	echo "    -?|-h|--help         shows this help message"
	exit 1 
}

# This script works by default in the current directory
WORKDIR=`/bin/pwd`
# other defaults
ECLIPSEDIR=""
SVNOPTIONS=""
KEEPECLIPSE="false"
TIMESQUARESVNURL="svn+ssh://jdeanton@scm.gforge.inria.fr/svnroot/aosteincubation/trunk/TimeSquare/ECL"
PATCHFILE=""

while [ $1 ] 
do
   case $1 in
   	-\?|-h|--help) showUsage ;;
   	-e|--eclipse) ECLIPSEDIR="$2" ; shift ; shift ;;
   	-a|--archive) ECLIPSEARCHIVE="$2" ; shift ; shift ;;
   	-k) KEEPECLIPSE="true" ; shift ;;
   	-b|--builddir) WORKDIR="$2" ; shift ; shift ;;
   	-u) TIMESQUARESVNURL="$2" ; shift ; shift ;;
    -r|--rev) SVNOPTIONS="--revision $2 ${SVNOPTIONS}" ; shift ; shift ;;
    -p|--patch) PATCHFILE="$2"; shift; shift ;;
   	*) shift ;;
   esac
done

echo "Working in directory: $WORKDIR"

# If an eclipse archive is specified, use it to build a full eclipse installation usable
# to build Timesquare.
if [ -n "${ECLIPSEARCHIVE}" ]
then
	case "${ECLIPSEARCHIVE}" in
		/*) absolute=1 ;;
		*) absolute=0 ;;
	esac
	if [ $absolute -eq 0 ] ; then
		ECLIPSEARCHIVE="`/bin/pwd`/${ECLIPSEARCHIVE}"
	fi
	[ -f "${ECLIPSEARCHIVE}" ] || { echo "Eclipse archive ${ECLIPSEARCHIVE} does not exists" ; exit 1 ; }
	[ -x "${SCRIPTDIR}/prepareEclipse.sh" ] || { echo "Script ${SCRIPTDIR}/prepareEclipse.sh not found" ; exit 2; }
   	ECLIPSEINSTDIR="${WORKDIR}/Eclipse-$$"
	echo "Preparing an Eclipse installation into ${ECLIPSEINSTDIR}/"
	mkdir -p "${ECLIPSEINSTDIR}"
	${SCRIPTDIR}/prepareEclipse.sh "${ECLIPSEARCHIVE}" "${ECLIPSEINSTDIR}"
	status=$?
	if [ $status -ne 0 ]
   		then
   			echo "Eclipse preparation failed and returned status ${status}"
   			exit ${status}
   	fi
	ECLIPSEDIR="${ECLIPSEINSTDIR}/eclipse"
fi

if [ -z "${ECLIPSEDIR}" ] ; then
	echo "No Eclipse installation specified: use either -e or -a option with this script"
	exit 3
fi

eclipseok='true'
# check the eclipse installation against wich the build is performed
[ -z "${ECLIPSEDIR}" ] && { eclipseok='false' ; what="No eclipse directory specified"; }
[ -d "${ECLIPSEDIR}" ] || { eclipseok='false' ; what="${ECLIPSEDIR} is not a directory"; }
[ -d "${ECLIPSEDIR}/plugins" ] || { eclipseok='false' ; what="No plugins/ subdirectory"; }
[ -d "${ECLIPSEDIR}/features" ] || { eclipseok='false' ; what="No features/ subdirectory"; }
[ -x "${ECLIPSEDIR}/eclipse" ] || { eclipseok='false' ; what="No eclipse executable"; }

if [ "${eclipseok}" = 'false' ]
then
	echo "Directory ${ECLIPSEDIR} does not contain an eclipse installation:"
	echo "    $what"
	exit 4
fi

echo "Eclipse installation OK"

cd "${WORKDIR}" || ( echo "Failed to change to directory ${WORKDIR}" ; exit 5 )

# Fetch the sources and get the toplevel SVN revision
[ -d ./src ] && /bin/rm -rf ./src
mkdir -p ./src
echo "Checkout of ${TIMESQUARESVNURL} in ./src"
( cd src && svn co ${SVNOPTIONS} "${TIMESQUARESVNURL}" ) > checkout.log
status=$?
if [ $status -ne 0 ]
   then
	 echo "Checkout failed, exit code : " ${status}
	 exit ${status}
   fi
[ -d src/ECL ] || exit 1
SVNREV=`LC_ALL=C svn info src/ECL | grep ^Revision | cut -d" " -f2`
SVNREV=`printf '%05d' ${SVNREV}`
echo "Revision is " ${SVNREV}

if [ -n "${PATCHFILE}" ]
then
	[ -r "${PATCHFILE}" ] || { echo "Patch file ${PATCHFILE} is not readable" ; exit 2; }
	echo "Patching sources with file ${PATCHFILE}"
	( cd src/ECL && patch -t -p0 ) < ${PATCHFILE}
	status=$?
	if [ $status -ne 0 ]
		then
			echo "Patching failed, exit code : " ${status}
			exit ${status}
	fi
fi	
	

echo "Setup of Build directory"
# Build output directory
[ -d ./build ] && /bin/rm -rf ./build
mkdir -p ./build
mkdir -p ./build/plugins
mkdir -p ./build/features

echo "Source files layout creation for PDEBuild"
# Rearrange the sources for the PDEBuild expected layout
find ./src -name 'fr.inria.aoste.*' -type d \
    -exec test -f {}/.project \; \
    \( \
        \( -exec test -f {}/feature.xml \; \
           -exec sh -c 'cp -lR {} ./build/features/$(basename {})' \; \) \
	    -o -exec sh -c 'cp -lR {} ./build/plugins/$(basename {})' \; \
    \)

skipFeatureCheck="false"
[ -x "${SCRIPTDIR}/checkFeatures.sh" ] || skipFeatureCheck="true"
if [ "${skipFeatureCheck}" = "false" ]
	then
		${SCRIPTDIR}/checkFeatures.sh "${WORKDIR}/build"
	fi

echo "Creation of a temporary workspace for Eclipse"
# Temporary workspace for Eclipse
[ -d ./Workspace ] && /bin/rm -rf ./Workspace
mkdir -p ./Workspace
WORKSPACE=${WORKDIR}/Workspace

# Toplevel build scripts location : copy them from the source and use this new location
BUILDERSRC=${WORKDIR}/org.eclipse.gemoc.moccml.mapping.build
[ -d ./builder ] && /bin/rm -rf ./builder
mkdir -p ./builder
cp -lR ${BUILDERSRC}/* ./builder
BUILDER=${WORKDIR}/builder
BUILDFILE=${BUILDER}/build-ecl.xml
echo "Build files copied from ${BUILDERSRC} to ${WORKDIR}/builder"

# Generate some properties for Ant/Eclipse : the main build file
# (build-timesquare.xml) will load property values from this file.
echo builder\=${BUILDER} > ${BUILDER}/local.properties
echo buildDirectory\=${WORKDIR}/build >> ${BUILDER}/local.properties
if [ -n "${PATCHFILE}" ]; then
	echo svnRevision\=0000 >> ${BUILDER}/local.properties
else
	echo svnRevision\=${SVNREV} >> ${BUILDER}/local.properties
fi
echo srcDirectory\=${WORKDIR}/src >> ${BUILDER}/local.properties
echo base\=${ECLIPSEDIR}/.. >> ${BUILDER}/local.properties
echo baseLocation\=${ECLIPSEDIR} >> ${BUILDER}/local.properties

if [ -n "${PATCHFILE}" ]; then
	TIMESTAMP="LocalBuild"
else
	TIMESTAMP=$(date +%Y%m%d%H%M)
fi

echo timeStamp\=${TIMESTAMP} >> ${BUILDER}/local.properties

echo "Generated Build properties:"
echo "------------------------------------"
/bin/cat ${BUILDER}/local.properties
echo "------------------------------------"

LAUNCHER=${ECLIPSEDIR}/plugins/org.eclipse.equinox.launcher_*.jar
   
echo "Build of ECL launched..."
java -jar ${LAUNCHER} -application org.eclipse.ant.core.antRunner \
	-data ${WORKSPACE} -clean \
	-buildfile ${BUILDFILE} \
	-Dbuilder="${BUILDER}" \
    >build.log 2>&1

grep -q 'BUILD SUCCESSFUL' build.log
status=$?
if [ $status -ne 0 ]
   then
	 echo "Build failed, check the logfiles"
	 exit 7
   else
   	 echo "Build seems to be successful"
   fi

if [ -n "${ECLIPSEARCHIVE}" ] && [ "${KEEPECLIPSE}" = "false" ]
then
	echo "Removing Eclipse installation in ${ECLIPSEINSTDIR}"
	/bin/rm -rf "${ECLIPSEINSTDIR}"
fi
