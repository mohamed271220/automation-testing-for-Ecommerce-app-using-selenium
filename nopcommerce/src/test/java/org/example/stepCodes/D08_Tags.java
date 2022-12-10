package org.example.stepCodes;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P04_HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.Random;

public class D08_Tags {
WebDriver driver=Hooks.driver;
P04_HomePage homePage=new P04_HomePage();
SoftAssert softAssert=new SoftAssert();
String currentURL=null;
    @Given("user goes to a category and click on a subcategorey")
    public void userGoesToACategoryAndClickOnASubcategorey() {

            int randomNumber= 1;
            int subclassNum= 1;

            Actions hover =new Actions(Hooks.driver);
            hover.moveToElement(homePage.categoryList().get(randomNumber)).perform();
            homePage.subclasses(randomNumber,subclassNum).click();
            System.out.println(homePage.subclasses(randomNumber,subclassNum));

        }
@When("user clicks on any tag {string}")
    public void clicksOnRandomTag(String word)
    {

        homePage.tagSelector(word).click();

            softAssert.assertTrue((driver.getCurrentUrl().contains(word)));

    }

    @Then("the page should take the user to that {string}")
    public void thePageShouldTakeTheUserToThatTag(String word) {

        softAssert.assertAll();
    }

    }

