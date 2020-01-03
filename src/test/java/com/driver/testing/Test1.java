package com.driver.testing;

import com.driver.pages.HotelSearchPage;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test1 extends CommonConditions {

    @Test
    public void testDestination() throws Exception {

        driver = new FirefoxDriver();
        System.out.println("Starting Test 1");

        HotelSearchPage page = PageFactory.initElements(driver, HotelSearchPage.class);
        page.setDestination("Moscow");
        page.checkPrices();
        page.checkResults();
    }
}
