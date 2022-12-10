package org.example.stepCodes;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P04_HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D10_WishList {

    WebDriver driver = Hooks.driver;
    P04_HomePage homePage = new P04_HomePage();
    SoftAssert softAssert = new SoftAssert();
    String currentURL = null;
    String productsSku=null;

    @Given("user clicks on the product to add to wishlist")
    public void itemOnTheHomePage(){
        homePage.addToCartBtn().click();
    }


    @When("user clicks on the add to wishlist on the product page")
    public void userClciksOnTheAddToWishlistButtonOnTheProductPage()  {
        homePage.innerWishListBtn().click();
        productsSku=homePage.productSku().getText();

    }

    @Then("green message appears")
    public void greenMessageAppearsAndUserClickOnShoppingCartLink() {
        String actualColor = homePage.successMSG().getCssValue("background-color");
        String actualColorAsHex= Color.fromString(actualColor).asHex();
        String actualMSG=homePage.successMSG().getText();
        softAssert.assertEquals(actualColorAsHex,"#4bb07a","NO MATCH");
        softAssert.assertTrue(actualMSG.contains("The product has been added to your wishlist"));
        softAssert.assertAll();
    }

    @And("green message appears and user wait till it disappear")
    public void greenMessageAppearsAndUserWaitTillItDisapear()  {
        Duration d= Duration.ofMillis(3000);
        WebDriverWait wait=new WebDriverWait(driver,d);
        wait.until(ExpectedConditions.elementToBeClickable(homePage.wishListBtn()));
    }

    @And("user clicks on the wishlist button on the top right")
    public void userClicksOnTheShoppingCartButtonOnTheTopRight() {
        homePage.wishListBtn().click();
    }

    @Then("the user should be able to see the sku code and the quantity for that product in the wishlist")
    public void theUserShouldBeAbleToSeeTheSkuCodeAndTheQuantityForTheProduct() {
        String actualsku=homePage.actualSkuvalueWL().getText();
        softAssert.assertEquals(actualsku.contains(productsSku),true);
        String actualQty=homePage.productQtyWL().getAttribute("value");
        softAssert.assertEquals(actualQty,"2");
        System.out.println(actualQty+ "  "+productsSku+"  "+actualsku);
        softAssert.assertAll();

    }
}
