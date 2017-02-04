FROM java:8
VOLUME /tmp
ADD sample-microservice-1.0-SNAPSHOT-exec.jar app.jar
RUN bash -c 'touch /app.jar'
ENV SERVER_PORT=8000
ENV JAVA_OPTS=""
EXPOSE 8000
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
