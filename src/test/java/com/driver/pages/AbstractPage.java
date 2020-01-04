package com.driver.pages;

import org.openqa.selenium.WebDriver;

import java.util.Properties;

public abstract class AbstractPage{
    protected WebDriver driver;

    protected abstract AbstractPage openPage();
    protected final int WAIT_TIMEOUT_SECONDS = 10;

    protected AbstractPage(WebDriver driver){
        this.driver = driver;
    }
}