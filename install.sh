#! /bin/bash

for d in example-lib example-mplib; do
    (
        echo "--- Install $d ---"
        cd $d
        ./gradlew publishToMavenLocal
        echo
    )
done
