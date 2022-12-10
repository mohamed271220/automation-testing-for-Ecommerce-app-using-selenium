package org.example.stepCodes;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_LogIn;
import org.example.pages.P03_resetPassword;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class D03_ResetPasswordCode {
    WebDriver driver=Hooks.driver;
    P02_LogIn login=new P02_LogIn();
    P03_resetPassword resetPassword =new P03_resetPassword();
    @When("user click on the forgot password")
    public void forgotPasswordBtn()
    {
       login.forgotBtn(driver).click();
    }
    @And("^user enters a valid \"(.*)\"$")
            public void enterEmail(String email){
            resetPassword.emailEle(driver).sendKeys(email);
            }
   @And("user press on recover button")
    public void recover_Button() throws InterruptedException {
       resetPassword.emailEle(driver).sendKeys(Keys.ENTER);
        Thread.sleep(300);
    }

 @Then ("instruction message is displayed")
    public void instructionMSG()
 {
     SoftAssert softAssert=new SoftAssert();
     String actualResult = resetPassword.insMSG(driver).getText();
     String expectedResult="Email with instructions has been sent to you.";
     System.out.println(actualResult+" "+expectedResult);
     softAssert.assertTrue(actualResult.contains(expectedResult));
        softAssert.assertAll();
 }


}
