package org.example.stepCodes;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_LogIn;
import org.example.pages.P04_HomePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_LogInStepCode {
    WebDriver driver=Hooks.driver;
    P02_LogIn logIn=new P02_LogIn();
    P04_HomePage homePage=new P04_HomePage();
    @Given("user go to login page")
    public void loginNav() throws InterruptedException {
        homePage.loginLink().click();
        Thread.sleep(2000);
    }
    @When("^user login with \"(.*)\" \"(.*)\" and \"(.*)\"$")
    public void valid_data(String validity,String username ,String password )
    {
        logIn.loginSteps( username,password,driver);
    }
    @And("user press on login button")
    public void login_Button() throws InterruptedException {
        logIn.passwordEle(driver).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }
    @Then("user login to the system successfully")
    public void validation(){
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com"),"Wrong Link");
        System.out.println(driver.getCurrentUrl());
        softAssert.assertTrue(logIn.tagMyAcc(driver).isDisplayed(),"Not Visible");
        System.out.println(logIn.tagMyAcc(driver).isDisplayed());
        softAssert.assertAll();
    }
    @Then("user could not login to the system")
    public void invalidation(){
        SoftAssert softAssert= new SoftAssert();
        String actualMSG=logIn.rejectMSG(driver).getText();
        String expectedMSG="Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        softAssert.assertTrue(actualMSG.contains(expectedMSG));
        System.out.println(actualMSG+" "+expectedMSG);
        //2nd assert
        String actualColor=logIn.rejectMSG(driver).getCssValue("color");
        String actualColorAsHex=Color.fromString(actualColor).asHex();
        String expectedColor="#e4434b";
        softAssert.assertTrue(actualColorAsHex.contains(expectedColor));
        System.out.println(actualColorAsHex+" "+expectedColor);

        softAssert.assertAll();
    }


    }


