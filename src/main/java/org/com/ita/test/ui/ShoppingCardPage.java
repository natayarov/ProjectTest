package org.com.ita.test.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCardPage extends HomePage{

    @FindBy(xpath = "//a[@class = 'product-name']")
    public WebElement productName;
     @FindBy(xpath = "//span[@class = 'product-unit-price']")
    public WebElement productPrice;

  @FindBy(xpath = "//input[@name='removefromcart']")
    public WebElement removeProduct;

  @FindBy(xpath = "//input[@name='updatecart']")
    public WebElement updateCard;

  @FindBy(xpath = "//div[@class='order-summary-content']")
    public WebElement orderSummary;



    public ShoppingCardPage(WebDriver driver) {
        super(driver);
    }
    public String getProductName() {
        return productName.getText();
    }
    public String getProductPrice() {
        return productPrice.getText();
    }
    public ShoppingCardPage removeProductFromCard(){
        removeProduct.click();
        updateCard.click();
        return new ShoppingCardPage(driver);
    }
    public String getOrderInfo(){
        return orderSummary.getText();

    }
}
