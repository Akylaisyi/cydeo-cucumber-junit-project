package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtils {
    public static void sleep(int seconds) {

        seconds *= 1000;
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
        }
    }

    public static void switchWindowAndVerify(String expectedUrl, String expectedTitle){
        Set<String > allWindowHandles=Driver.getDriver().getWindowHandles();//getWindowHandles
        for (String each : allWindowHandles) {//each window
            Driver.getDriver().switchTo().window(each);//switch each window
            System.out.println("Current URL: "+Driver.getDriver().getCurrentUrl());
            if(Driver.getDriver().getCurrentUrl().contains(expectedUrl)){
                break;
            }}

        String actualTitle= Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    public static void verifyTitle(String expectedTitle){

        Assert.assertEquals(Driver.getDriver().getTitle(),expectedTitle);
    }

    public static void verifyTitleContains(String expectedInTitle){
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedInTitle));
    }

    public static void waitForInvisibilityOf(WebElement target){

        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.invisibilityOf(target));
    }

    public static List<String> dropdownOptions_as_STRING(WebElement dropdownElement){
        Select select=new Select(dropdownElement);
        List<String> dropdown_As_String=new ArrayList<>();
        for (WebElement each : select.getOptions()) {
            dropdown_As_String.add(each.getText());

        }
        return dropdown_As_String;
    }

    public static void clickRadioButton(List<WebElement> radioButtons,String attributeValue){
        for (WebElement each : radioButtons) {
            if(each.getAttribute("value").equals(attributeValue)){
                each.click();
            }

        }
    }

}
