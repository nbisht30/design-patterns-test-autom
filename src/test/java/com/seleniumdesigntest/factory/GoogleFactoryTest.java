package com.seleniumdesigntest.factory;

import com.seleniumdesign.factory.GoogleHindi;
import com.seleniumdesign.factory.GoogleMarathi;
import com.seleniumdesigntest.base.BaseTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author Nikhil Bisht
 * @date 29-06-2020
 */
public class GoogleFactoryTest extends BaseTest {
    private GoogleHindi googleHindi;
    private GoogleMarathi googleMarathi;

    @BeforeTest
    public void setupPages() {
        this.googleMarathi = new GoogleMarathi(driver);
    }

    @Test()
    public void googleWorkflow() {
        googleMarathi.launchSite();
        googleMarathi.search("Mumbai");
        System.out.println(googleMarathi.getResultsCount());
    }
}
