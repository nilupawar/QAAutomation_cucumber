package com.automation.qa.steps;

import com.automation.qa.helper.Helper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.no.Gitt;
import io.qameta.allure.Allure;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.file.Paths;


public class KeywordsSteps {
    @Autowired
    Helper helper;

    @Given("is used to set precondition")
    public void is_used_to_set_precondition() throws FileNotFoundException, URISyntaxException {

            Allure.addAttachment("TestAttachment", new FileInputStream(Paths.get(this.getClass().getClassLoader().getResource("TestAttachmentFile").toURI()).toFile()));
    }

    @When("is used to show an action is performed")
    public void is_used_to_show_an_action_is_performed() {
    }

    @Then("is used to represent validation step")
    public void is_used_to_represent_validation_step() {
    }

    @Then("is used to repeat Given, When and Then in subsequent steps")
    public void is_used_to_repeat_Given_When_and_Then_in_subsequent_steps() {
    }

    @Then("is used for negative validation, this is opposite of Then")
    public void is_used_for_negative_validation_this_is_opposite_of_Then() {
    }

    @Then("is used when you are not sure of which keyword can be used")
    public void is_used_when_you_are_not_sure_of_which_keyword_can_be_used() {
    }

    // This is given statement in norway language
    @Gitt("this is norway on")
    public void thisIsNorwayOn() {
    }

    //In below example ? indicate 0 or 1 occurrence of the character that precedes it
    @Given("^files? processed$")
    public void fileProcessed(){
    }

    @Given("^i have (table|chair)$")
    public void iHaveTable() {
    }

    @Given("^i do not have (?:table|chair)$")
    public void iDoNotHaveTable() {
    }

      // Below commented step definition is also correct
//    @Given("i have {int} pens")
//    public void iHavePens(int arg0) {
//    }

    @Given("^i have (\\d+) pens?$")
    public void iHavePen(int penCount){
    }

    @Given("first statement after second statement")
    public void firstStatementAfterSecondStatement() {
    }

    @Given("this step will run for multiple example row {string}")
    public void thisStepWillRunForMultipleExampleRow(String rowNum) {
        helper.incrementCount();
        System.out.println(helper.hashCode() + " Count value is : " + helper.getCount());
        System.out.println("name is " + helper.getName());
        System.out.println("Second name is " + helper.getSecondName());
    }
}
