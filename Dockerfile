FROM openjdk:17-alpine
COPY ./target/courses-0.0.1-SNAPSHOT.jar /
RUN sh -c 'touch /courses-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java","-jar","/courses-0.0.1-SNAPSHOT.jar"]
RUN chmod +x /courses-0.0.1-SNAPSHOT.jar