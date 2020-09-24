package com.seleniumdesign.factory;

import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;
/*
Note: Here we're not implementing SRP because aim is to just learn the factory pattern.
 */

/**
 * @author Nikhil Bisht
 * @date 30-06-2020
 */
class GoogleEnglish extends GooglePage {

    protected WebDriverWait wait;

    @FindBy(name = "q")
    private WebElement searchBox;

    @FindBy(name = "btnK")
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
        super.launchSite();
    }

    @Override
    public void search(String keyword) {
        for (char ch : keyword.toCharArray()) {
            Uninterruptibles.sleepUninterruptibly(50, TimeUnit.MILLISECONDS);
            this.searchBox.sendKeys(ch + "");
        }
        this.wait.until(var -> searchBtn.isDisplayed());
        this.searchBtn.click();
    }

    @Override
    public int getResultsCount() {
        this.wait.until(var -> this.results.size() > 1);
        return this.results.size();
    }
}
