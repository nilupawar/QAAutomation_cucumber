package com.automation.qa.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.no.Gitt;

public class KeywordsSteps {
    @Given("is used to set precondition")
    public void is_used_to_set_precondition() {
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
}
