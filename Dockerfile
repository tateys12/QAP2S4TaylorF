FROM eclipse-temurin:21-alpine
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]