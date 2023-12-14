FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/Algafood-0.0.1-SNAPSHOT.jar Algafood-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java", "-jar", "Algafood-0.0.1-SNAPSHOT.jar"]