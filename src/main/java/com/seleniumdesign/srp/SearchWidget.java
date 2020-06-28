package com.seleniumdesign.srp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Nikhil Bisht
 * @date 26-06-2020
 */
public class SearchWidget extends AbstractComponent {

    @FindBy(name = "q")
    private WebElement searchBox;

    public SearchWidget(final WebDriver driver) { // Initialize any WebDriver
        super(driver);
    }

    public void enter(String keyword) {
        this.searchBox.clear();
        this.searchBox.sendKeys(keyword);
    }

    public boolean isDisplayed() {
        /*this.wait.until(ExpectedConditions.visibilityOf(this.searchBox));
        return this.searchBox.isDisplayed();*/
        // Using Java 8
        return this.wait.until(var -> this.searchBox.isDisplayed());
    }
}
