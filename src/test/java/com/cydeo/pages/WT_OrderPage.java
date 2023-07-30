package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WT_OrderPage extends WT_BasePage{

    public WT_OrderPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(name="product")
    public WebElement Product;

    @FindBy(xpath = "//input[@value='Visa']")
    public WebElement visaRadioButton;
    @FindBy(xpath = "//input[@value='MasterCard']")
    public WebElement masterRadioButton;
    @FindBy(xpath = "//input[@value='American Express']")
    public WebElement americanExpressRadioButton;
    @FindBy(name = "quantity")
    public WebElement quantity ;
    @FindBy(xpath = "//input[@placeholder='Enter the price for an individual unit']")
    public WebElement pricePerUnit;
    @FindBy(xpath = "//input[@placeholder=\"Enter the discount rate e.g. '80' \"]")
    public WebElement discount ;
    @FindBy(xpath = "//button[text()='Calculate']")
    public WebElement calculate ;
    @FindBy(xpath = "//input[@placeholder='Full name of the customer']")
    public WebElement customerName ;
    @FindBy(xpath = "//input[@placeholder='Street address of the customer']")
    public WebElement street ;
    @FindBy(xpath = "//input[@placeholder='City where the customer lives']")
    public WebElement city ;

    @FindBy(xpath = "//input[@placeholder='State where the customer lives']")
    public WebElement state ;
    @FindBy(name = "zip")
    public WebElement zip ;
    @FindBy(name = "cardNo")
    public WebElement cardNo ;
    @FindBy(name = "cardExp")
    public WebElement cardexp ;

    @FindBy(name="card")
    public List<WebElement> cardTypes;






}
