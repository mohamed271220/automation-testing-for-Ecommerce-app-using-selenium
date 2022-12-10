package org.example.pages;

import org.example.stepCodes.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P07_Order {
    WebDriver driver= Hooks.driver;

    public WebElement checkBox(){
       return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[3]/div[2]/div[3]/input"));
    }
    public WebElement checkoutBtn(){
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[3]/div[2]/div[4]/button"));
    }
    public WebElement country()
    {
        return driver.findElement(By.id("BillingNewAddress_CountryId"));
    }
   public WebElement city(){
        return  driver.findElement(By.id("BillingNewAddress_City"));
   }
    public WebElement address1(){
        return  driver.findElement(By.id("BillingNewAddress_Address1"));
    }
    public WebElement zipCode(){
        return  driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
    }
    public WebElement phoneNum(){
        return driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
    }
    public WebElement continueBtn(){
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/div/button[4]" ));
    }
    public WebElement shippingCheckBox(){
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[3]/div[2]/form/div[1]/div/div/ul/li[2]/div[1]/input"));
    }
    public WebElement continueBtn2(){
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[3]/div[2]/form/div[2]/button" ));
    }
    public WebElement continueBtn3(){
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[4]/div[2]/div/button" ));
    }
    public WebElement continueBtn4(){
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[5]/div[2]/div/button" ));
    }
    public WebElement lastCtnBtn(){
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[6]/div[2]/div[2]/button"));
    }
    public WebElement successMSG(){
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]/strong"));
    }
    public WebElement lastLastBtn(){
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[3]/button"));
    }
}