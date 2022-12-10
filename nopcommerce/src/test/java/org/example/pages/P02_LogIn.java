package org.example.pages;

import io.cucumber.java.en.When;
import org.example.stepCodes.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P02_LogIn {



    public WebElement usernameEle(WebDriver driver){
        By username =By.id("Email");
        return driver.findElement(username);
    }

    public WebElement passwordEle(WebDriver driver){

        return driver.findElement(By.name("Password"));
    }
    public void loginSteps (String us, String ps,WebDriver driver) {
        usernameEle(driver).clear();
        usernameEle(driver).sendKeys(us);
        passwordEle(driver).click();
        passwordEle(driver).sendKeys(ps);
    }
    public WebElement tagMyAcc(WebDriver driver)
    {
        return driver.findElement(By.className("ico-account"));
    }

    public WebElement rejectMSG(WebDriver driver)
    {
        return driver.findElement(By.className("message-error"));
    }
    public WebElement forgotBtn(WebDriver driver){
        return driver.findElement(By.xpath("//a[@href='/passwordrecovery']"));
    }

}
