# Base image
FROM tomcat:8-jre8

# Copy war to tomcat path
ADD target/hello-java-0.1.0.war /usr/local/tomcat/webapps
