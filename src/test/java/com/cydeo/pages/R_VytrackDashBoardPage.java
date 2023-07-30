package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Base64;
import java.util.List;

public class R_VytrackDashBoardPage {

    public R_VytrackDashBoardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[@class='title title-level-1']")
    public List<WebElement> allModules;
    @FindBy(css ="#user-menu>a")
    public WebElement userinfo;
}
