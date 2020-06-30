package com.seleniumdesign.factory;

/**
 * @author Nikhil Bisht
 * @date 30-06-2020
 */
public abstract class GooglePage {

    public abstract void launchSite();

    public abstract void search(String keyword);

    public abstract int getResultsCount();
}
