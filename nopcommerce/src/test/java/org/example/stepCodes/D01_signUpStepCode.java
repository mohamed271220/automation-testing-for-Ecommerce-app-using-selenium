package org.example.stepCodes;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.pages.P01_SignUp;
import org.example.pages.P04_HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D01_signUpStepCode {
    WebDriver driver = Hooks.driver;
P01_SignUp signUp=new P01_SignUp();
P04_HomePage homePage=new P04_HomePage();
    @Given("user go to register page")
    public void signUpPage() throws InterruptedException {
        homePage.regLink().click();
        Thread.sleep(2000);
    }
    @When("user select a gender type")
    public void genderSelector(){
        signUp.genderType(driver).click();
}
    @And("user enter their first name \"(.*)\" and last name \"(.*)\"$")
     public void userFullName(String firstname ,String secondname){
        signUp.firstname(driver).clear();
        signUp.firstname(driver).sendKeys(firstname);
        signUp.secondName(driver).clear();
        signUp.secondName(driver).sendKeys(secondname);
    }

    @And ("user enter their date of birth")
    public void birthDateSelector() throws InterruptedException {
        signUp.dayeSelector(driver);
        signUp.monthSelector(driver);
        signUp.yearSelector(driver);
    }
    @And("^user enter an email \"(.*)\" field$")
    public void userEmail(String email) {

        signUp.emailElement(driver).sendKeys(email);
    }
    @And ("^user fill the Password fields \"(.*)\" \"(.*)\"$")
    public void passwordWriter(String pw1,String pw2)
    {
        signUp.passwordElement(driver).sendKeys(pw1);
        signUp.confirmPWElement(driver).sendKeys(pw2);
    }
    @And("user clicks on register button")
    public void clicksOnButton(){
        signUp.rigButton(driver).click();
    }
    @And("success message is displayed")
    public void success_signup()
    {
        SoftAssert soft=new SoftAssert();
        //1st assert
        String expectedResult="Your registration completed";
        String actualResult=signUp.successMessage(driver).getText();
        soft.assertTrue(actualResult.contains(expectedResult),"Message is incorrect");
        System.out.println(actualResult+" @ "+expectedResult);

        //2nd assert
        String expectedColor ="rgba(76, 177, 124, 1)";
        String actualColor=signUp.successMessage(driver).getCssValue("color");
        soft.assertTrue(actualColor.contains(expectedColor),"Color is incorrect");
        System.out.println(actualColor+" @ "+expectedColor);
        //assert all
        soft.assertAll();
    }
}
