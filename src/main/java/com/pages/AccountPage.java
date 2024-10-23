package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class AccountPage {
    private WebDriver driver;
    private By headers = By.xpath("//div[@id='content']/h2");

    public AccountPage(WebDriver driver){
        this.driver = driver;
    }

    public int getSizeofHeaders(){
        return driver.findElements(headers).size();
    }

    public List<String> getContentOfHeaders(){
        List<String> headersContent = new ArrayList<>();
        int size = getSizeofHeaders();
        for(int i=0;i<size;i++){
            headersContent.add(driver.findElements(headers).get(i).getText());
        }
        return headersContent;
    }
}
