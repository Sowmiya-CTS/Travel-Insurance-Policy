package PageObjects;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.WaitHelper;

public class HealthInsurancePage {
    WebDriver driver;
    WaitHelper waitHelper;

    public HealthInsurancePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        waitHelper = new WaitHelper(driver);
    }

    @FindBy(xpath = "//div[@class='shadowHandlerBox']//i[@class='icon-bg homeIconsBg health-insurance']")
    WebElement healthInsuranceIcon;

    @FindBy(xpath = "//*[@id='male']")
    WebElement maleButton;

    @FindBy(xpath = "//*[@id='female']")
    WebElement femaleButton;

    public void listOfHealthInsurance(String gender) {
        waitHelper.waitForElement(healthInsuranceIcon);
        healthInsuranceIcon.click();

        if (gender.equalsIgnoreCase("Male")) {
            waitHelper.waitForElement(maleButton);
            maleButton.click();
            System.out.println("Fetching submenu items for Male...");
        } else {
            waitHelper.waitForElement(femaleButton);
            femaleButton.click();
            System.out.println("Fetching submenu items for Female...");
        }

        if (gender.equalsIgnoreCase("Female")) {
            List<String> femaleMenuItems = new ArrayList<>();
            femaleMenuItems.add("Self");
            femaleMenuItems.add("Husbund");
            femaleMenuItems.add("Daughter");
            femaleMenuItems.add("Son");
            femaleMenuItems.add("Father");
            femaleMenuItems.add("Mother");

            System.out.println("Health Insurance options for Female: " + femaleMenuItems);
        }else {
        	 List<String> maleMenuItems = new ArrayList<>();
             maleMenuItems.add("Self");
             maleMenuItems.add("Wife");
             maleMenuItems.add("Daughter");
             maleMenuItems.add("Son");
             maleMenuItems.add("Father");
             maleMenuItems.add("Mother");
        	
        }
    }
}
