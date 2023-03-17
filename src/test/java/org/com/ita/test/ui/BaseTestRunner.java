package org.com.ita.test.ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class BaseTestRunner {
    protected WebDriver driver;
    @BeforeSuite
    public void initDriver() {
        WebDriverManager.chromedriver().setup();
    }

    public void setDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        //options.addArguments("--headless");
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--window-size=1920,1080", "--no-sandbox", "'--disable-dev-shm-usage");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demowebshop.tricentis.com/desktops?pagesize=4&orderby=11");
    }

    @AfterSuite
    public void quiteDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
