package com.cydeo.step_definitions;

import com.cydeo.pages.DropDownsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataTables_StepDefinitions {
    @Then("user should see below list")
    public void user_should_see_below_list(List<String> fruitsAndVegetables) {
        System.out.println("fruitsAndVegetables = " + fruitsAndVegetables);

    }
    @Then("user should be bale to see:")
    public void user_should_be_bale_to_see(List<String> pets) {
        System.out.println(pets.get(1));
        System.out.println("pets = " + pets);
    }
    @Then("officer is bale to see any data he search")
    public void officer_is_bale_to_see_any_data_he_search(Map<String, String> driverInfo) {
        System.out.println("driverInfo = " + driverInfo);

    }

    @Given("User is on the dropdown page of practice tool")
    public void userIsOnTheDropdownPageOfPracticeTool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }
DropDownsPage dropDownsPage=new DropDownsPage();
    @Then("User should see below info in month dropdown")
    public void userShouldSeeBelowInfoInMonthDropdown(List<String> expectedMonths) {
       List <String> actualMonths_as_String= BrowserUtils.dropdownOptions_as_STRING(dropDownsPage.dropdownMonths);
        Assert.assertEquals(actualMonths_as_String,expectedMonths);
    }


}
