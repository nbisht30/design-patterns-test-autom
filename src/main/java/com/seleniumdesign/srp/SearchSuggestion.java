package com.seleniumdesign.srp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * @author Nikhil Bisht
 * @date 26-06-2020
 */
public class SearchSuggestion extends AbstractComponent {

    @FindBy(css = "li.sbct")
    List<WebElement> suggestions;

    private WebDriverWait wait;

    public SearchSuggestion(final WebDriver driver) {
        this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

    public void clickSuggestionByIndex(int index) {
        this.suggestions.get(index).click();
    }

    public boolean isDisplayed() {
        return this.wait.until(var -> this.suggestions.size() > 5);  //Using lambda
    }
}
