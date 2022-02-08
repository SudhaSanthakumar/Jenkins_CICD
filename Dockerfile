FROM openjdk:11
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} movie-app.jar
EXPOSE 8083
ENTRYPOINT ["java","-jar","/movie-app.jar"]