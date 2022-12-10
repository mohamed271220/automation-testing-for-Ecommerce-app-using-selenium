package org.example.stepCodes;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.P07_Order;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D12_CreateAnOrder {
P07_Order order =new P07_Order();
    @And("user checks terms of service")
    public void checkBox()
    {
        order.checkBox().click();
    }

    @And("use clicks on the checkout button")
    public void useClicksOnTheCheckoutButton() {
        order.checkoutBtn().click();
    }

    @And("user fills the shipping info")
    public void userFillsTheShippingInfo() {
        Select s=new Select(order.country());
        s.selectByValue("186");
        order.city().sendKeys("PortSaid");
        order.address1().sendKeys("3rd 25 mohamed-ali st");
        order.zipCode().sendKeys("82381");
        order.phoneNum().sendKeys("0122232323");
        order.continueBtn().click();
        order.shippingCheckBox().click();
        order.continueBtn2().click();
        order.continueBtn3().click();
        order.continueBtn4().click();
        order.lastCtnBtn().click();
    }

    @Then("verify the message that appeard")
    public void verifyTheMessageThatAppeard() {
        String actualResult=order.successMSG().getText();
        Assert.assertEquals(actualResult,"Your order has been successfully processed!");
    }
}
