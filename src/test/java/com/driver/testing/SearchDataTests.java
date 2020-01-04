package com.driver.testing;

import com.driver.pages.HotelSearchPage;
import com.driver.utils.ResourceReader;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SearchDataTests extends CommonConditions {

    @Test
    public void TestDestination() {
        List<WebElement> result = new HotelSearchPage(this.driver)
                .openPage()
                .setDestination(ResourceReader.get("Search.Destination"))
                .checkPrices();
        Assert.assertNotNull(result);
    }

    @Test
    public void TestDate() {
        List<WebElement> result = new HotelSearchPage(this.driver)
                .openPage()
                .setDestination(ResourceReader.get("Search.Destination"))
                .setCalendar(ResourceReader.get("Search.CheckIn.Date"),
                             ResourceReader.get("Search.CheckOut.Date"))
                .checkPrices();
        Assert.assertNotNull(result);
    }
}
