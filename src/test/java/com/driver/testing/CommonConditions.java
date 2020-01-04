package com.driver.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.driver.utils.ResourceReader;
import java.io.IOException;

public class CommonConditions {
    protected static WebDriver driver;


    @BeforeMethod
    public void geckoSetter() {


        System.setProperty("webdriver.gecko.driver", ResourceReader.get("geckoDriver.location"));

        driver = new FirefoxDriver();
    }

    @AfterMethod(alwaysRun = true)
    public void killBrowser(){
        driver.close();
    }
}
