Important Note:-

- RUN this maven using command
    
            - mvn clean test -Dspring.profiles.active=qa -Denvironment=sit __    
            - mvn clean test -Dspring.profiles.active=qa -Denvironment=sit -Dcucumber.options="--tags '@MultiExamples or @fewOthertags'"  (tags OR condition) __    
            - mvn clean test -Dspring.profiles.active=qa -Denvironment=sit -Dcucumber.options="--tags '@MultiExamples and @fewOthertags'" (tags AND condition) __
            - mvn clean test -Dspring.profiles.active=qa -Denvironment=sit -Dcucumber.options="-t '@MultiExamples' -d"    (do dry run) __    
            - mvn clean test -Dspring.profiles.active=qa -Denvironment=sit -Dcucumber.options="-t '@MultiExamples' --threads 3" (run cucumber test with multiple threads) __    
            - mvn clean test -Dspring.profiles.active=qa -Denvironment=sit -Dcucumber.options="-t '@MultiExamples' --no-dry-run" (always cause dryRun to false) __

- You may pass all arguments in intellij as well (VM options)
                            
             -Dspring.profiles.active=qa
             -Denvironment=sit
             -Dcucumber.options="-t '@MultiExamples' --no-dry-run"

- You can run cucumber test without IDE and without junit test running if you have following jars
                
                cucumber-core, cucumber-java, cucumber-jvm-deps, gherkin
                lets assume that these jar are available in a folder called jar (your_path_to_folder/jar) then use below command 
                (I am assuming that you have compiled your step definition java file and also kept it inside jar folders )
                
                java -cp your_path_to_folder/jar/* cucumber.api.cli.Main -p pretty -f <location_to_feature_file_folder> -g <if step defintion is inside package>
                
                class could be io.cucumber.core.cli.Main(if package is io.cucumber) depending on used library    
    

- If you use cucumber-java8 dependency(look into pom.xml) then it allows you to write your step definition using java8 lambda 

                e.g.
                Given("is used to set precondition", () -> {
                    // Write code here that turns the phrase above into concrete actions
                    throw new cucumber.api.PendingException();
                });

- Refer comments from "JunitCucumberTest.java" file to know different options of junit cucumber runner
    
                - If feature files are not found then message "WARNING: No features found at <location>" is displayed   
                - glue property - to specify multiple packages use {"package1","package2"}

- Putting a #language:<value> on first line of feature tells cucumber which spoken language is used in feature file

- To get the list of spoken languages supported by cucumber use below command
               java  -cp "cucumber-core<XX>.jar;gherkin<XX>.jar" io.cucumber.core.cli.Main --i18n help
   
- If you want do not want to pass arguments in step definition when passing an arguments you can use ?: 
              e.g. 
              When I travel to Delhi
              When I travel to Mumbai
              
              for this you can use same step definition
              @When("^I travel to (?:Delhi|Mumbai)$")
              public void methodName(){
               // your code
              }
     
- You can compare two DataTables using the diff() method of DataTable object
    
            e.g. Then I get following tik tok output
                 |0|X|0|
                 |0|X|0|
                 |0|X|0|
                 
                 in yourr java code you can have List<List<String>> which contains may contain some value and value passed in datatable object of given then step can be compared as below
                 
                 @Then("^I get following tik tok output$")
                 public void myMethod(DataTable expTable){
                    expTable.diff(List<List<String>> object)
                 }
     
- Some of the important Dependency injection container that can be used with cucumber
    
                1. cucumber-picocontainer
                2. cucumber-juice  - This is by Google
                3. cucumber-spring - Spring
                
                If DI containers are used then it will take care of creation of hooks and stepdefinition
    
    
- run with below mvn command to generate allure report inside target/allure-result folder 
                
               mvn clean test -Dspring.profiles.active=qa -Denvironment=sit -Dcucumber.options="-t '@MultiExamples and @ExampleTag2' --no-dry-run" -Dallure.results.directory=target/allure-results     

- read more about allure
                
               https://docs.qameta.io/allure/#_cucumber_jvm
               
- to specify the test tags in the command like you can also set system property 'cucumber.filter.tags' instead of specifying in cucumber.options 

- Always remember the difference between cucumber expressions and regular expressions while writing step definitions. cucumber express will never have start with ^ or end with $. having / in also indicates regular expression              
