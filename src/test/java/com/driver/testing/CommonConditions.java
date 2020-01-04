package com.driver.testing;

import com.driver.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonConditions {
    protected static WebDriver driver;

    @BeforeMethod()
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "R:/Selenium/geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @AfterMethod(alwaysRun = true)
    public void killBrowser(){ driver.close(); }
}
