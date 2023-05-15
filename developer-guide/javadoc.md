# Javadoc Guide 

You do not need to generate the javadocs locally as with every commit, this is already done on our [GitHub actions 
CI](../.github/workflows/static.yml) that also helps us serve these docs on [our website](https://damianarado.github.io/assignment). 

In this project, we are using the [maven-javadoc-plugin](https://maven.apache.org/plugins/maven-javadoc-plugin/) 
that will help us generate the documentation for our source code. 

## Generate Javadoc locally

If in case, you still to generate the Javadocs locally, execute this command while being in the project's root 
directory:  
```
mvn javadoc:javadoc
```

This will create the Javadoc inside `target/site/apidocs`.

## Exclude Packages

To exclude specific packages from the generated Javadoc, you can check out [this page](https://maven.apache.org/plugins/maven-javadoc-plugin/examples/exclude-package-names.html#excluding-packages).

## Fix Javadoc comments

You can also use `maven-javadoc-plugin` to fix the [Javadoc comments](https://maven.apache.org/plugins/maven-javadoc-plugin/examples/fix-javadocs.html#fixing-javadoc-comments) but the preferred way would be 
to use Checkstyle for this as we will be following a specific coding style and conventions while writing source 
code for our project.

## List of commands and Configuration Options

With the `maven-javadoc-plugin`: 
- The complete list of commands are [given here](https://maven.apache.org/plugins/maven-javadoc-plugin/index.html#goals-overview).
- Extra configuration options and Different use cases are [given here](https://maven.apache.org/plugins/maven-javadoc-plugin/index.html#examples).