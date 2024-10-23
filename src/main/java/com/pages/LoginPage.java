package com.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    private By userEmail = By.id("input-email");
    private By userPassword = By.id("input-password");
    private By loginBtn = By.xpath("//input[@value='Login']");
    private By forgetPasswordLink = By.xpath("//*[text()='Forgotten Password']");

    //Constructor
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public String getLoginPageTitle(){
        return driver.getTitle();
    }

    public Boolean forgetPasswordLink(){
        return driver.findElement(forgetPasswordLink).isDisplayed();
    }

    public void enterUserName(String username){
        driver.findElement(userEmail).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(userPassword).sendKeys(password);
    }

    public void clickOnLoginBtn(){
        driver.findElement(loginBtn).click();
    }

    public AccountPage doLogin(String username, String password){
        driver.findElement(userEmail).sendKeys(username);
        driver.findElement(userPassword).sendKeys(password);
        driver.findElement(loginBtn).click();
        Alert alert = driver.switchTo().alert();
        return new AccountPage(driver);
    }

}
