package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WT_LoginPage {
    public WT_LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "username")
    public WebElement UserName;
    @FindBy(name = "password")
    public WebElement Password;
    @FindBy(xpath = "//button[.='Login']")
    public WebElement LoginBtn;

    public void login(){
        this.UserName.sendKeys("Test");
       this.Password.sendKeys("Tester");
        this.LoginBtn.click();
    }
    public void login(String user, String pass){
        this.UserName.sendKeys(user);
        this.Password.sendKeys(pass);
        this.LoginBtn.click();
    }
}
