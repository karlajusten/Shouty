package io.cucumber.shouty;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class StepDefinitions {

    private Person lucy = new Person("Lucy");
    private Person sean = new Person("Sean");
    private String messageFromSean;

    @Given("{person} is located {int} meter(s) from Sean")
    public void lucy_is_located_meters_from_Sean(Person person, Integer distance) {
        lucy.moveTo(distance);
    }

    @When("Sean shouts {string}")
    public void sean_shouts(String message) {
        sean.shout(message);
        messageFromSean = message;
    }

    @Then("Lucy hears Sean's message")
    public void lucy_hears_Sean_s_message() {
        assertEquals(asList(messageFromSean),lucy.getMessageHeard());
    }
}