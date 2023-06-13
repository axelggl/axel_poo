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

Java version : 19.0.1-zulu

Maven version : 3.8.7

SKDMan versions :

script : 5.18.1

native : 0.2.9
## Run the project
```shell
mvn clean install
mvn exec:java -Dexec.mainClass=com.ynov.oop.App
```
