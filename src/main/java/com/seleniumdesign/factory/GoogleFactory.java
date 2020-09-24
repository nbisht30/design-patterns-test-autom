package com.seleniumdesign.factory;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * @author Nikhil Bisht
 * @date 24-09-2020
 */
public class GoogleFactory {

    private static final Function<WebDriver, GooglePage> ENGLISH = (driver) -> new GoogleEnglish(driver);
    private static final Function<WebDriver, GooglePage> HINDI = (driver) -> new GoogleHindi(driver);
    private static final Function<WebDriver, GooglePage> MARATHI = (driver) -> new GoogleMarathi(driver);

    private static final Map<LocaleEnum, Function<WebDriver, GooglePage>> LOCALE_MAP = new HashMap<>();

    static {
        LOCALE_MAP.put(LocaleEnum.ENGLISH, ENGLISH);
        LOCALE_MAP.put(LocaleEnum.HINDI, HINDI);
        LOCALE_MAP.put(LocaleEnum.MARATHI, MARATHI);
    }

    /*
    Responsible for providing the instance.
    As, as user of the instance of any Google page you should
    not worry about how that object is created.
    */
    public static GooglePage get(LocaleEnum locale, WebDriver driver) {
        return LOCALE_MAP.get(locale).apply(driver);
    }

}
