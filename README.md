# Spring Boot Cloud 3 Demo

This project demonstrates the interaction between the different Spring Boot 3 technologies.

`config-server`

This module depends on **spring-cloud-config-server** and connects with a git repo to serve the configuration settings.

`discovery-server`

This module depends on **spring-cloud-starter-netflix-eureka-server** where other services can register and be looked up.

`api-gateway`

This module depends on **spring-cloud-starter-gateway**. It is the gateway for all incoming requests and makes the
necessary load balance forwarding to the actual service implementation.

`mail-services`

This module depends on **spring-cloud-starter-config** to connect to the config server and 
**spring-cloud-starter-netflix-eureka-client** to register to the Eureka naming server.

It also depends on Webflux for providing a REST endpoint.

# Before you Run

Make the folder /config-repo a git repo by going inside the folder and running the command below.

```git init```

# How to Run

The following modules should be run in the following order.

- config-server
- discovery-server
- mail-services
- api-gateway

# Testing the Services

`mail-services`

This service runs on port 8001.

The actual URL is http://localhost:8001/mails/profiles/1

`api-gateway`

This service runs on port 8001. It simply forwards the request to the mail-services.

The actual URL is http://localhost:8000/mails/profiles/1
