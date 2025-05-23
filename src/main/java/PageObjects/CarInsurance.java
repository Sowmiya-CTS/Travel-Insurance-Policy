package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarInsurance {
	WebDriver driver;
	
	public CarInsurance(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	

	@FindBy(xpath="//div[@class='shadowHandlerBox']//i[@class='icon-bg homeIconsBg car-insurance']") WebElement car;
	
	@FindBy(xpath="//input[@id='regNoTextBox']") WebElement carno;
	
	@FindBy(xpath="//span[@class='CarRegDetails_blueTextButton__P1blP blueTextButton fontMedium']") WebElement clickon;
	
	@FindBy(xpath="//input[@placeholder='Search City']") WebElement city;
	
	@FindBy(xpath="//input[@placeholder='Search Car Make']") WebElement brand;
	
	@FindBy(xpath="//input[@placeholder='Search Car Model']") WebElement model;
	
	@FindBy(xpath="//li[text()='Petrol']") WebElement fuelpet;
	
	@FindBy(xpath="//li[text()='CNG']") WebElement fuelcng;
	
	@FindBy(xpath="//li[text()='Electric']") WebElement fuelele;
	
	@FindBy(xpath="//li[text()='External CNG Kit']") WebElement fuelext;
	
	@FindBy(xpath="//input[@placeholder='Search Car Vaiants']") WebElement variants;
	
	@FindBy(id="name-form-control") WebElement name;
	
	@FindBy(id="mobile-form-control") WebElement mobile;
	
	@FindBy(xpath="//div[@class='errorMsg']") WebElement message;
	
	
	public void carinsuranceclick() {
		car.click();
	}
	
	public void detailsfill() {
		clickon.click();
	}
	
	public void brandvalue(String brandname) {
		brand.sendKeys(brandname);
	}
	
	public void modelvalue(String modelname) {
		model.sendKeys(modelname);
	}
	
	public void fueltype(String fuel) {
		if(fuel.equalsIgnoreCase("petrol")) {
			fuelpet.click();
		}
		else if(fuel.equalsIgnoreCase("cng")) {
			fuelcng.click();
		}
		else if(fuel.equalsIgnoreCase("Electric")) {
			fuelele.click();
		}
		else if(fuel.equalsIgnoreCase("External CNG Kit")) {
			fuelext.click();
		}
	}
	
	public void varianttype(String variantname) {
		variants.sendKeys(variantname);
	}
	
	public void namevalue(String personname) {
		name.sendKeys(personname);
	}
	
	public void mobilevalue(String mobilenumber) {
		mobile.sendKeys(mobilenumber);
	}
	
	public String getmsg() {
		String error=message.getText();
		return error;
	}
}
