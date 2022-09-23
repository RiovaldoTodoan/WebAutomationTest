package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Pages.LoginPages;

import static org.junit.Assert.*;

public class LoginStepDef {


        LoginPages LoginPages;

        //Scenario 1
        @Given("User already on login page")
        public void UserAlreadyOnLoginPage() {
            LoginPages.open();
        }

        @When("User input username {string}")
        public void UserInputUsername(String username) {
            LoginPages.InputUsername(username);
        }

        @And("User input password {string}")
        public void UserInputPassword(String password) {
            LoginPages.InputPassword(password);
        }

        @And("User click login button")
        public void UserClickLoginButton() {
            LoginPages.clickButton();
        }

        @Then("User directed to inventory page")
        public void UserDicrectedToInventoryPage() {
            assertEquals("https://www.saucedemo.com/inventory.html", LoginPages.getUrl());
        }

        @Given("User already on login")
        public void UserAlreadyLogIn () {
            LoginPages.open();
            LoginPages.InputUsername("standard_user");
            LoginPages.InputPassword("secret_sauce");
            LoginPages.clickButton();
        }

        //Scenario 2
        @Given("User landing on login page")
        public void UserLandingOnLoginPage() {
            LoginPages.open();
        }
        @When("User input invalid username {string}")
        public void UserInputInvalidUsername(String username) {
            LoginPages.InputUsername(username);
        }
        @And("User input valid password {string}")
        public void UserInputValidPassword(String password) {
            LoginPages.InputPassword(password); }

        @And("User click on login button")
        public void UserClickOnLoginButton() {
            LoginPages.clickButton(); }

        @Then("User can not login")
        public void UserCanNotLogin() {
            assertEquals("https://www.saucedemo.com/",LoginPages.getUrl());}

    }

