package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P03_resetPassword {

    public WebElement emailEle(WebDriver driver){

        return driver.findElement(By.className("email"));
    }
   public WebElement insMSG(WebDriver driver){

        return driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div/p"));
   }
}
