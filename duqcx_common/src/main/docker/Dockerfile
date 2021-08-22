# 拉取基础镜像
FROM java:8

# 设置作者信息
MAINTAINER duqc "DuqcX"


ADD duqcx_common-1.0-SNAPSHOT.jar duqcx_common.jar

# 设置端口号，此处只开放一个端口8083
EXPOSE 8888

RUN bash -c 'touch /duqcx_common.jar'
ENTRYPOINT ["java","-jar","duqcx_common.jar"]