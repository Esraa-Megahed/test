package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginProduct {
    WebDriver driver;
    By user= By.name("email");
    By password = By.name("password");
    By loginBtn = By.xpath("//button[@class=\"btn btn-default\"]");
    By errorButton = By.xpath("//p[text()=\"Your email or password is incorrect!\"]");
    public void login( String username,String Password){

        driver.findElement(user).sendKeys(username);
        driver.findElement(password).sendKeys(Password);
        driver.findElement(loginBtn).click();
    }

}
