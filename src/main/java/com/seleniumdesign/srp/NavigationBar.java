package com.seleniumdesign.srp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Nikhil Bisht
 * @date 26-06-2020
 */
public class NavigationBar extends AbstractComponent {

    @FindBy(id = "hdtb")
    private WebElement navigationBar;

    @FindBy(linkText = "Images")
    private WebElement images;

    @FindBy(linkText = "News")
    private WebElement news;

    public NavigationBar(final WebDriver driver) { // Initialize any WebDriver
        super(driver);
    }

    public void goToImages() {
        this.images.click();
    }

    public void goToNews() {
        this.news.click();
    }

    public boolean isDisplayed() {
        return this.wait.until(var -> this.navigationBar.isDisplayed());
    }
}
