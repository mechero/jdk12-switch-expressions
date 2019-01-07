# JDK 12 Switch Expressions Example

This project contains code examples comparing the classic Java switch statement with the new preview feature available in Java 12, Switch Expressions.

For the quick how-to and explanation, check out the article [Java 12 Switch Expressions in 5 minutes](https://thepracticaldeveloper.com/2019/01/07/java-12-switch-expressions-5-minutes/).

## Build with maven

First, make sure your JAVA_HOME variable points to a JDK 12 distribution, same as your PATH if needed.

To build the code and generate the JAR package using Maven, run:

`mvn clean package`

## Run from command line

From the project's root directory, you can run:

`java --enable-preview -jar target/jdk12preview-1.0.0-SNAPSHOT.jar`

If you want to run the `ClassicSwitch` code, you have two options:

1. Pass the class to Java: `java --enable-preview -cp "./target/classes" io.tpd.SwitchExpressions`
2. Change the `MANIFEST.MF` file contents to point to `io.tpd.SwitchExpressions`, re-build and execute the jar file again.
