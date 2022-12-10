package org.example.pages;

import org.example.stepCodes.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P06_SubCategory {
WebDriver driver= Hooks.driver;
    public WebElement sortByList()
    {
        return driver.findElement(By.id("products-orderby"));
    }
}
