package org.com.ita.test.ui.test;

import org.com.ita.test.ui.BaseTestRunner;
import org.com.ita.test.ui.ProductPage;
import org.com.ita.test.ui.ShoppingCardPage;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestRemoveItem extends BaseTestRunner{


    @BeforeMethod
    public void setUp() {
        setDriver();
        driver.get("http://demowebshop.tricentis.com/build-your-own-expensive-computer-2");
    }

    @Test
    public void removeAddedItemFromCard(){

        ShoppingCardPage product = new ProductPage(driver)
                .chooseFastProcessor()
                .chooseRAM()
                .chooseAllSoftware()
                .addChosenItemToCard()
                .openShoppingCard();
        Assert.assertEquals(product.getProductName(),"Build your own expensive computer");
        Assert.assertEquals(product.getProductPrice(),"2105.00");
       ShoppingCardPage order = new ShoppingCardPage(driver)
                .removeProductFromCard();
        Assert.assertEquals(order.getOrderInfo(),"Your Shopping Cart is empty!");
    }


    @AfterSuite
    public void quiteDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
