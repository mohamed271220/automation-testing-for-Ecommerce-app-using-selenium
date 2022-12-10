package org.example.stepCodes;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.example.pages.P04_HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D11_CompareList {

    WebDriver driver = Hooks.driver;
    P04_HomePage homePage = new P04_HomePage();
    SoftAssert softAssert = new SoftAssert();
    String currentURL = null;
    String productsSku=null;
    String prouctTitle=null;
    String prouctTitle2=null;
    @Given("user clicks on the product to add to Compare")
    public void itemOnTheHomePage(){
        homePage.addToCartBtn().click();
        prouctTitle=homePage.firstProductTitle().getText();
    }


    @When("user clicks on the add to CompareList on the product page")
    public void userClciksOnTheAddToCompareListButtonOnTheProductPage()  {
        homePage.innerCompareListBtn().click();

    }
   @And("user chooses another product to compare them to each other and clicks on it")
    public void anotherProduct(){
       homePage.anotherProduct().click();
       prouctTitle2=homePage.firstProductTitle2().getText();
   }

    @And("user clicks on the add to CompareList on the product page on the new product")
    public void userClicksOnTheAddToCompareListOnTheProductPageOnTheNewProduct() {
        homePage.innerCompareListBtnTo2ndEle().click();
    }

    @And("green message appears conatains a confirmation message and link to that Compare list user clicks on that link")
    public void greenMessageAppearsConatainsAConfirmationMessageAndLinkToThatCompareListUserClicksOnThatLink() {
        String actualColor = homePage.successMSG().getCssValue("background-color");
        String actualColorAsHex= Color.fromString(actualColor).asHex();
        String actualMSG=homePage.successMSG().getText();
        softAssert.assertEquals(actualColorAsHex,"#4bb07a","NO MATCH");
        softAssert.assertTrue(actualMSG.contains("The product has been added to your product comparison"));
        homePage.compareListLink().click();
    }

    @Then("both products show up")
    public void bothProductsShowUp() {
        String actualReult=homePage.productNameOnCompareList().getText();
        softAssert.assertEquals(actualReult,prouctTitle);
        String actualReult2=homePage.productNameOnCompareList2().getText();
        softAssert.assertEquals(actualReult2,prouctTitle2);
        softAssert.assertAll();
    }
}
