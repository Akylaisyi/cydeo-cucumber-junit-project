package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class WT_ViewAllOrdersPage {
    public WT_ViewAllOrdersPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
