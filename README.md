# java-test-support

A simple Java/Maven module with the standard testing libraries. The project
imports our standard, common testing libraries -- JUnit5, assertJ, Mockito 
and Spring-test -- and also introduces the `@Slow` annotation to tag any unit tests as slow-running.

## Usage

* Import into your Java project:

```xml
<dependency>
   <groupId>com.elsevier.test</groupId>
   <artifactId>java-test-support</artifactId>
   <version>1.0-SNAPSHOT</version>
   <scope>test</scope>
</dependency>
```
* Start testing.

To build the project locally, run:

```mvn clean install```

That's it.