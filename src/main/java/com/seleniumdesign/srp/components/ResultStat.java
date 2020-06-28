package com.seleniumdesign.srp.components;

import com.seleniumdesign.srp.base.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Nikhil Bisht
 * @date 26-06-2020
 */
public class ResultStat extends AbstractComponent {

    @FindBy(id = "result-stats")
    private WebElement resultStat;

    public ResultStat(final WebDriver driver) { // Initialize any WebDriver
        super(driver);
    }

    public String getStat() {
        return this.resultStat.getText();
    }

    public boolean isDisplayed() {
        return this.wait.until(var -> this.resultStat.isDisplayed());
    }
}
