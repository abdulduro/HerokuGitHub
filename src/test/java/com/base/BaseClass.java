package com.base;

import com.heroproj.Hooks;
import com.pages.HomePage;
import com.pages.LandingPage;
import com.pages.LoginPage;
import org.openqa.selenium.WebDriver;

/**
 * Created by Abdul on 21/03/2017.
 */
public class BaseClass {

    protected WebDriver driver;
    public LoginPage loginPage;
    public LandingPage landingPage;
    public HomePage homePage;


    public BaseClass(){
        this.driver = Hooks.driver;
        loginPage = new LoginPage(driver);
        landingPage = new LandingPage(driver);
        homePage = new HomePage(driver);

    }




}
