package org.example.stepCodes;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P04_HomePage;
import org.example.pages.P05_searchedPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D04_search {

    P04_HomePage homePage =new P04_HomePage();
    P05_searchedPage searchPage=new P05_searchedPage();

    @Given("user clicks on the search bar and writes {string}")
    public void userClicksOnTheSearchBarAndWrites(String product) {
        homePage.searchBar().click();
        homePage.searchBar().sendKeys(product);

    }

    @When("user click on search button")
    public void userClickOnSearchButton() {
        homePage.searchBar().sendKeys(Keys.ENTER);
        
    }
        SoftAssert softAssert=new SoftAssert();

    @Then("all product that showed up contan the product word {string}")
    public void allProductThatShowedUpContanTheProductWord(String product) {
            for (int x = 0; x < searchPage.productsShowdUp().size(); x++) {
                String value =  searchPage.productsShowdUp().get(x).getText();
                System.out.println("the word is");
                System.out.println(value);
                softAssert.assertTrue(value.toLowerCase().contains(product));
            }

        }


    @And("click on the only product that showed up")
    public void clickOnTheOnlyProductThatShowedUp() {

        for ( int x = 0; x < searchPage.productsShowdUp().size(); x++) {
            searchPage.productsShowdUp().get(x).getText();
        }

        softAssert.assertEquals(searchPage.productsShowdUp().size()==1,true);
            searchPage.productphoto().click();

    }


    @Then("the search sku matches the {string} sku")
    public void theSearchSkuMatchesTheSku(String product) {

        String actualResult=searchPage.productSku().getText();
        softAssert.assertTrue(actualResult.contains(product));
        System.out.println(actualResult+"  "+product);
        softAssert.assertAll();
    }
}
