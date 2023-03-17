package org.com.ita.test.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends HomePage{

    @FindBy(xpath = "//input[@class ='button-1 add-to-cart-button']")
    public WebElement addToCard;
    @FindBy(xpath = "//span[@class ='cart-label']")
    public WebElement shoppingCard;
    @FindBy(xpath = "//input[@id='product_attribute_74_5_26_82']")
    public WebElement fastProcessor;
    @FindBy(xpath = "//input[@id='product_attribute_74_6_27_85']")
    public WebElement ram;
    @FindBy(xpath = "//input[@id='product_attribute_74_8_29_88']")
    public WebElement imageViewer;
      @FindBy(xpath = "//input[@id='product_attribute_74_8_29_89']")
    public WebElement officeSuite;
   @FindBy(xpath = "//input[@id='product_attribute_74_8_29_90']")
    public WebElement otherOfficeSuite;

    public ProductPage(WebDriver driver) {super(driver);}

    public ProductPage addChosenItemToCard(){
        addToCard.click();
        return new ProductPage(driver);
    }
    public ShoppingCardPage openShoppingCard(){
        shoppingCard.click();
        return new ShoppingCardPage(driver);
    }

    public ProductPage chooseFastProcessor(){
        fastProcessor.click();
        return this;
    }
    public ProductPage chooseRAM(){
        ram.click();
        return this;
    }
    public ProductPage chooseAllSoftware(){
        imageViewer.click();
        officeSuite.click();
        otherOfficeSuite.click();
        return this;
    }
}
