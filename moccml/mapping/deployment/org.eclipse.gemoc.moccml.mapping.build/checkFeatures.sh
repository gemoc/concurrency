#! /bin/bash

WORKDIR=$1
#VERBOSE="false"
VERBOSE="true"

# Correct values for the feature files
UPDATENAME="ECL Update Site"
UPDATEURL="http://timesquare.inria.fr/ecl/update_site/"

PROVIDERNAME="Aoste INRIA/I3S"



XMLSTARLET=xmlstarlet
which "${XMLSTARLET}" >/dev/null 2>&1
status=$?
if [ ${status} -ne 0 ]
then
	echo "${XMLSTARLET} not found. Skipping feature files corrections"
	exit 1
fi
echo "Checking feature definition files"

# insert a correct <url></url> element under feature
function insertUpdateURL () {
	${XMLSTARLET} ed -PS --subnode /feature -t elem -n url -v '' $1 | \
	${XMLSTARLET} ed -PS --subnode /feature/url -t elem -n update -v '' | \
	${XMLSTARLET} ed -PS --insert /feature/url/update -t attr -n "label" -v "${UPDATENAME}" | \
	${XMLSTARLET} ed -PS --insert /feature/url/update -t attr -n "url" -v "${UPDATEURL}" > $2
}
# check an existing <url> element
function checkUpdateURL () {
	local url=`${XMLSTARLET} sel -T -t -v /feature/url/update/@url $1`
	local name=`${XMLSTARLET} sel -T -t -v /feature/url/update/@label $1`
	[ x"${url}" = x"${UPDATEURL}" ] && [ x"${name}" = x"${UPDATENAME}" ]
}
# fix an existing <url> element : first remove it then add it again
function fixUpdateURL () {
	local temp=$(mktemp)
	${XMLSTARLET} ed -PS --delete /feature/url $1 > ${temp}
	insertUpdateURL "${temp}" $2
	rm -f "${temp}"
}

# check the provider name (attribute of the <feature> element)
function checkProviderAttribute () {
	local name=$(${XMLSTARLET} sel -T -t -v /feature/@provider-name $1)
	[ x"${name}" = x"${PROVIDERNAME}" ]
}
# add a provider-name attribute
function addProviderAttribute () {
	${XMLSTARLET} ed -PS --insert /feature -t attr -n "provider-name" -v "${PROVIDERNAME}" $1 > $2
}
# fix the provider-name attribute with the correct value
function fixProviderAttribute () {
	${XMLSTARLET} ed -PS --update /feature/@provider-name -v "${PROVIDERNAME}" $1 > $2
}

# locate all feature.xml files
FEATURES=${WORKDIR}/features/*/feature.xml

for file in ${FEATURES}
do
	[ x"${VERBOSE}" = x"true" ] && echo "Processing ${file}"
	# Check update site URL
	grep -q '<url>' ${file}
	status=$?
	if [ ${status} -ne 0 ] ; then
		[ x"${VERBOSE}" = x"true" ] && echo "Inserting <url> into " ${file}
		mv "${file}" "${file}.bak"
		insertUpdateURL "${file}.bak" "${file}"
	else
		# <url> element exists check it
		checkUpdateURL "${file}"
		status=$?
		if [ ${status} -ne 0 ] ; then
			[ x"${VERBOSE}" = x"true" ] && echo "Fixing <url> element in ${file}"
			mv "${file}" "${file}.bak"
			fixUpdateURL "${file}.bak" "${file}"
		fi
	fi
	# Check provider name
	grep -q 'provider-name=' ${file}
	status=$?
	if [ $status -ne 0 ] ; then
		[ x"${VERBOSE}" = x"true" ] && echo "Adding provider-name attribute in ${file}"
		mv "${file}" "${file}.bak"
		addProviderAttribute "${file}.bak" "${file}"
	else
		checkProviderAttribute "${file}"
		status=$?
		if [ ${status} -ne 0 ] ; then
			[ x"${VERBOSE}" = x"true" ] && echo "Fixing provider-name attribute in ${file}"
			mv "${file}" "${file}.bak"
			fixProviderAttribute  "${file}.bak" "${file}"
		fi
	fi
	#
done

