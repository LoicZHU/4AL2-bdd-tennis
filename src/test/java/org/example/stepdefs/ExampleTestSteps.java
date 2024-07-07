package org.example.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class ExampleTestSteps {
  @Given("I have a configured Cucumber project")
  public void i_have_a_configured_cucumber_project() {
    // Setup code here
  }

  @When("I run the tests")
  public void i_run_the_tests() {
    // Execution code here
  }

  @Then("they should pass successfully")
  public void they_should_pass_successfully() {
    assertTrue(true);
  }
}
