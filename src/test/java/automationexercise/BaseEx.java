package automationexercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseEx {

        WebDriver driver;
        String url = "https://automationexercise.com/login";

        @BeforeMethod
        public void setUp () {
            driver = new ChromeDriver();
            driver.navigate().to(url);
        }
            @AfterMethod
            public void quit () {
                driver.quit();
            }

    }
