package org.example.stepCodes;

import java.text.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P04_HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.Random;


public class D09_ShoppingCart {
    WebDriver driver = Hooks.driver;
    P04_HomePage homePage = new P04_HomePage();
    SoftAssert softAssert = new SoftAssert();
    String currentURL = null;
    String productsSku=null;
@Given("user clicks on the product")
    public void itemOnHomePage(){
    homePage.addToCartBtn().click();
}


    @When("user clicks on the add to cart button on the product page")
    public void userClciksOnTheAddToCartButtonOnTheProductPage()  {
        homePage.innerAddToCartBtn().click();
        productsSku=homePage.productSku().getText();

    }

    @Then("green message appears and user click on shopping cart link")
    public void greenMessageAppearsAndUserClickOnShoppingCartLink() {
        String actualColor = homePage.successMSG().getCssValue("background-color");
        String actualColorAsHex= Color.fromString(actualColor).asHex();
        String actualMSG=homePage.successMSG().getText();
        softAssert.assertEquals(actualColorAsHex,"#4bb07a","NO MATCH");
        softAssert.assertTrue(actualMSG.contains("The product has been added to your shopping cart"));
        softAssert.assertAll();
}

    @And("green message appears and user wait till it dissapear")
    public void greenMessageAppearsAndUserWaitTillItDissapear()  {
        Duration d= Duration.ofMillis(3000);
    WebDriverWait wait=new WebDriverWait(driver,d);
        wait.until(ExpectedConditions.elementToBeClickable(homePage.shoppingCartBtn()));
    }

    @And("user clicks on the shopping cart button on the top right")
    public void userClicksOnTheShoppingCartButtonOnTheTopRight() {
        homePage.shoppingCartBtn().click();
    }

    @Then("the user should be able to see the sku code and the quantity for that product")
    public void theUserShouldBeAbleToSeeTheSkuCodeAndTheQuantityForThatProduct() {
      String actualsku=homePage.actualSkuvalue().getText();
      softAssert.assertEquals(actualsku.contains(productsSku),true);
      String actualQty=homePage.productQty().getAttribute("value");
      softAssert.assertEquals(actualQty,"2");
        System.out.println(actualQty+ "  "+productsSku+"  "+actualsku);
      softAssert.assertAll();

    }
    }