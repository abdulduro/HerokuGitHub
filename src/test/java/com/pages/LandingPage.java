package com.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Abdul on 21/03/2017.
 */
public class LandingPage {

    protected WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(className = "name") private WebElement personalApplMessage;
    
    public void checkMasg(String text){

        Assert.assertTrue(personalApplMessage.getText().equals(text));


    }




}