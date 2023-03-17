package org.com.ita.test.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DesktopsPage extends HomePage{


    @FindBy(xpath = "//select[@id='products-pagesize']")
    public WebElement display;
    @FindBy(xpath = "//*[@id='products-pagesize']/option[1]")
    public WebElement itemsAmount;
    @FindBy(xpath = "//select[@id='products-orderby']")
    public WebElement itemsSort;
    @FindBy(xpath = "//*[@id='products-orderby']/option[5]")
    public WebElement fromHighToLow;

    @FindBy(xpath = "//input[@class='button-2 product-box-add-to-cart-button']")
     public WebElement chosenItem;
    public DesktopsPage(WebDriver driver) {super(driver);}

    public DesktopsPage displayElements(){
        display.click();
        itemsAmount.click();
        return new DesktopsPage(driver);
    }

    public DesktopsPage sortItems(){
       itemsSort.click();
       fromHighToLow.click();
        return new DesktopsPage(driver);
    }

    public ProductPage chooseItem(){
        chosenItem.click();
        return new ProductPage(driver);
    }

}
