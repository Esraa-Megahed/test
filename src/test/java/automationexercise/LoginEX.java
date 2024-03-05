package automationexercise;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginEX extends BaseEx {
    String validUserName= "esnoad123@yahoo.com";
    String validPassword= "Vois_246800";

    String inValidUserName= "esnoad123@yahoo.com";
    String invalidPassword= "Vois_2468001";
    By username= By.name("email");
    By password = By.name("password");
    By loginBtn = By.xpath("//button[@class=\"btn btn-default\"]");
    By testElement = By.className("img-responsive");
    By errorButton = By.xpath("//p[text()=\"Your email or password is incorrect!\"]");

    @Test
    public void validLogin () {
        driver.findElement(username).sendKeys(validUserName);
        driver.findElement(password).sendKeys(validPassword);
        driver.findElement(loginBtn).click();
        boolean isDisplayed = driver.findElement(testElement).isDisplayed();
        Assert.assertTrue(isDisplayed);
    }
    @Test
    public void invalidLogin () {
        driver.findElement(username).sendKeys(inValidUserName);
        driver.findElement(password).sendKeys(invalidPassword);
        driver.findElement(loginBtn).click();
        boolean isDisplayed = driver.findElement(errorButton).isDisplayed();
        Assert.assertTrue(isDisplayed);
    }
}
