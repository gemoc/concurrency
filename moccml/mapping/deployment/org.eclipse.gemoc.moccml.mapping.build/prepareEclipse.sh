#! /bin/bash

WORKDIR=`/bin/pwd`

ECLIPSE_ARCHIVE=$1
DESTINATION=$2

#Sanity check : both arguments needs to be defined
if [ -z "${ECLIPSE_ARCHIVE}" ] || [ -z "${DESTINATION}" ]
then
	echo "Error: this script must be called with 2 arguments. First argument is the Eclipse Modeling"
	echo "archive to use as a base for installation, second is the directory in which to extract the"
	echo "archive and perform the installation of supplementary plugins."
	exit 1		
fi

# Remove any existing Eclipse installation
[ -d "${DESTINATION}/eclipse" ] && /bin/rm -rf "${DESTINATION}/eclipse"
echo "Extracting ${ECLIPSE_ARCHIVE} into ${DESTINATION}"
( cd "${DESTINATION}" && tar xzf "${ECLIPSE_ARCHIVE}" )
status=$?
if [ ${status} -ne 0 ]
	then
		echo "Extraction failed. Error ${status}"
		exit ${status}
fi
[ -d "${DESTINATION}/eclipse" ] || { echo "No eclipse directory created" ; exit 3 ; }
[ -x "${DESTINATION}/eclipse/eclipse" ] || { echo "No eclipse executable found" ; exit 4 ; }
#

# Contournement des bugs suivants qui semblent toujours exister avec java7 et 64 bits.
# https://bugs.eclipse.org/bugs/show_bug.cgi?id=317785
# https://bugs.eclipse.org/bugs/show_bug.cgi?id=352089
JAVA7=false
{ LC_ALL=C java -version 2>&1 | grep version | cut -d " " -f3 | grep -q '1.7' ; }
if [ $? -eq 0 ] ; then JAVA7=true ; fi

if [ x"${JAVA7}" = "xtrue" ]
	then
		echo "-Djava.util.Arrays.useLegacyMergeSort=true" >> ${DESTINATION}/eclipse/eclipse.ini
	fi

REPOSITORIES="http://download.eclipse.org/releases/juno/"
REPOSITORIES+=",http://download.eclipse.org/eclipse/updates/4.2/"
REPOSITORIES+=",http://download.eclipse.org/modeling/emft/eef/updates/releases"
REPOSITORIES+=",http://download.eclipse.org/modeling/mdt/papyrus/updates/releases/juno"
REPOSITORIES+=",http://timesquare.inria.fr/update_site"
FEATURES="org.eclipse.xtext.sdk.feature.group"
FEATURES+=",org.eclipse.acceleo.sdk.feature.group"
FEATURES+=",org.eclipse.ocl.examples.feature.group"
FEATURES+=",org.eclipse.m2m.qvt.oml.sdk.feature.group"
FEATURES+=",fr.inria.aoste.timesquare.feature.feature.group"

echo '-Djava.util.Arrays.useLegacyMergeSort=true' >> ${DESTINATION}/eclipse/eclipse.ini

ECLIPSEOPTS="-consolelog -nosplash"

echo "Launching installation into Eclipse..."
${DESTINATION}/eclipse/eclipse ${ECLIPSEOPTS} \
	-application org.eclipse.equinox.p2.director \
	-repository "${REPOSITORIES}" \
	-installIU "${FEATURES}"

