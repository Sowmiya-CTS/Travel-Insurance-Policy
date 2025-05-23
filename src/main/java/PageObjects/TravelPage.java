package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.WaitHelper;

public class TravelPage {
    WebDriver driver;
    WaitHelper waitHelper;

    public TravelPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        waitHelper = new WaitHelper(driver);
    }

    @FindBy(xpath = "//div[@class='prd-icon add shadowHandler short']//i[@class='icon-bg homeIconsBg icon-bg-new ti']")
    WebElement travelIcon;

    public void clickTravelIcon() {
        waitHelper.waitForElement(travelIcon);
        travelIcon.click();
    }
}
