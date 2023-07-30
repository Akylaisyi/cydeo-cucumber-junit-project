package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BingSearchPage {
public BingSearchPage(){
    PageFactory.initElements(Driver.getDriver(), this);
}

@FindBy(id = "sb_form_q")
    public WebElement searchBox;
}
