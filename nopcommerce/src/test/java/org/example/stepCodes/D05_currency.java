package org.example.stepCodes;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P04_HomePage;
import org.example.pages.P05_searchedPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D05_currency {
    WebDriver driver=Hooks.driver;

    SoftAssert softAssert=new SoftAssert();
    P04_HomePage homePage=new P04_HomePage();
    P05_searchedPage searchPage=new P05_searchedPage();
    @Given("user selects euro's sign")
    public void select(){

        Select select=new Select(homePage.curList());
        select.selectByVisibleText("Euro");

    }


    @Then("Euro sign is on every product price on home page")
    public void euroSign() {
        for (int x = 1; x < homePage.currency().size(); x++) {
            String value = homePage.currency().get(x).getText();
            System.out.println(value);

            softAssert.assertTrue(value.contains("€"));
            System.out.println("currency");
        }
        softAssert.assertAll();
    }

}
