GWT Quickstart Maven Archetype
=========================================

Summary
-------
The project is a Maven archetype for GWT 2.5.0 web application.

Generated project characteristics
-------------------------
* GWT web application for eclipse environment
* GWT 2.5.0 with configuration

Create a project
----------------
mvn archetype:generate -DarchetypeGroupId=com.github.archetypes -DarchetypeArtifactId=gwt-spring-multi-module -DarchetypeVersion=1.250-SNAPSHOT

Run the project
----------------

	mvn gwt:run
	
Creating a new project in Eclipse
----------------------------------

* Install the archetype in local repository with `mvn install`
* Go to `Preferences > Maven > Archetypes` and `Add Local Catalog`
* Select the catalog from file (`archetype-catalog.xml`) 
* Create new Maven project and select the archetype (remember so select `Include snapshot archetypes`).

