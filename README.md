# MireDot Archetype
## Version 1.0

This archetype creates a MireDot documentation project. It includes
a whitelabled html structure, including a dummy ACME logo, css and base 
structure for API documentation.

Build it first with `mvn clean install`.

The archetype is a partial archetype and can be applied on top of an existing
project that wants to add MireDot documentation.

To apply the MireDot archetype to an existing project, just navigate to that
project with a terminal/command window and use this Maven command:

```
mvn archetype:generate -DarchetypeGroupId=se.limestream.archetypes      \
                       -DarchetypeArtifactId=archetype-miredot          \
                       -DarchetypeVersion=1.0-SNAPSHOT                  \
                       -DgroupId=com.acme.myproject                     \
                       -DartifactId=my-first-miredot                    \
                       -Dversion=1.0.0-SNAPSHOT                         \
                       -Dpackage=com.acme.myproject.service             \
                       -DserviceName="My Service"                       \
                       -DbaseUrl="myservice.api.acme.com"
```

Change the following parameters to suit your needs: 
- groupId : The Maven Group Id to use, normally something like <your.domain>.<your.product>
- artifactId : What this service is called.
- version: The initial version to use, default is 1.0-SNAPSHOT
- package: What base package to use for your Java classes.
- serviceName: What is the name, in Camel Case Style, that should be visible in the HTML document headers.
- baseUrl: A domain name to use as a base for the API documentation. Normally where you deploy your service.


To create an empty MireDot project from scratch just to familiarize yourself with 
the concept, just stand in a directory that does not contain a pom.xml and run the same command.
 
Then go to http://miredot.com/price/ and request a license for the GAV you created.

For the usage of MireDot see http://miredot.com/docs/.

The README.md of the generated archetype contains information about customized html files.

All MireDot properties are (c) of Qmino.