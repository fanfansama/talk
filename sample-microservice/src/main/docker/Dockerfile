FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD sample-microservice-1.0-SNAPSHOT-exec.jar app.jar
RUN sh -c 'touch /app.jar'
ENV SERVER_PORT=8282
ENV JAVA_OPTS=""
ENV EUREKA_INSTANCE_HOSTNAME="sample"
ENV EUREKA_CLIENT_SERVICEURL_DEFAULTZONE="http://discovery:8761/eureka/"
EXPOSE 8282
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
