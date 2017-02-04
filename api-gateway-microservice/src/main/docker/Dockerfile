FROM java:8
VOLUME /tmp
ADD api-gateway-microservice-1.0-SNAPSHOT-exec.jar app.jar
RUN bash -c 'touch /app.jar'
ENV JAVA_OPTS=""
EXPOSE 8761
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
