package com.seleniumdesigntest.base;

import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

/**
 * @author Nikhil Bisht
 * @date 28-06-2020
 */
public class BaseTest {

    protected WebDriver driver;

    @BeforeTest
    public void setupDriver() {
//        System.setProperty("webdriver.gecko.driver", "C:\\AutomSoft\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\AutomSoft\\chromedriver.exe");
        this.driver = new ChromeDriver();
    }

    @AfterTest
    public void quitDriver() {
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        this.driver.quit();
    }
}
