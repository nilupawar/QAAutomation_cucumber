Important Note:-

- If you use cucumber-java8 dependency(look into pom.xml) then it allows you to write your step defintion using java8 lambda 

    e.g.
    Given("is used to set precondition", () -> {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    });

- Refer comments from "JunitCucumberTest.java" file to know different options of junit cucumber runner
    - If feature files are not found then message "WARNING: No features found at <location>" is displayed   
    - glue property - to specify multiple packages use {"package1","package2"}
- 