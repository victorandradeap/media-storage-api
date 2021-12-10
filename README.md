[comment]: <> (<p align="center"><img src="https://jaimedantas.com/load-microservice/docs/icon.png" height="25%" width="25%"> </p>)

# Media Storage API

[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=victorandradeap_media-storage-api&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=victorandradeap_media-storage-api)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=victorandradeap_media-storage-api&metric=coverage)](https://sonarcloud.io/summary/new_code?id=victorandradeap_media-storage-api)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=victorandradeap_media-storage-api&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=victorandradeap_media-storage-api)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=victorandradeap_media-storage-api&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=victorandradeap_media-storage-api)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=victorandradeap_media-storage-api&metric=reliability_rating)](https://sonarcloud.io/summary/new_code?id=victorandradeap_media-storage-api)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=victorandradeap_media-storage-api&metric=vulnerabilities)](https://sonarcloud.io/summary/new_code?id=victorandradeap_media-storage-api)

[comment]: <> (This microservice simulates a microservice with a REST endpoint at ``/resource/{resource_id}``. There is a tutorial on Medium [here]&#40;https://medium.com/reverse-engineering/creating-your-very-first-microservice-with-micronaut-and-kotlin-9be6be4a58d5&#41;.)

## Languages and frameworks
 - Kotlin 1.5.21
 - Micronaut Framework 2.4.1
 - Swagger UI
 
## Libraries
 - [MinIO SDK](https://docs.min.io/docs/java-client-quickstart-guide.html)
 
## Requirements
- JDK 11
- Gradle 6.8.3

## Building From Source
To build from source checkout the code and run:
```
$ gradle clean build
```
## Run
To run the microservice, run:
```
$ java -jar load-simulator-0.1.jar
```
## Documentation
Swagger UI is used for documentation. You can find the information accessing its webpage at:
```
http://localhost:8080/swagger/views/swagger-ui/
```
You can try the API using the Swagger interface embedded on this microservice.  

[comment]: <> (<p align="center"><img src="https://jaimedantas.com/load-microservice/docs/load_microservice_swagger.png" height="50%" width="50%"> </p>)

## Configuration

TODO
