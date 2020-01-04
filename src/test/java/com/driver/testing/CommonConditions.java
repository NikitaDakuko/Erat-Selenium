package com.driver.testing;

import com.driver.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonConditions {
    protected static WebDriver driver;

    @BeforeMethod()
    public void setUp() {
        driver = DriverSingleton.getDriver(); }

    @AfterMethod(alwaysRun = true)
    public void killBrowser(){ driver.close(); }
}
