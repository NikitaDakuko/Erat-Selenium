package com.driver.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSingleton {
    protected static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null){
            System.setProperty("webdriver.gecko.driver", "R:/Selenium/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        return driver;
    }

    public void killBrowser(){
        driver.quit();
        driver.close();
    }
}
