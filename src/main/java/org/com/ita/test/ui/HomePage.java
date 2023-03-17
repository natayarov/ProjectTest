package org.com.ita.test.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//a[@href='/computers']")
    public WebElement computers;

    @FindBy(xpath = "//a[@href='/desktops']")
    public WebElement desktops;

    public HomePage(WebDriver driver) {super(driver);}

    public DesktopsPage openDesktops(){
        Actions actions = new Actions(driver);
        wait.visibility(computers);
        actions.moveToElement(computers).moveToElement(desktops).click().perform();
        return new DesktopsPage(driver);
    }


}
