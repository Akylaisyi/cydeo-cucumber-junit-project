package com.cydeo.step_definitions;

import com.cydeo.pages.R_VytrackLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Ma;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class R_VytrackLogin_StepDefinitions {


    R_VytrackLoginPage vytrackLoginPage=new R_VytrackLoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("vyTrackUrl"));
    }

    @When("user enters the driver information")
    public void user_enters_the_driver_information() {

        vytrackLoginPage.login(ConfigurationReader.getProperty("driver_username"),ConfigurationReader.getProperty("driver_password"));

    }

    @Then("user should be able to login")
    public void user_should_be_able_to_login() {
        ;
        BrowserUtils.sleep(3);

       //WebDriverWait wait=new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(20));
        String expectedTitle="Dashboard";
       // wait.until(ExpectedConditions.titleIs(expectedTitle));
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }


    @When("user enters the sales manager information")
    public void user_enters_the_sales_manager_information() {
       vytrackLoginPage.login(ConfigurationReader.getProperty("sales_manager_username"), ConfigurationReader.getProperty("sales_manager_password"));

    }

    @When("user enters the store manager information")
    public void user_enters_the_store_manager_information() {
        vytrackLoginPage.login(ConfigurationReader.getProperty("store_manager_username"),ConfigurationReader.getProperty("store_manager_password"));
    }




    @When("the user login with {string},{string}")
    public void theUserLoginWith(String userName, String passWord) {
        Map<String, String> credentials=new HashMap<>();
vytrackLoginPage.login(userName,passWord);
    }

    @Then("the user should not be able to log in")
    public void theUserShouldNotBeAbleToLogIn() {
        BrowserUtils.verifyTitle("Login");
    }
}
