package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeProduct {
    WebDriver driver;
    String productName = "Sleeveless Dress";
    By testElement = By.className("img-responsive");
    By product = By.xpath("//p[text()=\""+productName+"\"][1]");



    public void openProduct(){
        driver.findElement(product).click();
    }
}
