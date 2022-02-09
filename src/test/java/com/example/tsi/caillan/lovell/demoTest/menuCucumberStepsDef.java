package com.example.tsi.caillan.lovell.demoTest;

import com.example.tsi.caillan.lovell.demo.SakilaMoviesDbApplication;
import static org.junit.Assert.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class menuCucumberStepsDef {
    private String dialect;
    private String test;
    @Given("I want to add the language {string}")
    public void i_want_to_add_the_language(String lang) {
        dialect = lang;
        throw new io.cucumber.java.PendingException();
    }

    @When("I put a post request")
    public void i_put_a_post_request() {
        test =new SakilaMoviesDbApplication().addLanguage(dialect);
        throw new io.cucumber.java.PendingException();
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String result) {
        assertEquals(result, test);
        throw new io.cucumber.java.PendingException();
    }
}
