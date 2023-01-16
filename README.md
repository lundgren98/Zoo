## Running Jacoco
```bash
mvn install
mvn jacoco:prepare-agent test install jacoco:report
```
To open the html file to see the coverage you can go into Zoo/target/site/jacoco and press the index.html file or make your way into the Zoo file and type:
```bash
firefox target/site/jacoco/index.html
```
This requires you to have firefox. The same command might work with chrome, but it has not been tested.
