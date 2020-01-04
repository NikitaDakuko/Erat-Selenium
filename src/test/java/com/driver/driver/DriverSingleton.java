package com.driver.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.driver.utils.ResourceReader;

public class DriverSingleton {
    protected static WebDriver driver;


    public static WebDriver getDriver() {
        if (driver == null){
            System.setProperty("webdriver.gecko.driver", ResourceReader.get("geckoDriver.location"));
            driver = new FirefoxDriver();
        }
        return driver;
    }

    public void killBrowser(){
        driver.quit();
        driver.close();
    }
}
