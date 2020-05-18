package io.cucumber.shouty;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class StepDefinitions {
    
    @Given("Lucy is located {int} meters from Sean")
    public void lucy_is_located_meters_from_Sean(Integer distance) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Sean shouts {string}")
    public void sean_shouts(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Lucy hears Sean’s message")
    public void lucy_hears_Sean_s_message() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}