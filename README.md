# Requirements

## Install sdkman
- Install at https://sdkman.io/install



# How to use the project ?

## Prepare your environment
```shell
sdk env install
sdk env use
```
Those commands will install every needed tools to run the project.
## Run the project
```shell
mvn clean install
mvn exec:java -Dexec.mainClass=com.ynov.oop.App
```
