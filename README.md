# GraalVM Jar
Minimal reproduction of attempting to use GraalVM 21 to run a Spring Boot-built executable JAR
with Polyglot capabilities.

## Build & Run
```shell
mvn package
java -jar target/graalvm-jar-1.0-SNAPSHOT.jar
```
This will throw an exception.
