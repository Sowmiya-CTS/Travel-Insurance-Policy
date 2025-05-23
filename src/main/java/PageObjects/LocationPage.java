package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.WaitHelper;

public class LocationPage {
    WebDriver driver;
    WaitHelper waitHelper;

    public LocationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        waitHelper = new WaitHelper(driver);
    }

    @FindBy(id = "country")
    WebElement countryField;

    @FindBy(xpath = "//li[@class='search-item']")
    WebElement searchResult;

    public void enterLocation() {
        waitHelper.waitForElement(countryField);
        countryField.sendKeys("Sweden");  
        countryField.click();
        waitHelper.waitForElement(searchResult);
        searchResult.click();
    }
}
