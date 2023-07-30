package com.cydeo.step_definitions;

import com.cydeo.pages.WT_BasePage;
import com.cydeo.pages.WT_LoginPage;
import com.cydeo.pages.WT_OrderPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.Map;

public class WebTable_StepDefinitions {
    @Given("User is on the Web Table app login page")
    public void user_is_on_the_web_table_app_login_page() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
    }
    WT_LoginPage wtLoginPage=new WT_LoginPage();
    @When("User enters correct username")
    public void user_enters_correct_username() {
wtLoginPage.UserName.sendKeys("Test");
    }
    @When("User enters correct password")
    public void user_enters_correct_password() {
        wtLoginPage.Password.sendKeys("Tester");
    }
    @Then("User clicks Login button")
    public void user_clicks_login_button() {
       wtLoginPage.LoginBtn.click();
    }
    @Then("User should see orders word in the URL")
    public void user_should_see_orders_word_in_the_url() {
       String actualUrl=Driver.getDriver().getCurrentUrl();
       String expectedUrl="orders";
        Assert.assertTrue(actualUrl.contains(expectedUrl));
    }
    WT_BasePage wt_basePage=new WT_BasePage();

    @When("User enters {string} username and {string} password")
    public void userEntersUsernameAndPassword(String username, String password) {
        wtLoginPage.UserName.sendKeys(username);
        wtLoginPage.Password.sendKeys(password);
    }
    @When("User enters below correct credentials")
    public void userEntersBelowCorrectCredentials(Map<String, String> credentials) {
wtLoginPage.UserName.sendKeys(credentials.get("username"));
wtLoginPage.Password.sendKeys(credentials.get("password"));
    }

    @Given("User is already logged in to the Web table app")
    public void user_is_already_logged_in_to_the_web_table_app() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
        wtLoginPage.login();

    }
    WT_OrderPage orderPage=new WT_OrderPage();
    @When("User is on the Order page")
    public void user_is_on_the_order_page() {
wt_basePage.Order.click();
        wt_basePage.Order.click();
    }
    @Then("user sees below options under product dropdown")
    public void user_sees_below_options_under_product_dropdown(List<String> expected_order) {
 List<String> actualOptions= BrowserUtils.dropdownOptions_as_STRING(orderPage.Product);
    }

    @Then("Use sees Visa as enabled payment option")
    public void useSeesVisaAsEnabledPaymentOption() {
        Assert.assertTrue(orderPage.visaRadioButton.isEnabled());
    }

    @Then("user sees MasterCard as enabled payment option")
    public void userSeesMasterCardAsEnabledPaymentOption() {
        Assert.assertTrue(orderPage.masterRadioButton.isEnabled());
    }

    @Then("user sees American Express as enabled payment option")
    public void userSeesAmericanExpressAsEnabledPaymentOption() {
        Assert.assertTrue(orderPage.americanExpressRadioButton.isEnabled());
    }

    @Then("User enters quantity {string}")
    public void userEntersQuantity(String quantity) {
        orderPage.quantity.clear();
       // orderPage.quantity.sendKeys(Keys.BACK_SPACE);
        orderPage.quantity.sendKeys(quantity);
        
    }

    @Then("user clicks to the calculate button")
    public void userClicksToTheCalculateButton() {
        orderPage.calculate.click();
    }

    @Then("User enters customer name {string}")
    public void userEntersCustomerName(String Name) {
        orderPage.customerName.sendKeys(Name);
    }

    @And("User enters street {string}")
    public void userEntersStreet(String street) {
        orderPage.street.sendKeys(street);
    }

    @And("User enters city {string}")
    public void userEntersCity(String city) {
        orderPage.city.sendKeys(city);
    }

    @And("User enters state {string}")
    public void userEntersState(String state) {

        orderPage.state.sendKeys(state);
    }

    @And("User enter zip {string}")
    public void userEnterZip(String zip) {

        orderPage.zip.sendKeys(zip);
    }

    @And("User selects payment option {string}")
    public void userSelectsPaymentOption(String cardType) {
        BrowserUtils.clickRadioButton(orderPage.cardTypes,cardType);

    }

    @And("User enters credit card number {string}")
    public void userEntersCreditCardNumber(String cardNum) {
        orderPage.cardNo.sendKeys(cardNum);
    }

    @And("User enters expiration date {string}")
    public void userEntersExpirationDate(String expDate) {
        orderPage.cardexp.sendKeys(expDate);

    }

    @And("User clicks to process order button")
    public void userClicksToProcessOrderButton() {
        orderPage.Order.click();
    }

    @Then("user should see {string} int the first row of the web table")
    public void userShouldSeeIntTheFirstRowOfTheWebTable(String arg0) {
    }
}
