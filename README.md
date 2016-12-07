# neba-spring-example
#Steps to run this application - 

1. Run an instance of sling by default it runs on `http://localhost:8080/` and admin credentials are **Username - admin** and **Password - admin**. If this differ change properties accordingly in pom.xml
2. Download io.neba.neba-delivery-sling bundle from http://neba.io/download.html.
3. Install downloaded bundle throgh sling console.
4. now goto the project directory where your pom.xml is there and run command -  mvn clean install

#How to test the controllers - 
1. http://localhost:8080/bin/mvc.do/hello will return **Hello Wolrd!**
2. http://localhost:8080/bin/mvc.do/letters will return error stack trace
`500 Request processing failed; nested exception is java.lang.IllegalArgumentException: No converter found for return value of type: class java.util.Arrays$ArrayList`
