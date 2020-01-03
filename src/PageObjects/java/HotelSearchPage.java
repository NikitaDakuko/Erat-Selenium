import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HotelSearchPage extends SearchResultsPage {

    @FindBy (id = "ss")
    private WebElement destination;

    @FindBy (xpath = "//html/body/div[3]/div/div/div[2]/form/div[1]/div[4]/div[2]/button")
    private WebElement button;

    @FindBy (className = "xp__dates-inner")
    private WebElement calendar;

    @FindBy (className = "bui-calendar__control--next")
    private WebElement calendarNextButton;




    void setDestination(String string){
        System.out.println("Setting Destination");
        destination.sendKeys(string);
    }

    void setCalendar(String date1 , String date2){
        System.out.println("Setting Date");
        calendar.click();
        calendar.findElement(By.xpath("//*[@data-date='"+ date1 + "']")).click();
        calendar.findElement(By.xpath("//*[@data-date='"+ date2 + "']")).click();
    }

    void checkPrices(){
        button.click();
    }
}
