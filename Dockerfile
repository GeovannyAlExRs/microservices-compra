FROM openjdk:17-jdk-slim
LABEL authors="Geovanny AlEx Rs"
VOLUME /tmp
RUN apt-get update
COPY "./target/microservices-compra-0.0.1-SNAPSHOT.jar" "appcompra.jar"
ENTRYPOINT ["java", "-jar", "appcompra.jar"]
EXPOSE 8085