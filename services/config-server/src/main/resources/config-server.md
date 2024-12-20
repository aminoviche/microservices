
# Dependencies
```xml
         <!--	config server-->
        <dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-config-server</artifactId>
		</dependency>
```

# Config


@EnableConfigServer
public class ConfigServerApplication 


# applications.properties

```yaml
server:
  port: 8888

spring:
  profiles:
    active: native
  application:
    name: config-server
  cloud:
    config:
      server:
        native:
          search-locations: classpath:/configurations  #Locations of configurations files

```

# URL

http://localhost:8888/config-server/customer-service
http://localhost:8888/config-server/discovery-service



