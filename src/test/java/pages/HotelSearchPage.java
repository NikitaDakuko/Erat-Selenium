package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Properties;

public class HotelSearchPage extends SearchResultsPage {

    @FindBy (id = "ss")
    private WebElement destination;

    @FindBy (xpath = "//html/body/div[3]/div/div/div[2]/form/div[1]/div[4]/div[2]/button")
    private WebElement button;

    @FindBy (className = "xp__dates-inner")
    private WebElement calendar;

    @FindBy (className = "bui-calendar__control--next")
    private WebElement calendarNextButton;

    protected HotelSearchPage(WebDriver driver, Properties prop) {
        super(driver, prop);
    }


    public void setDestination(String string){
        System.out.println("Setting Destination");
        destination.sendKeys(string);
    }

    public void setCalendar(String date1, String date2){
        System.out.println("Setting Date");
        calendar.click();
        calendar.findElement(By.xpath("//*[@data-date='"+ date1 + "']")).click();
        calendar.findElement(By.xpath("//*[@data-date='"+ date2 + "']")).click();
    }

    public void checkPrices(){
        button.click();
    }
}
