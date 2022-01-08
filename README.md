## getting started with Open api Swagger in spring boot
Design a sample rest application

## Dependencies
spring web

##Steps taken
1. we will open https://start.spring.io/

![Alt text](images/spring_io_opening_page.JPG?raw=true "Title")
2. `select dependencies spring web`
![Alt text](images/spring_io_select_dependency_spring_Web.JPG?raw=true "Title")

3. click generate at the bottom download it and then extract the zip
4. Now open intelliJ and goto file-> open  and select the inner demo folder in which we have pom.xml

once project has been imported it will look something like this.
![Alt text](images/file_structure.JPG?raw=true "Title")

5. Now run the DemoApplication and goto localhost:8080 it should give some error as we haven't define the controller 
   yet.
6. Now add 2 new packages model and controllers 
7. Define an employee class in the model package with id, name ,salary
8. Define EmployeeController in Controller package to define end points to get the employee list and delete/add employee
9. Run the application and open swagger link :  localhost:8080/swagger-ui.html
you will be able to see your api end point like given below
![Alt text](images/swager_api.JPG?raw=true "Title")
here you can open each api
![Alt text](images/get.JPG?raw=true "Title")
try to execute directly from here
![Alt text](images/get_try.JPG?raw=true "Title")
you can access api docs as well at the given link : http://localhost:8080/v3/api-docs
10. Now if you want to provide your custom title in swagger api then you need to pass the annotations in spring 
    application  : ``@OpenAPIDefinition(info = @Info(title = "Employees API", version = "1.0", description = "Employees Information"))
    ``
    ![Alt text](images/swagger_api_title.JPG?raw=true "Title")

you also define custom url by adding ``springdoc.api-docs.path = /custompathname`` in application.properties

I hope this basic application help you get started with OpenApi spring framework. Will come back with more such small 
implementations.