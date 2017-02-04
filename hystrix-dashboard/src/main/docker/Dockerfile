FROM java:8
VOLUME /tmp
ADD hystrix-dashboard-1.0-SNAPSHOT-exec.jar app.jar
RUN bash -c 'touch /app.jar'
ENV JAVA_OPTS=""
EXPOSE 7979
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
