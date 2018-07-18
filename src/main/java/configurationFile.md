```java
javac -cp ".;slf4j-api-1.8.0-beta1.jar;logback-classic-1.3.0-alpha2.jar;logback-core-1.3.0-alpha2.jar" chapters/configuration/MyApp1.java 
```



```java
java -Dlogback.configurationFile=sample0.xml -cp ".;slf4j-api-1.8.0-beta1.jar;logback-classic-1.3.0-alpha2.jar;logback-core-1.3.0-alpha2.jar" chapters.configuration.MyApp1
```



把所需要的文件以及 jar 包放在与 `chapters` 同级的 classpath 目录下，或者指定具体的文件夹