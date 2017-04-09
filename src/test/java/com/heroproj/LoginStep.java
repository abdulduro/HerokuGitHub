package com.heroproj;

import com.base.BaseClass;
import com.pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import static com.pages.HomePage.login;
import static com.pages.LoginPage.loginbtn;

/**
 * Created by Abdul on 21/03/2017.
 */
public class LoginStep extends BaseClass {

   WebDriver driver;


    public LoginStep(){
        this.driver = Hooks.driver;

    }

    @Given("^I am on home page$")
    public void i_am_on_home_page() throws Throwable {

        driver.get("https://www.heroku.com/");
        login.click();


    }

    @When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_enter_and(String username, String password) throws Throwable {

        loginPage.loginToWebSite(username, password);

    }

    @When("^I click the login button$")
    public void i_click_the_login_button() throws Throwable {

        loginbtn.click();

    }

    @Then("^I ses \"([^\"]*)\"$")
    public void i_ses(String text) throws Throwable {
        landingPage.checkMasg(text);




    }

    @Then("^I ses \"([^\"]*)\" apps\" error message$")
    public void i_ses_apps_error_message(String text2) throws Throwable {

        loginPage.checErrorkMasg(text2);

    }


}
