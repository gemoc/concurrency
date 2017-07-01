#! /bin/bash

PUBLISH_LOCATION=/home/groups/timesquare/htdocs/update/P1vhZHjAUIroD12YS

ssh scm.gforge.inria.fr mkdir -p ${PUBLISH_LOCATION}
scp -r build/buildRepo/* scm.gforge.inria.fr:${PUBLISH_LOCATION}
