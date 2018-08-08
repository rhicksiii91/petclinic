#Docker

This Docker Compose script starts 2 Docker containers with the following components:

- Supplements application deployed to Tomcat and started together with XRebel Local
- MongoDB instance

See [docker-compose.yml](docker-compose.yml) for the components' setup description.

Read more about Docker compose on the [official website](https://docs.docker.com/compose/).

See the complete [XRebel APM demo script](https://docs.google.com/a/zeroturnaround.com/document/d/1mdsDi3mu3Zy9r_0TZLKD6llTXsePceIUlGWdfdrJRt0/edit?usp=sharing) for more information about the demo script.

##Prerequisites

[Docker](https://docs.docker.com/) is required in order to run this demo. Follow the instructions on the website how to install and configure it.

Copy the current XRebel Local JAR into ./xr folder.

##How to run
If Docker is installed correctly and running, all you need to do is launch the container via docker-compose:
```
docker-compose up
```

Access the newly started Supplements application in the web browser:
```
http://localhost:8888/supplements
```