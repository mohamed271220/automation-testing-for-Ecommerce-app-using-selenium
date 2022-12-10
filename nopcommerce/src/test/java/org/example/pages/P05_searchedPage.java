package org.example.pages;

import org.example.stepCodes.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P05_searchedPage {
    WebDriver driver = Hooks.driver;

    public List<WebElement> productsShowdUp()
    {
        List<WebElement> products = driver.findElements(By.className("product-title"));
        return products;
    }
    public  WebElement productSku(){
        return driver.findElement(By.className("sku"));
    }
    public  WebElement productphoto(){
        return driver.findElement(By.className("product-title"));
    }

}
