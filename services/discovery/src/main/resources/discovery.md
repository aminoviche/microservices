
# Dependencies
```xml
        <!--	config client to get config from config server-->
	    <dependencies>
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-config</artifactId>
		</dependency>
		<!--	eureka server-->
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
		</dependency>
```    

# Config

@EnableEurekaServer
public class DiscoveryApplication {


# applications.properties

```yaml
spring:
  application:
    name: discovery-service
  config:
    import: optional:configserver:http://localhost:8888 #url to config server

```

# discovery-service.yml

configuration in the config server

```yaml
eureka:
  instance:
    hostname: localhost  # The hostname of the instance. This defines the name of the server or machine that Eureka will register as.

  client:
    register-with-eureka: false  # Set to false to tell the Eureka server not to register itself in Eureka. Useful for a client-side setup or when Eureka is acting only as a registry.
    fetch-registry: false  # Set to false to prevent the client from fetching the registry of available instances from Eureka.

    serviceUrl:
      defaultZone: http://${eureka.instance.hostname}:${server.port}/eureka/  # The URL where the Eureka server is located, formatted with the hostname and port.

server:
  port: 8761  # Port number for the Eureka server to listen on.


```

# URL

http://localhost:8761/




