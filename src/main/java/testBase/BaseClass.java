package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
    public WebDriver driver;

    public BaseClass() {
        driver = new EdgeDriver();
        driver.get("https://policybazaar.com/");  
        driver.manage().window().maximize();
    }
}
