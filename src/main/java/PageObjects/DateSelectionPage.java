package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.WaitHelper;

public class DateSelectionPage {
    WebDriver driver;
    WaitHelper waitHelper;

    public DateSelectionPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        waitHelper = new WaitHelper(driver);
    }

    @FindBy(xpath = "//article[@class='newPq_duration_wrap']//div[1]")
    WebElement dateSelectionPopup;

    @FindBy(xpath = "//button[@aria-label='May 15, 2025']")
    WebElement startDateElement;

    @FindBy(xpath = "//button[@aria-label='June 12, 2025']")
    WebElement endDateElement;

    @FindBy(xpath = "//button[text()='Done']")
    WebElement doneButton;

    public void selectDates() {
        waitHelper.waitForElement(dateSelectionPopup);
        dateSelectionPopup.click();

        waitHelper.waitForElement(startDateElement);
        startDateElement.click();
        waitHelper.waitForElement(endDateElement);
        endDateElement.click();
        waitHelper.waitForElement(doneButton);
        doneButton.click();
    }
}
