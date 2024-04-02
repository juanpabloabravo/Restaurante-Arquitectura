# Utiliza una imagen base de OpenJDK para Java 21
FROM adoptopenjdk/openjdk21:jre
# Copia el archivo JAR de la aplicación al contenedor
COPY target/restaurante-0.0.1-SNAPSHOT.jar /app/restaurante.jar
# Expone el puerto en el que se ejecuta la aplicación Spring Boot
EXPOSE 8080
# Comando para ejecutar la aplicación al iniciar el contenedor
CMD ["java", "-jar", "/app/restaurante.jar"]
