## install to local
```bash
cd example-lib
./gradlew publishToMavenLocal
# repeat this for example-mplib
```

## uninstall local lib
```bash
cd ~/.m2/repository/com/github/shwaka
rm -r example
```

## run
```bash
cd example-user # or example-jsuser
./gradlew run
```

## publish to github pages
```bash
cd example-lib
./gradlew publishToMavenLocal
cp -r ~/.m2/repository/com/github/shwaka/example /path/to/repository/com/github/shwaka/
```
