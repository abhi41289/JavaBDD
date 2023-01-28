package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("user is on LOGIN page")
    public void verifyLoginPage() {
        System.out.println("user is on LOGIN page");
    }

    @When("user enters username and password")
    public void entersUsernamePassword(){
        System.out.println("user enters username and password");
    }

    @And("clicks on the SUBMIT button")
    public void clickOnSubmitButton() {
        System.out.println("clicks on the SUBMIT button");
    }

    @Then("user is navigated to the HOMEPAGE")
    public void naviageToHomePage(){
        System.out.println("user is navigated to the HOMEPAGE");
    }
}
