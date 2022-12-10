package org.example.pages;

import org.example.stepCodes.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class P04_HomePage {
    WebDriver driver = Hooks.driver;

    public WebElement loginLink() {
        return driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
    }

    public WebElement regLink() {
        return driver.findElement(By.className("ico-register"));
    }

    public WebElement curList() {
        return driver.findElement(By.id("customerCurrency"));
    }

    public List<WebElement> currency() {
        List<WebElement> prices = driver.findElements(By.className("price"));
        return prices;
    }

    public WebElement searchBar() {

        return driver.findElement(By.id("small-searchterms"));
    }

    public List<WebElement> categoryList() {
        return driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a[href]"));
    }

    public WebElement subclasses(int catNum, int subclassNum) {
        subclassNum++;
        catNum++;
        return driver.findElement(By.cssSelector("body > div:nth-child(6) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(" + catNum + ") > ul:nth-child(3) > li:nth-child(" + subclassNum + ") > a:nth-child(1)"));
    }

    public WebElement title() {
        return driver.findElement(By.className("page-title"));

    }

    public WebElement tagSelector(String word) {

        return driver.findElement(By.cssSelector("a[href='/" + word + "']"));

    }

    public WebElement addToCartBtn() {

        return driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div[2]/div[3]/div[2]/button[1]"));
    }

    public WebElement innerAddToCartBtn() {
        return driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[9]/div[2]/button[1]"));

    }

    public WebElement successMSG() {
        return driver.findElement(By.className("bar-notification"));
    }

    public WebElement productSku() {
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[6]/div/span[2]"));
    }

    public WebElement shoppingCartBtn() {
        return driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]/span[1]"));
    }

    public WebElement actualSkuvalue() {
        return driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]"));

    }
    public WebElement actualSkuvalueWL() {
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[1]/table/tbody/tr/td[2]/span"));

    }
    public WebElement productQty() {
        return driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/input[1]"));
    }
    public WebElement productQtyWL() {
        return driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/input[1]"));
    }
    public WebElement innerWishListBtn() {
        return driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[10]/div[1]/button[1]"));

    }

    public WebElement wishListBtn() {
        return driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]/span[1]"));

    }
    public WebElement innerCompareListBtn() {
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[10]/div[2]/button"));

    }
    public WebElement anotherProduct(){
        return driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[3]/div[2]/div[2]/div[1]/div[1]/a[1]/img[1]"));
    }
    public WebElement innerCompareListBtnTo2ndEle() {
        return driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[9]/div[2]/button[1]"));
    }
    public WebElement compareListLink(){
        return driver.findElement(By.xpath(("/html/body/div[5]/div/p/a")));
    }
    public WebElement firstProductTitle(){
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[1]/h1"));
    }
    public WebElement firstProductTitle2(){
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[1]/h1"));
    }
    public WebElement productNameOnCompareList(){
        return driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[3]/a[1]"));

    }
    public WebElement productNameOnCompareList2(){
        return  driver.findElement((By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div/table/tbody/tr[3]/td[2]/a")));
    }
}
