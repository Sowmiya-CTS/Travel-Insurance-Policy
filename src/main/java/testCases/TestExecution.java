package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.BaseClass;
import PageObjects.*;

public class TestExecution {
    WebDriver driver;
    TravelPage travelPage;
    LocationPage locationPage;
    DateSelectionPage dateSelectionPage;
    AddTravelPage addTravelPage;
    PlansPage plansPage;
    HealthInsurancePage healthInsurancePage;
    CarInsurance carInsurancePage;

    @BeforeClass
    public void setup() {
        BaseClass base = new BaseClass();
        driver = base.driver;

        
        travelPage = new TravelPage(driver);
        locationPage = new LocationPage(driver);
        dateSelectionPage = new DateSelectionPage(driver);
        addTravelPage = new AddTravelPage(driver);
        plansPage = new PlansPage(driver);
        healthInsurancePage = new HealthInsurancePage(driver);
        carInsurancePage = new CarInsurance(driver);
    }

    @Test(priority = 1)
    public void testTravelSelection() {
        travelPage.clickTravelIcon();
    }

    @Test(priority = 2)
    public void testLocationSelection() {
        locationPage.enterLocation();  
    }

    @Test(priority = 3)
    public void testDateSelection() {
        dateSelectionPage.selectDates();  
    }

    @Test(priority = 4)
    public void testAddingTravellers() {
        addTravelPage.addTravellers();
    }

    @Test(priority = 5)
    public void testViewPlans() throws InterruptedException {
        plansPage.clickViewPlans();
    }

    @Test(priority = 6)
    public void testHealthInsuranceForMale() {
        healthInsurancePage.listOfHealthInsurance("Male");
    }

    @Test(priority = 7)
    public void testHealthInsuranceForFemale() {
        healthInsurancePage.listOfHealthInsurance("Female");
    }

    @Test(priority = 8)
    public void testCarInsuranceSelection() {
        carInsurancePage.carinsuranceclick();
    }

    @Test(priority = 9)
    public void testCarDetailsFill() {
        carInsurancePage.detailsfill();
    }

    @Test(priority = 10)
    public void testCarBrandSelection() {
        carInsurancePage.brandvalue("Toyota");  
    }

    @Test(priority = 11)
    public void testCarModelSelection() {
        carInsurancePage.modelvalue("Corolla");  
    }

    @Test(priority = 12)
    public void testCarFuelTypeSelection() {
        carInsurancePage.fueltype("Petrol");  
    }

    @Test(priority = 13)
    public void testCarVariantSelection() {
        carInsurancePage.varianttype("G Variant"); 
    }

    @Test(priority = 14)
    public void testCarOwnerNameEntry() {
        carInsurancePage.namevalue("John Doe");  
    }

    @Test(priority = 15)
    public void testCarOwnerMobileEntry() {
        carInsurancePage.mobilevalue("9876543210");  
    }

    @Test(priority = 16)
    public void testErrorMessageRetrieval() {
        System.out.println("Error Message: " + carInsurancePage.getmsg());
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
