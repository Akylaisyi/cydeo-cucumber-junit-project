package com.cydeo.step_definitions;

import com.cydeo.pages.R_VytrackDashBoardPage;
import com.cydeo.pages.R_VytrackLoginPage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class R_VytrachDashboard_StepDefinitions {

    R_VytrackDashBoardPage vytrackDashBoardPage=new R_VytrackDashBoardPage();
    R_VytrackLoginPage loginPage=new R_VytrackLoginPage();

    @Then("user should be able to see following modules")
    public void user_should_be_able_to_see_following_modules(List<String> expectedModules) {
        BrowserUtils.sleep(3);
List<String> actualModels=new ArrayList<>();
        for (WebElement eachModule : vytrackDashBoardPage.allModules) {
            actualModels.add(eachModule.getText());
        }

        Assert.assertEquals(expectedModules, actualModels);

        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

    }



    @When("user enters below credentials")
    public void userEntersBelowCredentials(Map<String,String> credentials) {
        String username=credentials.get("username");
        String password=credentials.get("password");
        loginPage.login(username,password);

    }

    @Then("user should be able to see following information")
    public void userShouldBeAbleToSeeFollowingInformation(Map<String,String> userInfo) {
 BrowserUtils.sleep(3);
        String actualUserInfo=vytrackDashBoardPage.userinfo.getText();
        String expectedInfo=userInfo.get("firstname")+" "+userInfo.get("lastname");

        Assert.assertEquals(expectedInfo,actualUserInfo);

    }
}
