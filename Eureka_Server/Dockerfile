FROM openjdk:15
EXPOSE 8087
ADD /target/Eureka_Server-1.0.jar docker_micro_service_eurka.jar
ENTRYPOINT ["java" , "-jar" ,"docker_micro_service_eurka.jar"]