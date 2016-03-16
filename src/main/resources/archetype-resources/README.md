# MireDot usage
 
The archetype has generated a SillyRequestResource class so that you can
verify that the generation is functioning as it should if you created an
project from scratch. You are safe to remove it at any time. In fact, Sonar
will hunt it down.

The MireDot documentation is build with the normal compilation so no extra
build steps are needed. The output is found at `${project.build.directory}/miredot/html/`.

The base directory for MireDot documentation is `/src/main/resources/documentation`, from now on
named as `${miredot.base}`.

In `${miredot.base}` you find the css and images in the named directories. Please store all images in the `images` directory.

If you add images of any other type than GIF, remember to add that suffix to the resource filtering declaration of the pom.

During the generation, all api files will be generated into the /api folder. Don't edit this one.

## The different HTML-files

### index.html

Contains the navigation and css-references. Don't touch this unless you know what you are doing.

### home.html

The first page that is shown in the index.html. This should contain information about the connector, terms and
other usefull stuff that the client implementor might need to know about.

### overview.html

Should contain an overview of the service/connector.

### intro.html

The header of the API-documentation. Put stuff like media types, change log and other API related stuff here.


