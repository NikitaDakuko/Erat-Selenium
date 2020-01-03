package com.driver.testing;

import com.driver.pages.HotelSearchPage;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test2 extends CommonConditions {

    @Test
    public void testDate() throws Exception {

        driver = new FirefoxDriver();
        System.out.println("Starting Test 1");
        driver.get(prop.getProperty("URL.Test.Search"));

        HotelSearchPage page = PageFactory.initElements(driver, HotelSearchPage.class);
        page.setCalendar("2020-01-15", "2020-02-01");
        page.setDestination("London");
        page.checkPrices();
        page.checkResults();
    }
}
