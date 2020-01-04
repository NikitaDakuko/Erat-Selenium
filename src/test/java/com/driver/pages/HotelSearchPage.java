package com.driver.pages;

import com.driver.utils.ResourceReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HotelSearchPage extends AbstractPage {

    @FindBy (id = "ss")
    private WebElement destination;

    @FindBy (xpath = "//html/body/div[3]/div/div/div[2]/form/div[1]/div[4]/div[2]/button")
    private WebElement button;

    @FindBy (className = "xp__dates-inner")
    private WebElement calendar;

    @FindBy (className = "bui-calendar__control--next")
    private WebElement calendarNextButton;

    @FindBy(id = "hotellist_inner")
    private WebElement hotelList;

    private List<WebElement> results;

    public HotelSearchPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public HotelSearchPage openPage() {
        this.driver.get(ResourceReader.get("URL.Test.Search"));
        return this;
    }

    public HotelSearchPage setDestination(String string){
        System.out.println("Setting Destination");
        destination.sendKeys(string);
        return this;
    }

    public HotelSearchPage setCalendar(String date1, String date2){
        System.out.println("Setting Date");
        calendar.click();
        calendar.findElement(By.xpath("//*[@data-date='"+ date1 + "']")).click();
        calendar.findElement(By.xpath("//*[@data-date='"+ date2 + "']")).click();
        return this;
    }

    public List<WebElement> checkPrices(){
        button.click();
        return hotelList.findElements(By.className("sr_item_new"));
    }
}
