# Miredot Archetype
## Version 1.1

This archetype creates a Miredot documentation project. It includes
a whitelabled html structure, including a dummy ACME logo, css and base 
structure for API documentation.

Build it first with `mvn clean install`.

The archetype is a partial archetype and can be applied on top of an existing
project that wants to add Miredot documentation.

To apply the Miredot archetype to an existing project, just navigate to that
project with a terminal/command window and use this Maven command:

```
mvn archetype:generate -DarchetypeGroupId=se.limestream.archetypes      \
                       -DarchetypeArtifactId=archetype-miredot          \
                       -DarchetypeVersion=1.1-SNAPSHOT                  \
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
- version: The initial version to use, default is 1.0-SNAPSHOT. 
- package: What base package to use for your Java classes.
- serviceName: What is the name, in Camel Case Style, that should be visible in the HTML document headers.
- baseUrl: A domain name to use as a base for the API documentation. Normally where you deploy your service.

Additional parameters:
- miredotVersion: Miredot's current bleeding edge is 2.1-SNAPSHOT, the latest stable release is 2.0.1 (default).

To create an empty Miredot project from scratch just to familiarize yourself with 
the concept, just stand in a directory that does not contain a pom.xml and run the same command.
 
Then go to http://www.miredot.com/price/ and start your free trial. Open-source projects can request a free commercial key at support@miredot.com. 

When you have obtained your license you can copy paste it in the Miredot plugin configuration section of your pom. 
Using this archetype your pom will include instructions on where to copy paste your license.

For the usage of Miredot see http://miredot.com/docs/.

The README.md of the generated archetype contains information about customized html files.

All Miredot properties are (c) of Qmino.
