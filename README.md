## getting started with spring boot in less than 10 mins
Design a Hello world spring boot application

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
6. add a new test class CheckHTTPResponse present in test folder to assert test now if we try running this 
CheckHTTPResponse it should fail as we have still not added the controller. 

7. Now we will create a new HelloWorldController class , where we will define the RestController and default 
RequestMapping through annotations and now if you will run the test class it will succeed.

8. we can also check in the localhost:8080 that it prints the hello message

![Alt text](images/Hello.JPG?raw=true "Title")
9. you can also give a goodbye message at some other goodbye endpoint as we have defined in this code.

![Alt text](images/Goodbye.JPG?raw=true "Title")

I hope this basic application help you get started with spring framework. Will come back with more such small 
implementations.