Packaging Springboot application with external dependencies using Maven

Spring boot has simplified the deployment of java based web / API applications drastically. It has eliminated the process of deploying the WAR file into the web container provided by Tomcat or any other application servers. It has brought in a new paradigm shift where the container libraries (like tomcat / Ubuntu / jetty) are themselves embedded along with application classes / jar within the fat spring boot jar. Thus making it a truly standalone application and a candidate for micro service development.
But, there are few minor challenges, which a spring boot developer would face, when deploying the Spring boot application.

1)	How do we ship the external configuration files like application.properties, configuration xml files etc. along with the Spring boot jar.

2)	How can we copy the start-up script with VM and other parameters to start the application to deployment environments

3)	Should we manually create log directory in the new environment and make the changes in the log4j.xml / log4j.properties of the application to point to the log directory.

All the above would need manual configuration changes

Once we address the above concerns. The following questions would be addressed, automatically

1)	Deploying the application to DEV / SIT / UAT / PROD environments via Continuous Integration / Continuous Deployment (CI / CD) infrastructure like Jenkins without any additional configurations in the deployment nodes.

2)	Ship the micro service with external configurations or dependencies, packed into one deployable artifact to any new developer, who can just run it by using a startup script.

The Solution
Maven has the ability to bundle all the artifacts into a directory and create .zip or a .tar file for easy shipment, using the maven-assembly-plugin. We will have to leverage this feature to programmatically organize the dependent artifacts to support the spring boot jar to run seamlessly.

The sample code demonstrates as how the Springboot jar along with external dependencies can be packaged using Maven.
