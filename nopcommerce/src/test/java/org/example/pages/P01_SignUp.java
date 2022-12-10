package org.example.pages;

import org.example.stepCodes.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

//POM design pat
public class P01_SignUp {


    public WebElement genderType(WebDriver driver){

        return driver.findElement(By.id("gender-male"));
    }
    public WebElement firstname(WebDriver driver){
        By username =By.id("FirstName");
        return driver.findElement(username);
    }
    public WebElement secondName(WebDriver driver){
        By username =By.id("LastName");
        return driver.findElement(username);
    }

    public WebElement dayeSelector(WebDriver driver ){

        WebElement dayS=driver.findElement(By.name("DateOfBirthDay"));
        Select s =new Select(dayS);
        s.selectByValue("27");
        System.out.println((dayS));
        return dayS;
    }

    public WebElement monthSelector(WebDriver driver ){

        WebElement monthS=driver.findElement(By.name("DateOfBirthMonth"));
        Select s =new Select(monthS);
        s.selectByValue("12");
        return monthS;
    }
    public WebElement yearSelector(WebDriver driver ){

        WebElement yearS=driver.findElement(By.name("DateOfBirthYear"));
        Select s =new Select(yearS);
        s.selectByValue("2001");
        return yearS;
    }

    public  WebElement emailElement(WebDriver driver)
    {
//        By email =;
        WebElement emailS=driver.findElement(By.xpath("//*[@id=\"Email\"]"));
        System.out.println(emailS);
        return emailS;
    }
    public WebElement passwordElement(WebDriver driver)
    {

        return driver.findElement(By.id("Password"));
    }
    public WebElement confirmPWElement(WebDriver driver)
    {

        return driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement rigButton(WebDriver driver)
    {

        return driver.findElement(By.id("register-button"));
    }
    public WebElement successMessage(WebDriver driver)
    {
        return driver.findElement(By.className("result"));
    }

}
