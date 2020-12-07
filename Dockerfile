FROM openjdk:8-jre-alpine
RUN mkdir -p /opt/app
COPY target/HelloWorld-0.0.1-SNAPSHOT.jar /opt/app/hello.jar
ENTRYPOINT ["java", "-jar", "/opt/app/hello.jar"]