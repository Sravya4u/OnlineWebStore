# OnlineWebStore
Online Web Application using spring rest template

###1. Technologies
* Java 1.8
* Spring 4.0.1.RELEASE
* Maven 3.3.9
* JSTL 1.2
* JQuery
# To run this project locally 
 1. Deploy application on tomcat8
 2. $ mvn tomcat8:run
# Access http://localhost:8080/OnlineWebStore
##Assumptions
The Store has been built with fixed number of products and extendable in futute.

# Spring Framework 4.0.X have been used with 

Rest Template for Back-End 
  - Services developed using spring rest template can be integrated to Front-End/JSP easily
  - Spring framework provides all architectural features to be easily integrated .
  - Logging,exception handling ,Spring testing framework have been usedin this project

# Logging Framework has been implemented with log4j and spring support.

Exception Handling implemented with Spring @ExceptionHandler spring aop support

# JSP,JSTL and JQuery for Front-End.
  -As Data-binding can be done easily using spring ModelAttributes
  -Easy to validate and bind results in future enhancements
  
- DAO layer with dummy data has been initialized in the application.
# Persistent Layer Implementation:
 To implement this add hibernate core jar dependencies to POM - hibernate-core,hibernate-validator,sql-connector-java
 Create Hibernate configuration class annotated with spring @EnableTransactionManagement with follwing beans:
           SessionFactoryBean 
           DataSource
           HibernateTransactionManager
           Read datasource properties
 This makes DAO layer ready to implement CRUD operations with @HibernateTemplate

# Development Time (apprx 1.5 days)
  FrameworkDesign and Initial Setup - 3 hours
  Rest service development - 3 hours
  UI Design and Integraton - 1 hours
  UI Validations - 1 hour
  
  
