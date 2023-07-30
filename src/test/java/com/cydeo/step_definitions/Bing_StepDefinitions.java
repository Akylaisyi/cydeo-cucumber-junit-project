package com.cydeo.step_definitions;

import com.cydeo.pages.BingSearchPage;
import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

import java.security.Key;

public class Bing_StepDefinitions {

    BingSearchPage bingSearchPage=new BingSearchPage();
    @When("user is on the Bing search page")
    public void user_is_on_the_bing_search_page() {
        Driver.getDriver().get("https://www.bing.com");

    }


    @Then("user enters {string} in the Bing search box")
    public void userEntersInTheBingSearchBox(String searchKey) {

            bingSearchPage.searchBox.sendKeys(searchKey + Keys.ENTER);
        }

        @Then("user should see the {string} in the title")
        public void userShouldSeeTheInTheTitle (String expectedTitle){

            BrowserUtils.verifyTitleContains(expectedTitle);
        }
    }
