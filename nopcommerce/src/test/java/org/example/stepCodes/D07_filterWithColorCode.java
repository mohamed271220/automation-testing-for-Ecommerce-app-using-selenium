package org.example.stepCodes;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P06_SubCategory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D07_filterWithColorCode {
    WebDriver driver=Hooks.driver;

P06_SubCategory subCategoryPage=new P06_SubCategory();
SoftAssert softAssert=new SoftAssert();
    String currentUrl=null;
    @When("user clicks on the SortBy dropdown list user clicks on color")
    public void setColorSelect() {
         currentUrl=driver.getCurrentUrl();
        Select s=new Select(subCategoryPage.sortByList());
        List<WebElement> options=s.getOptions();
        int size = options.size();
        for(int i =0; i<size ; i++){
            String op = options.get(i).getText();
            System.out.println(op);
            softAssert.assertEquals(op == "Color", true);
            if(op == "Color"){
                options.get(i).click();
                break;
            }
        }
        }


    @Then("products should be resorted")
    public void productsShouldBeResorted() {
        softAssert.assertEquals(driver.getCurrentUrl()==currentUrl,false);
        softAssert.assertAll();
    }
}



