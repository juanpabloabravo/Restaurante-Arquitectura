# Dockerfile

FROM adoptopenjdk/openjdk21:jre
WORKDIR /app
COPY target/compras-0.0.1-SNAPSHOT.jar /app/compras-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java", "-jar", "compras-0.0.1-SNAPSHOT.jar"]
