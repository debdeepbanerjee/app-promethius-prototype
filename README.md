# app-promethius-prototype


# Spring Boot Proof of Concept Highlights/Reference 

Topics and concepts covered are given below :

## 1. Observability and monitoring a Spring Boot App With Prometheus and Grafana.

Purpose statement : 

Observability is the extent to which the internal states of a system can be inferred from externally available data. An observable software system provides the ability to understand any issue that arises. Conventionally, the three pillars of observability data are metrics, logs and traces.

Monitoring is about checking the telemetry available for the application and defining alerts for known failure states. Observability goes beyond that and aims at reaching a state where we can ask any arbitrary question about the system without knowing the question in advance.

## 2 Reloading Properties Files in Spring.

Spring Cloud has introduced @RefreshScope, and we can use it for configuration classes or beans. As a result, the default scope will be refresh instead of singleton.

Using the refresh scope, Spring will clear its internal cache of these components on an EnvironmentChangeEvent. Then, on the next access to the bean, a new instance is created.

## 3. Spring cloud functions.



Spring Cloud Function is a project with the following high-level goals:

Promote the implementation of business logic via functions.

Decouple the development lifecycle of business logic from any specific runtime target so that the same code can run as a web endpoint, a stream processor, or a task.

Support a uniform programming model across serverless providers, as well as the ability to run standalone (locally or in a PaaS).
Enable Spring Boot features (auto-configuration, dependency injection, metrics) on serverless providers.

It abstracts away all of the transport details and infrastructure, allowing the developer to keep all the familiar tools and processes, and focus firmly on business logic.

Spring Cloud Function features:

Choice of programming styles - reactive, imperative or hybrid.

POJO functions (i.e., if something fits the @FunctionalInterface semantics we’ll treat it as function)

Transparent type conversion of inputs and outputs.

Function composition which includes composing imperative functions with reactive.

REST support to expose functions as HTTP endpoints etc.

Streaming data (via Apache Kafka, Solace, RabbitMQ and more) to/from functions via Spring Cloud Stream framework.

Deploying functions packaged as JAR files with an isolated classloader, to support multi-version deployments in a single JVM.

Packaging functions for deployments, specific to the target platform (e.g., Project Riff, AWS Lambda and more)

Adapters for AWS Lambda, Microsoft Azure, Apache OpenWhisk and possibly other "serverless" service providers.

Support for reactive function with multiple inputs and outputs allowing merging, joining and other complex streaming operation to be handled by functions.

## 4. gRPC-Spring-Boot-Starter.

gRPC is google Remote Procedure Call (gRPC) open source framework used to create scalable and quick APIs. It enables unary, client streaming, server streaming, or both client-server streaming communication between client and server applications. gRPC is built for the HTTP/2 protocol, which is lightweight and efficient in both transmitting and receiving data.


gRPC-spring-boot-starter combines google’s open-source high performance RPC-framework with spring boot’s ease of setup. This project simplifies the gRPC-server/client setup to adding one dependency to your project and adding a single annotation to your service class / client (stub) field. The features of this library are meant to complement your experience with gRPC and still allow you to do any customization you need for your project.




## Authors

- [https://github.aexp.com/dbane4)

Debdeep Banerjee
## Documentation


## 1. Observability and monitoring a Spring Boot App With Prometheus and Grafana.
Detailed description:

## Add dependencies 
We need the following dependencies:
```xml
<dependency>
   <groupId>org.springframework.boot</groupId>  
   <artifactId>spring-boot-starter-web</artifactId>
</dependency>

<dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>


<dependency>
   <groupId>io.micrometer</groupId>
   <artifactId>micrometer-registry-prometheus</artifactId>   
   <scope>runtime</scope>  
</dependency>
  ```
  

## Configure Spring Boot Actuator

Add this line to your 'applications.properties' file 

#### management.endpoints.web.exposure.include=*

## Configure Prometheus
Path of the file : data/prometheus/config/prometheus.yaml
````xml
scrape_configs:
  - job_name: 'Spring Boot Application input'
    metrics_path: '/actuator/prometheus'
    scrape_interval: 3s
    static_configs:
      - targets: ['192.168.0.54:8080']
        labels:
          application: 'My Spring Boot Application'

````

Important notes:

It instructs Prometheus to scrape the app every three seconds.
The target is the host and port of our app.
The path we want to scrape is the prometheus path.

## Configure/Install and Run Prometheus and Grafana in Docker
We’ll create a docker-compose.yml file to install and start Prometheus and Grafana.
Path of the docker file : /docker-compose.yml
````xml
services:
  prometheus:
      image: prom/prometheus:v2.35.0
      #network_mode: host
      container_name: prometheus
      volumes:
        - ./data/prometheus/config:/etc/prometheus/
      command:
        - "--config.file=/etc/prometheus/prometheus.yaml"
      ports:
        - 9090:9090
      restart: always
        
#      links:
#        - node-exporter:node-exporter


#  node-exporter:
#    image: prom/node-exporter:latest
#    network_mode: host
#    container_name: monitoring_node_exporter
#    restart: unless-stopped
#    expose:
#      - 9100

  grafana:
    image: grafana/grafana-oss:8.5.2
    pull_policy: always
    #network_mode: host
    container_name: grafana
    restart: unless-stopped
    user: root
    ports:
      - 3000:3000 # access grafana url
    volumes:
      - ./data/grafana:/var/lib/grafana
    environment:
      - GF_SECURITY_ADMIN_PASSWORD=admin
      - GF_USERS_ALLOW_SIGN_UP=false
      - GF_SERVER_DOMAIN=localhost
      # Enabled for logging
      - GF_LOG_MODE=console file
      - GF_LOG_FILTERS=alerting.notifier.slack:debug alertmanager:debug ngalert:debug

````

Start the services by running this command:

$ docker-compose up

Prometheus is accessible via http://localhost:9090/.

Grafana is running on http://localhost:3000/. When it prompts for login details, use the ones from the docker-compose.yml file.

Start the Spring Boot app to collect and view some metrics.

Open http://localhost:8080/actuator/prometheus.


 ## 2. Reloading Properties Files in Spring.

 i. RefreshScope dependencies and configuration

 ````xml
 <dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter</artifactId>
</dependency>

<dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>


 ````
 ii. Other configuration item is adding the below line to 'application.properties' file 
```
management.endpoints.web.exposure.include=refresh
````



 ````java 

 package com.aexp.observability.monitoring.apppromethiusprototype;

import java.util.Map;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "db")
@RefreshScope
public class DbProperties {

  public Map<String, String> dbProps;

  public Map<String, String> getDbProps() {
    return dbProps;
  }

  public void setDbProps(Map<String, String> dbProps) {
    this.dbProps = dbProps;
  }

  public String getDbPropData(String key) {
    return dbProps.get(key);
  }
}


 ````

 ## 3. Spring cloud functions.

 i. Maven Dependencies
The first thing we need to do is include the spring-cloud-starter-function-web dependency. This will act as our local adapter and brings in the necessary dependencies to run our function locally:

````xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-function-web</artifactId>
    <version>1.0.1.RELEASE</version>
</dependency>

````

ii. With Spring Cloud Function, we can expose @Beans of type Function, Consumer or Supplier as individual methods:

````java
@SpringBootApplication
public class CloudFunctionApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudFunctionApplication.class, args);
    }

    @Bean
    public Function<String, String> reverseString() {
        return value -> new StringBuilder(value).reverse().toString();
    }
}
````

iii. Apart from exposing our method as a @Bean, we could also write our software as classes that implement the functional interface Function<T, R>:

````java
public class Greeter implements Function<String, String> {

    @Override
    public String apply(String s) {
        return "Hello " + s + ", and welcome to Spring Cloud Function!!!";
    }
}
````

iv. We can then specify the packages to scan for relevant beans in application.properties:

````
spring.cloud.function.scan.packages=com.baeldung.spring.cloudfunction.functions

````

v. Testing the Greeter Function Locally
Again, we can start the app and use curl to test the Greeter function:

````
curl localhost:8080/greeter -H "Content-Type: text/plain" -d "World" 
````

## 4. gRPC-Spring-Boot-Starter.

Project Structure :
````
--src
     --main
           --java
           --proto
             employee-service.proto
             --constants
               util.proto
````           
add employee-service.proto file(Declare EmployeeService ) :
````java
syntax = "proto3";

import "constants/util.proto";

option java_multiple_files = true;
option java_package = "com.aexp.observability.monitoring.apppromethiusprototype.employee";

message EmployeeRequest{
  string emp_id = 1;
}
message EmployeeResponse {
  string emp_id = 1;
  string name = 2;
  constants.Role role = 3;
}

service EmployeeService {
  rpc getEmployee(EmployeeRequest) returns (EmployeeResponse) {};
}
````
add "util.proto" file:

````java

syntax = "proto3";

package constants;

option java_multiple_files = true;
option java_package = "com.techgeeknext.constants";

enum Role {
  //default role
  USER = 0;
  HR = 1;
  MANAGER = 2;
  ADMIN = 3;
}

````

Employee Service Implementation :
````java
package com.aexp.observability.monitoring.apppromethiusprototype;

import com.aexp.observability.monitoring.apppromethiusprototype.employee.*;
import com.techgeeknext.constants.Role;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class EmployeeService extends EmployeeServiceGrpc.EmployeeServiceImplBase {

  /**
   * Unary operation to get the employee based on employee id
   *
   * @param request
   * @param responseObserver
   */
  @Override
  public void getEmployee(
      EmployeeRequest request, StreamObserver<EmployeeResponse> responseObserver) {

    // call repository to load the data from database
    // we have added static data for example
    EmployeeResponse empResp =
        EmployeeResponse.newBuilder()
            .setEmpId(request.getEmpId())
            .setName("abc")
            .setRole(Role.USER)
            .build();

    // set the response object
    responseObserver.onNext(empResp);

    // mark process is completed
    responseObserver.onCompleted();
  }
}


````

Dependencies:
````xml
	   <dependency>
			<groupId>net.devh</groupId>
			<artifactId>grpc-server-spring-boot-starter</artifactId>
			<version>2.14.0.RELEASE</version>
		</dependency>

		<dependency>
			<groupId>io.grpc</groupId>
			<artifactId>grpc-stub</artifactId>
			<version>${grpc.version}</version>
		</dependency>
		<dependency>
			<groupId>io.grpc</groupId>
			<artifactId>grpc-protobuf</artifactId>
			<version>${grpc.version}</version>
		</dependency>
````

Add the required plugins in the maven as well
````xml
<build>
		<extensions>
			<extension>
				<groupId>kr.motd.maven</groupId>
				<artifactId>os-maven-plugin</artifactId>
				<version>1.7.0</version>
			</extension>
		</extensions>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
			<plugin>
				<groupId>org.xolstice.maven.plugins</groupId>
				<artifactId>protobuf-maven-plugin</artifactId>
				<version>0.5.1</version>
				<configuration>
					<protocArtifact>
						com.google.protobuf:protoc:3.6.1:exe:${os.detected.classifier}
					</protocArtifact>
					<pluginId>grpc-java</pluginId>
					<pluginArtifact>
						io.grpc:protoc-gen-grpc-java:1.22.1:exe:${os.detected.classifier}
					</pluginArtifact>
					<protoSourceRoot>
						${basedir}/src/main/proto/
					</protoSourceRoot>
				</configuration>
				<executions>
					<execution>
						<goals>
							<goal>compile</goal>
							<goal>compile-custom</goal>
						</goals>
					</execution>
				</executions>
			</plugin>
		</plugins>
	</build>

````

Configure application.properties file :
Use any port or use default port to start the spring boot application.
````
grpc.server.port=9091
````

You can use any GRPC client to test the above service for example(BloomRPC).





