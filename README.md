# Morphia mapPackage Issue - Not able to scan .war

Build the project and execute it.
```
mvn clean package
java -jar target/morphiamapwar-0.0.1-SNAPSHOT.war
```

Log shows `TestModel.class` is not mapped.
```
 INFO 78344 --- [main] com.test.MorphiamapwarApplication : morphia.isMapped(TestModel.class) = false
```
This log statement is printed from https://github.com/singamreddy/MorphiaMapPackageIssue/blob/master/src/main/java/com/test/MorphiamapwarApplication.java#L22

