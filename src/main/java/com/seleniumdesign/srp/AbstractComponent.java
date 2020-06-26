package com.seleniumdesign.srp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Nikhil Bisht
 * @date 26-06-2020
 */
public abstract class AbstractComponent {
    protected final WebDriverWait wait;

    public AbstractComponent(final WebDriver driver) {
        this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

    public abstract boolean isDisplayed();
}
