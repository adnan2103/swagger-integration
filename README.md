# How to integrate Swagger to generate API Documentation for your REST API.

# STEP 1
## We assume you already have API or Create REST end point API using spring boot.

# STEP 2
## Add Swagger maven dependency in pom.xml
	<properties>
		<springfox-version>2.5.0</springfox-version>
	</properties>
		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger2</artifactId>
			<version>${springfox-version}</version>
		</dependency>
		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger-ui</artifactId>
			<version>${springfox-version}</version>
		</dependency>


# STEP 3
## Add SwaggerConfig in your application.

# STEP 4
## Add Swagger API documentation controller in your application. (DocumentationController.java)

# You are done.