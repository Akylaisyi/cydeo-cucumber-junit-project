package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    public LibraryLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);}

        @FindBy(id = "inputEmail")
        public WebElement emailInput;

        @FindBy(id = "inputPassword")
        public WebElement password;

        @FindBy(xpath = "//button[.='Sign in']")
        public WebElement signInButton;

    public void login() {
        emailInput.sendKeys(ConfigurationReader.getProperty("lib22_user"));
        password.sendKeys(ConfigurationReader.getProperty("lib22_pass"));
        signInButton.click();
    }
    public void login2(String name, String passw) {
        emailInput.sendKeys(name);
        password.sendKeys(passw);
        signInButton.click();
    }
    }

