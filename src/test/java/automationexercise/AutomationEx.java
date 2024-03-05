package automationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutomationEx extends BaseEx {

    String expectedPrice = "Rs. 1000";
    String productName = "Sleeveless Dress";

    String validUserName= "esnoad123@yahoo.com";
    String validPassword= "Vois_246800";

    By product = By.xpath("//p[text()=\""+productName+"\"][1]");
    By productPrice = By.xpath("(//h2[text()='Rs. 1000'])[1]");
    By username= By.name("email");
    By password = By.name("password");
    By loginBtn = By.xpath("//button[@class=\"btn btn-default\"]");






    @Test
    public void validateProductPrice() {
        driver.findElement(username).sendKeys(validUserName);
        driver.findElement(password).sendKeys(validPassword);
        driver.findElement(loginBtn).click();
        driver.findElement(product).click();
        String actualValue = driver.findElement(productPrice).getText();
        Assert.assertEquals(actualValue,expectedPrice);


    }



}
