#!/bin/bash
export VGS_HOME=$HOME
export CLASSPATH=$VGS_HOME/conf:$VGS_HOME/classes:$VGS_HOME/lib/slf4j-api-1.7.1.jar:$VGS_HOME/lib/tomcat-jdbc-7.jar:$VGS_HOME/lib/commons-beanutils-1.8.0.jar:$VGS_HOME/lib/aspectjweaver-1.5.4.jar:$VGS_HOME/lib/spring-aop-3.2.0.RELEASE.jar:$VGS_HOME/lib/junit-3.8.1.jar:$VGS_HOME/lib/commons-logging-1.1.1.jar:$VGS_HOME/lib/commons-lang-2.6.jar:$VGS_HOME/lib/commons-dbcp-1.4.jar:$VGS_HOME/lib/spring-jdbc-3.2.0.RELEASE.jar:$VGS_HOME/lib/jackson-annotations-2.0.5.jar:$VGS_HOME/lib/spring-tx-3.2.0.RELEASE.jar:$VGS_HOME/lib/log4j-1.2.17.jar:$VGS_HOME/lib/spring-test-3.2.0.RELEASE.jar:$VGS_HOME/lib/jcl-over-slf4j-1.7.1.jar:$VGS_HOME/lib/mybatis-spring-1.1.1.jar:$VGS_HOME/lib/dom4j-1.6.jar:$VGS_HOME/lib/jsp-api-2.2.jar:$VGS_HOME/lib/jackson-jaxrs-1.6.1.jar:$VGS_HOME/lib/aopalliance-1.0.jar:$VGS_HOME/lib/slf4j-log4j12-1.6.6.jar:$VGS_HOME/lib/zxingutil-2.3.jar:$VGS_HOME/lib/servlet-api-3.0.jar:$VGS_HOME/lib/spring-web-3.2.0.RELEASE.jar:$VGS_HOME/lib/zookeeper-3.3.3.jar:$VGS_HOME/lib/cglib-nodep-3.0.jar:$VGS_HOME/lib/spring-core-3.2.0.RELEASE.jar:$VGS_HOME/lib/aspectjrt-1.7.2.jar:$VGS_HOME/lib/mysql-connector-java-5.1.12.jar:$VGS_HOME/lib/spring-context-support-3.2.0.RELEASE.jar:$VGS_HOME/lib/json-lib-2.4-jdk15.jar:$VGS_HOME/lib/spring-expression-3.2.0.RELEASE.jar:$VGS_HOME/lib/commons-collections-3.2.1.jar:$VGS_HOME/lib/spring-orm-3.2.0.RELEASE.jar:$VGS_HOME/lib/spring-aspects-3.2.0.RELEASE.jar:$VGS_HOME/lib/commons-codec-1.9.jar:$VGS_HOME/lib/dubbo-2.5.3.jar:$VGS_HOME/lib/mybatis-3.1.1.jar:$VGS_HOME/lib/jdbcdriver-11.2.0.jar:$VGS_HOME/lib/commons-pool-1.5.4.jar:$VGS_HOME/lib/spring-context-3.2.0.RELEASE.jar:$VGS_HOME/lib/jackson-databind-2.0.5.jar:$VGS_HOME/lib/juli-1.0.jar:$VGS_HOME/lib/spring-beans-3.2.0.RELEASE.jar:$VGS_HOME/lib/netty-3.2.5.Final.jar:$VGS_HOME/lib/jackson-core-2.0.5.jar:$VGS_HOME/lib/javassist-3.15.0-GA.jar:$VGS_HOME/lib/jackson-datatype-hibernate4-2.0.5.jar:$VGS_HOME/lib/jackson-core-asl-1.6.1.jar:$VGS_HOME/lib/jackson-mapper-asl-1.6.1.jar
java -Xms256m -Xmx512m -Dfile.encoding=UTF-8 -Dfile.encoding=UTF-8 com.bocsoft.vgs.vgs.process.AESDataSource