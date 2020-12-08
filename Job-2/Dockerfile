FROM openjdk:15
EXPOSE 8085
ADD /target/Job-2-1.0.jar docker_micro_service_job.jar
ENTRYPOINT ["java" , "-jar" ,"docker_micro_service_job.jar"]