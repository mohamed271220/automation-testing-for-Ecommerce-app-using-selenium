package org.example.stepCodes;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P04_HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.Random;

public class D06_catagoryHovercode {
    P04_HomePage homePage=new P04_HomePage();

String catText=null;
    @Given("user hover over a random main category and click on a subcategorey")
    public  void hoverFunc(){
        int randomNumber= new Random().nextInt(3); //random num from 0 to 2
        int subclassNum= new Random().nextInt(3);
        //hovering on the categorey
        Actions hover =new Actions(Hooks.driver);
        hover.moveToElement(homePage.categoryList().get(randomNumber)).perform();
        catText=homePage.subclasses(randomNumber,subclassNum).getText();
        homePage.subclasses(randomNumber,subclassNum).click();
        System.out.println(homePage.subclasses(randomNumber,subclassNum));

    }


    @Then("the word on the top of the page matches the categorey name")
    public void theWordOnTheTopOfThePageMatchesTheCategoreyName() {
       String actualResult=homePage.title().getText();
        Assert.assertTrue(actualResult.toLowerCase().trim().contains(catText.toLowerCase().trim()));
        System.out.println(actualResult +"  "+catText);

    }
}
