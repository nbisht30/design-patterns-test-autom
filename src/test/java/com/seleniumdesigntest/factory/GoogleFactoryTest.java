package com.seleniumdesigntest.factory;

import com.seleniumdesign.factory.GoogleFactory;
import com.seleniumdesign.factory.GooglePage;
import com.seleniumdesign.factory.LocaleEnum;
import com.seleniumdesigntest.base.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author Nikhil Bisht
 * @date 29-06-2020
 */
public class GoogleFactoryTest extends BaseTest {
    private GooglePage googlePage;

    @Test(dataProvider = "getData")
    public void googleWorkflow(LocaleEnum locale, String keyword) {
        this.googlePage = GoogleFactory.init(locale, driver);
        googlePage.launchSite();
        googlePage.search(keyword);
    }

    @DataProvider
    public Object[][] getData() {
        return new Object[][]{
                {LocaleEnum.ENGLISH, "Selenium"},
                {LocaleEnum.MARATHI, "Selenium"},
                {LocaleEnum.HINDI, "Selenium"}
        };
    }
}
