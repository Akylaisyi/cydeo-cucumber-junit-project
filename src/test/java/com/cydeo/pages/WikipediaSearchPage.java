package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaSearchPage {
    @FindBy(xpath = "//*[@id='searchInput']")
    public WebElement inputSearch;

    @FindBy(xpath = "//i[@class='sprite svg-search-icon']")
    public WebElement iSearchInputButton;
    public WikipediaSearchPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
