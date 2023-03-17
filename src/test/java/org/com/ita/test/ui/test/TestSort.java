package org.com.ita.test.ui.test;

import org.com.ita.test.ui.BaseTestRunner;
import org.com.ita.test.ui.HomePage;
import org.com.ita.test.ui.ShoppingCardPage;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestSort extends BaseTestRunner {


    @BeforeMethod
    public void setUp() {
        setDriver();
    }

    @Test
    public void addToCardSortedItem(){
        ShoppingCardPage product = new HomePage(driver)
             .openDesktops()
             .displayElements()
             .sortItems()
             .chooseItem()
             .addChosenItemToCard()
             .openShoppingCard();
     Assert.assertEquals(product.getProductName(),"Build your own expensive computer");
 }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
