# Drone
Step 1: Download the Spring Web Project from the Spring site as below.
Start.spring.io 
Generate Gradle project 
Search for dependencies – Web
Generate Project 	

Step 2: Create a simple RestController as mentioned in this Project.

Step 3: If you want to run your application in a specif port number other than 8080 then specify the server port number in application.properties file.
Ex:- server.port=8082

Step 4: crate the below two env variables as below
export PLUGIN_URL=IP Address of your machine:port number (Ex: 10.20.233.222:8082 or localhost:8082)
export PLUGIN_VALUE=Input parameter for your app (ex:- siva)

Step 5: create a script.sh file in your root of repository/project and add the below content.
curl ${PLUGIN_URL}/${PLUGIN_VALUE}

Step 6: Give execute permissions to the script.sh file as below
Chmod 777 script.sh

Step 6: Create a Dockerfile in your root of repository/project to create docker image.
FROM centos:7

 ADD script.sh /bin/
 ENTRYPOINT /bin/script.sh
 
Step 7: create .drone.yml file and speicify the instructions for your drone builds.

Step 8: Install the docker stable version from the below site.
https://docs.docker.com/docker-for-mac/install/#download-docker-for-mac

Step 8: create docker image for your project as below.
Syntax: docker build -t image_name:image_version .
Ex:- docker build –t drone_test:v1.0 . 

Step 9: Run your docker image as below:
docker run -e PLUGIN_URL=localhost:8080 -e PLUGIN_VALUE=somevalue -d --name drone_test:v1.0 --restart=always drone_test:v1.0

Step 10: execute the below command to see your docker image status.
docker ps --all

Step 11: If your docker image is up and running then hit the below url in the browser to get the response.
http://localhost:8082/ramu

Step 12: Refer the below site to configure Git, Artifactory, Docker ,Dock-CUBE, ...etc plugins in your .drone.yml file to enable CICD for your project using drone.
http://plugins.drone.io
http://readme.drone.io

Step 13:
Install the drone server as specified below
http://readme.drone.io/0.5/install/server/


Step 14:
execute the below command to test your drone builds in your local.
drone exec









