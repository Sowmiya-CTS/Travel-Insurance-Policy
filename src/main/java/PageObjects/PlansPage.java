package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.WaitHelper;

public class PlansPage {
    WebDriver driver;
    WaitHelper waitHelper;
    JavascriptExecutor jsExecutor;

    public PlansPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        waitHelper = new WaitHelper(driver);
        jsExecutor = (JavascriptExecutor) driver;
    }

    @FindBy(xpath = "//button[contains(text(), 'View')]")
    WebElement viewPlansButton;

    public void clickViewPlans() throws InterruptedException {
        waitHelper.waitForElement(viewPlansButton);
        
       
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", viewPlansButton);

        
        System.out.println("Is View Plans button enabled? " + viewPlansButton.isEnabled());

        jsExecutor.executeScript("arguments[0].disabled = false;", viewPlansButton);
        System.out.println("After enabling: " + viewPlansButton.isEnabled());

       
        jsExecutor.executeScript("arguments[0].click();", viewPlansButton);

        Thread.sleep(5000); 
    }
}
