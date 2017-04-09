package com.heroproj;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Abdul on 21/03/2017.
 */
public class Hooks {

    public static WebDriver driver;

    @Before
    public WebDriver setup(){
      //  ChromeOptions options= new ChromeOptions();
        //options.addArguments("--disable-infobars");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul\\Documents\\Selenium_jar\\chromedriver.exe");
       // driver = new ChromeDriver(options);
        driver = new ChromeDriver();
        //System.setProperty("webdriver.gecko.driver", "C:\\Users\\Abdul\\Documents\\Selenium_jar\\geckodriver.exe");
       // driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        return driver;
    }

    @After
    public void teardown()
    {
        driver.quit();
    }

}
