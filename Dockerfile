#pull jdk image
FROM openjdk:11
#add/copy jar file from target to docker file system
ADD ./target/spring-boot-neo4j-0.0.1-SNAPSHOT.jar /spring-boot-neo4j/src/spring-boot-neo4j-0.0.1-SNAPSHOT.jar
WORKDIR spring-boot-neo4j/src
EXPOSE 8060
#run the jar file
ENTRYPOINT ["java","-jar","spring-boot-neo4j-0.0.1-SNAPSHOT.jar"]

