package org.example.stepCodes;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver=null;

    @Before
    public static void openDriver() throws InterruptedException { //command to work before testing
        System.setProperty("webdriver.chrome.driver","D:\\FWD\\P2ECommerceApp\\nopcommerce\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.navigate().to("https://demo.nopcommerce.com/");

    }
    @After
    public static void closeDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
