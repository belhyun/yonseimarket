FROM tomcat:latest

MAINTAINER belhyun@yonsei.ac.kr

ENV REFRESHED_AT 2017-03-20
ENV GITHUB_REPO https://raw.githubusercontent.com/belhyun/yonseimarket/master/raw/build-artifacts
ENV APP_FILE yonseimarket.war

RUN apt-get update -y && \
  apt-get install wget -y && \
  wget -O /usr/local/tomcat/webapps/ROOT.war ${GITHUB_REPO}/${APP_FILE} && \
  mv /usr/local/tomcat/webapps/ROOT /usr/local/tomcat/webapps/_ROOT

COPY tomcat-users.xml /usr/local/tomcat/conf/tomcat-users.xml
