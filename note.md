spring internal is lower than info, so default prints none

spring default has jcl by jul, so you can always use `org.apache.commons.logging.Log`

jul config need to set system properties

spring 5 has special spring-jcl, no need to exclude commons-logging and add slf4j-over-jcl to use slf4j


https://www.logicbig.com/tutorials/misc/java-logging/slf4j-with-log4j2.html

https://www.logicbig.com/tutorials/spring-framework/spring-core/slf4j-logging.html