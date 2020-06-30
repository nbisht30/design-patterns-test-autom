package com.seleniumdesign.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
/*
Note: Here we're not implementing SRP because aim is to just learn the factory pattern.
 */

/**
 * @author Nikhil Bisht
 * @date 30-06-2020
 */
public class GoogleEnglish extends GooglePage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(name = "q")
    private WebElement searchBox;

    @FindBy(name = "btnk")
    private WebElement searchBtn;

    @FindBy(css = "div.rc")
    private List<WebElement> results;

    public GoogleEnglish(final WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

    @Override
    public void launchSite() {
        this.driver.get("https://www.google.com");
    }

    @Override
    public void search(String keyword) {
        this.searchBox.sendKeys(keyword);
        this.searchBtn.click();
    }

    @Override
    public int getResultsCount() {
        this.wait.until(var -> this.results.size() > 1);
        return this.results.size();
    }
}
