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
public class GoogleHindi extends GoogleAbstractPage {

    protected WebDriverWait wait;

    @FindBy(name = "q")
    private WebElement searchBox;

    @FindBy(linkText = "हिन्दी")
    private WebElement linkText;

    @FindBy(className = "gNO89b")
    private WebElement searchBtn;

    @FindBy(css = "div.rc")
    private List<WebElement> results;

    public GoogleHindi(final WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

    @Override
    public void launchSite() {
        super.launchSite();
        this.linkText.click();
    }

    @Override
    public void search(String keyword) {
        this.searchBox.sendKeys(keyword);
        wait.until(var -> searchBtn.isDisplayed());
        this.searchBtn.click();
    }

    @Override
    public int getResultsCount() {
        this.wait.until(var -> this.results.size() > 1);
        return this.results.size();
    }
}
