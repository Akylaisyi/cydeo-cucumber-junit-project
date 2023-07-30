package com.cydeo.step_definitions;

import com.cydeo.pages.EtsySearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.security.Key;

public class Etsy_StepDefinitions {
    EtsySearchPage etsySearchPage=new EtsySearchPage();

    @Given("User is on the Etsy home page")
    public void user_is_on_the_etsy_home_page() {
        Driver.getDriver().get("https://www.etsy.com");
    }

    @When("User should see tittle is as expected")
    public void user_should_see_tittle_is_as_expected() {
        System.out.println(Driver.getDriver().getTitle());
        Assert.assertEquals(Driver.getDriver().getTitle(),"Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone");
    }



    @Then("User types {string}")
    public void userTypes(String searchInput)  {

        etsySearchPage.SearchBox.sendKeys(searchInput+Keys.ENTER);

    }

    @Then("User clicks search button")
    public void userClicksSearchButton() {
        etsySearchPage.SearchBtn.click();

    }

    @Then("User sees {string} as a title")
    public void userSeesAsATitle(String SearchInput) {
        System.out.println(Driver.getDriver().getTitle());
        BrowserUtils.verifyTitleContains(SearchInput);
    }
}
