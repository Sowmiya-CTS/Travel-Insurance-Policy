package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.WaitHelper;

public class AddTravelPage {
    WebDriver driver;
    WaitHelper waitHelper;

    public AddTravelPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        waitHelper = new WaitHelper(driver);
    }

    @FindBy(xpath = "//article[@class='newPq_travellers_wrap']//a")
    WebElement addTravelButton;

    @FindBy(xpath = "//label[@for='traveller_2']")
    WebElement secondTraveller;

    @FindBy(id = "divarrow_undefined")
    WebElement ageDropdown1;

    @FindBy(xpath = "//label[@for='21 years_undefined']")
    WebElement selectAge1;

    @FindBy(xpath = "//div[@id='1']//div[@id='divarrow_undefined']")
    WebElement ageDropdown2;

    @FindBy(xpath = "//label[@for='22 years_undefined']")
    WebElement selectAge2;

    @FindBy(xpath = "//*[@id='ped_no']")
    WebElement preExistingConditionNo;

    @FindBy(xpath = "//button[text()='Done']")
    WebElement doneButton;

    public void addTravellers() {
        waitHelper.waitForElement(addTravelButton);
        addTravelButton.click();

        waitHelper.waitForElement(secondTraveller);
        secondTraveller.click();

        waitHelper.waitForElement(ageDropdown1);
        ageDropdown1.click();
        waitHelper.waitForElement(selectAge1);
        selectAge1.click();

        waitHelper.waitForElement(ageDropdown2);
        ageDropdown2.click();
        waitHelper.waitForElement(selectAge2);
        selectAge2.click();

        waitHelper.waitForElement(preExistingConditionNo);
        preExistingConditionNo.click();

        waitHelper.waitForElement(doneButton);
        doneButton.click();
    }
}
