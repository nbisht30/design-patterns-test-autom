package com.seleniumdesign.factory;

import org.openqa.selenium.WebDriver;

/**
 * @author Nikhil Bisht
 * @date 30-06-2020
 */
public abstract class GooglePage {

    protected WebDriver driver;  // protected so that child classes can access.

    public void launchSite() {
        this.driver.get("https://www.google.com");
    }

    public abstract void search(String keyword);

    public abstract int getResultsCount();
}
