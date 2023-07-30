package com.cydeo.step_definitions;

import com.cydeo.pages.DashboardPage;
import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LibraryLogin_StepDefinitions {
    DashboardPage dashboardPage=new DashboardPage();

    LibraryLoginPage libraryLoginPage=new LibraryLoginPage();
    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("qa2_url"));
    }
    @When("I login as a librarian")
    public void i_login_as_a_librarian() {
libraryLoginPage.emailInput.sendKeys(ConfigurationReader.getProperty("lib22_user"));
        libraryLoginPage.password.sendKeys(ConfigurationReader.getProperty("lib22_pass"));
        libraryLoginPage.signInButton.click();
    }
    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {

        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        String expectedUrl="dashboard";
        wait.until(ExpectedConditions.urlContains(expectedUrl));
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));


    }



    @When("I enter username {string}")
    public void i_enter_username(String email) {
       libraryLoginPage.emailInput.sendKeys(email);
    }
    @When("I enter password {string}")
    public void i_enter_password(String password) {
       libraryLoginPage.password.sendKeys(password);
    }
    @When("click the sign in button")
    public void click_the_sign_in_button() {
      libraryLoginPage.signInButton.click();
    }
    @When("there should be {int} users")
    public void there_should_be_users(Integer expectedUserAmount) {


        String actualUserCount=dashboardPage.userCount.getText();
        String expectedCount=String.valueOf(expectedUserAmount);
        Assert.assertTrue(actualUserCount.contains(expectedCount));

    }


    @When("I login using {string} and {string}")
    public void i_login_using_and(String email, String password) {
        libraryLoginPage.login2(email, password);

    }
    @Then("account holder name should be {string}")
    public void account_holder_name_should_be(String expectedResult) {

        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOf(dashboardPage.accountName));
        String actual=dashboardPage.accountName.getText();
        Assert.assertEquals(actual,expectedResult);

    }


}
