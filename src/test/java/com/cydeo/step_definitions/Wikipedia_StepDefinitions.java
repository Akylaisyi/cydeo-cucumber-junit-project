package com.cydeo.step_definitions;

import com.cydeo.pages.WikiResultPage;
import com.cydeo.pages.WikipediaSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Wikipedia_StepDefinitions {
WikipediaSearchPage wikipediaSearchPage=new WikipediaSearchPage();
    @When("User is on Wikipedia homepage")
    public void user_is_on_wikipedia_homepage() {
        Driver.getDriver().get("https://www.wikipedia.org/");
    }



    @Then("User clicks wiki search button")
    public void userClicksWikiSearchButton() {
        wikipediaSearchPage.iSearchInputButton.click();
    }



    @Then("User types {string} in the wiki search box")
    public void userTypesInTheWikiSearchBox(String searchValue) {
        wikipediaSearchPage.inputSearch.sendKeys(searchValue);
    }

    @And("User sees {string} is in the wiki title")
    public void userSeesIsInTheWikiTitle(String expectedTitle) {
        BrowserUtils.verifyTitleContains(expectedTitle);
    }
WikiResultPage wikiResultPage=new WikiResultPage();
    @Then("User sees {string} is in the main header")
    public void userSeesIsInTheMainHeader(String expectedHeader) {

        String actualHeaderText=wikiResultPage.mainHeader.getText();
        Assert.assertEquals(actualHeaderText,expectedHeader);
    }

    @Then("User sees {string} is in the image header")
    public void userSeesIsInTheImageHeader(String expectedText) {
        Assert.assertEquals(wikiResultPage.imageHeader.getText(),expectedText);
    }
}
