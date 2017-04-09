package com.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Abdul on 21/03/2017.
 */
public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }


    @FindBy(id = "email") private WebElement uname;
    @FindBy(id = "password") private WebElement pwd;
    @FindBy(name = "commit") public static WebElement loginbtn;
    @FindBy(xpath = "html/body/div[1]/div/div/div/form/div[1]") public static WebElement invalidLoginMessage;

    public void loginToWebSite(String username, String password){
        uname.sendKeys(username);
        pwd.sendKeys(password);
    }




    public void checErrorkMasg(String text2){

        Assert.assertTrue(invalidLoginMessage.getText().equals(text2));
    }


}
