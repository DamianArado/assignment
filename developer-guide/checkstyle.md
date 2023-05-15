# Checkstyle Guide

We have used [checkstyle](https://checkstyle.sourceforge.io/) in our project to ensure that we are following 
specific coding conventions and best practices. 

For this, we have used the [maven-checkstyle-plugin](https://maven.apache.org/plugins/maven-checkstyle-plugin/index.html#apache-maven-checkstyle-plugin). 

## Checkstyle Report 

To generate the checkstyle report locally, we need to execute the following command in the root directory:
```
mvn checkstyle:checkstyle
```
This will generate the Checkstyle results inside `target/site/checkstyle.html` using which we can see which part of 
code is violating our conventions. By default, it will use the [Sun Code Conventions,](https://checkstyle.org/styleguides/sun-code-conventions-19990420/CodeConvTOC.doc.html) but we have configured our project to use the 
[Google Java Style Guide](https://checkstyle.sourceforge.io/styleguides/google-java-style-20180523/javaguide.html). 

## Use Suppression Filter

To specify line ranges inside files that should be suppressed to report any violations, we can use the [suppression 
filter](https://maven.apache.org/plugins/maven-checkstyle-plugin/examples/suppressions-filter.html#using-a-suppressions-filter).  

## List of commands and Configuration Options

With the `maven-checkstyle-plugin`: 
- The complete list of commands are [given here](https://maven.apache.org/plugins/maven-checkstyle-plugin/plugin-info.html#plugin-documentation).
- Extra configuration options and Different use cases are [given here](https://maven.apache.org/plugins/maven-checkstyle-plugin/index.html#examples).