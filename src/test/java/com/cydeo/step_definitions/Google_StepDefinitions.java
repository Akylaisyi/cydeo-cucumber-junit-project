package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Google_StepDefinitions {
    GoogleSearchPage googleSearchPage=new GoogleSearchPage();
    @When("user is on the Google search page")
    public void user_is_on_the_google_search_page() {
        Driver.getDriver().get("https://www.google.com");
    }
    @Then("user should see the title is Google")
    public void user_should_see_the_title_is_google() {
        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle="Google";
        Assert.assertEquals(actualTitle,expectedTitle);
        Driver.closeDriver();
    }
    @Then("users searches for {word}")
    public void users_searches_for_apple(String word) {
        googleSearchPage.searchBox.sendKeys(word+ Keys.ENTER);


    }


    @Then("user should see {string} in the title")
    public void userShouldSeeInTheTitle(String title) {
        BrowserUtils.verifyTitleContains(title);
    }
}
