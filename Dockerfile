FROM openjdk:8-jdk-alpine
EXPOSE 8070
ARG JAR_FILE=target/eurekaserver-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} eurekaserver-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","eurekaserver-0.0.1-SNAPSHOT.jar"]
