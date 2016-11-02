# Simple CRUD Function with spring, Maven, Angularjs

##Install 
1. Eclips Mars.2 Release (4.5.2)
2. JDK1.8
3. Tomcat7.0
4. Maven3.2.2
5. Springframe work 3.2.4

##How to build and check
1. Right Click on project -> Run as -> Maven build
2. Provide goals as "clean install"
3. Right click on project -> Run as -> run on sever
   if you have a tomcat, just select it and click on finish.
   if you don't, Manually define a new server.
4. check with http://localhost:8080/AngularjsSpringRestPrj/angularjs.html
   if you want to check json data, accesss http://localhost:8080/AngularjsSpringRestPrj/employees
   
##Tip
This is a simple CRUD application without Database.
You can add, update, delete or select all data from static HashMap from memory.
If you want to keep data in database, you need to install database, such as Mysql, Oracle or etc on your
development environment first.
Please refer to below url if you want to use database.
https://github.com/jongbochung/SpringHibernateMysqlCRUD
