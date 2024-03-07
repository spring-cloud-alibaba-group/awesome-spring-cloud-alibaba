FROM registry.cn-hangzhou.aliyuncs.com/yuluo-yx/java-base:V20240116

LABEL author="yuluo" \
	email="karashouk.pan@gmail.com"

ARG GRPC_PORT
ARG PROVIDER_APPS
ARG INNER_PROVIDER_PORT
ARG PROVIDER_ACTUATOR_PORT

COPY ${PROVIDER_APPS}app.jar /app.jar
COPY ${PROVIDER_APPS}application-docker.yml /application-docker.yml

EXPOSE ${INNER_PROVIDER_PORT}
EXPOSE ${PROVIDER_ACTUATOR_PORT}
EXPOSE ${GRPC_PORT}

ENTRYPOINT ["java", "-jar", "app.jar", "--spring.profiles.active=docker"]
