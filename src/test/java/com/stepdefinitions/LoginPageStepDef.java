package com.stepdefinitions;

import com.driverFactory.DriverFactory;
import com.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginPageStepDef {
    LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    String titlePage;

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {


    }

    @When("user gets the title of the page")
    public void user_gets_the_title_of_the_page() {
        titlePage = loginPage.getLoginPageTitle();
        System.out.println("Title of the Page is : "+titlePage);

    }

    @Then("the title of page should be {string}")
    public void the_title_of_page_should_be(String expectedTitle) {
        Assert.assertEquals(titlePage, expectedTitle);

    }

    @Then("forgot password link should be displayed")
    public void forgotPasswordLinkShouldBeDisplayed() {
        Assert.assertTrue(loginPage.forgetPasswordLink());

    }

    @When("user enters email {string}")
    public void userEntersEmail(String userEmail) {
        loginPage.enterUserName(userEmail);

    }

    @And("user enters password {string}")
    public void userEntersPassword(String password) {
        loginPage.enterPassword(password);

    }

    @And("user clicks on the Login button")
    public void userClicksOnTheLoginButton() {
        loginPage.clickOnLoginBtn();
    }

}
