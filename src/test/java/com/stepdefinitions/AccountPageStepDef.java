package com.stepdefinitions;

import com.driverFactory.DriverFactory;
import com.pages.AccountPage;
import com.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class AccountPageStepDef {
    LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    AccountPage accountPage;


    @Given("user has already logged in to application")
    public void userHasAlreadyLoggedInToApplication(DataTable dataTable) {
        List<Map<String,String>> credentials = dataTable.asMaps();
        String username = credentials.get(0).get("username");
        String password = credentials.get(0).get("password");
        accountPage = loginPage.doLogin(username,password);

    }

    @Given("user is on the Accounts Page")
    public void userIsOnTheAccountsPage() {
        DriverFactory.getDriver().getTitle();
    }

    @Then("user gets accounts section")
    public void userGetsAccountsSection(DataTable dataTable) {
        List<String> expectedList = dataTable.asList();
        List<String> actualList = accountPage.getContentOfHeaders();
        System.out.println(actualList);
        Assert.assertEquals(actualList, expectedList);
    }

    @And("accounts section count should be {int}")
    public void accountsSectionCountShouldBe(int expectedCount) {
        System.out.println(accountPage.getSizeofHeaders());
        Assert.assertEquals(accountPage.getSizeofHeaders(), expectedCount);

    }
}
