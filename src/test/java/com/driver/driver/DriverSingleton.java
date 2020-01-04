package com.driver.driver;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSingleton {
    protected static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null){
            driver = DriverSingleton.getDriver();
        }
        return driver;
    }

    public void killBrowser(){
        driver.quit();
        driver.close();
    }
}
