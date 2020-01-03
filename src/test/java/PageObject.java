import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PageObject {

    @FindBy (id = "ss")
    private WebElement destination;

    @FindBy (xpath = "//html/body/div[3]/div/div/div[2]/form/div[1]/div[4]/div[2]/button")
    private WebElement button;

    @FindBy (className = "xp__dates-inner")
    private WebElement calendar;

    @FindBy (className = "bui-calendar__control--next")
    private WebElement calendarNextButton;

    @FindBy (id = "hotellist_inner")
    private WebElement hotelList;

    private List<WebElement> results;



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

    List<WebElement> getResults(){
        System.out.println("Loading Test Results");
        if (results == null)
            results = hotelList.findElements(By.className("sr_item_new"));
        return results;
    }

    void checkResults() throws Exception {
        System.out.println("Analyzing Test Results");
        List<WebElement> results = getResults();
        if(results.size() > 0)
            System.out.println("Test completed successfully with " + results.size() + " results");
        else
            throw new Exception("No results");
    }

    public void finish() throws Exception {
        checkPrices();
        checkResults();
    }
}
