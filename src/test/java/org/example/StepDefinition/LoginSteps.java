package org.example.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("user_is_on_login_page");
    }

    @When("user enter login credentials")
    public void userEnterLoginCredentials() {
        System.out.println("userEnterLoginCredentials");

    }

    @Then("user is able to logged-in successfully")
    public void user_is_able_to_logged_in_successfully() {
        System.out.println("user_is_able_to_logged_in_successfully");

    }

    @Given("user enter {string} as user name and {string} as password login credentials")
    public void userEnterAsUserNameAndAsPasswordLoginCredentials(String username, String password) {
        System.out.println("username is :" +username +" password is :" +password);

    }

    @When("user click the login button")
    public void userClickTheLoginButton() {
        System.out.println("userClickTheLoginButton");

    }

    @Then("user validate error message")
    public void userValidateErrorMessage() {
        System.out.println("userValidateErrorMessage");

    }

    @Then("user should be redirected to {string}")
    public void userShouldBeRedirectedTo(String page) {
        System.out.println("page is :" +page);

    }

    @And("user enter valid credentials")
    public void userEnterValidCredentials() {
        System.out.println("user Enter Valid Credentials");

    }

    @Given("user click the {string} button")
    public void userClickTheButton(String Button) {
        System.out.println("user Click The Button :" +Button);

    }

    @Given("user is logged in")
    public void userIsLoggedIn() {
        System.out.println("user Is Logged In");

    }
}
