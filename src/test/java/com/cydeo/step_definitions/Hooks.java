package com.cydeo.step_definitions;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/*we will be able to create pre- and post-condition for All scenarios and steps*/
public class Hooks {
    @Before(order = 1) // select io
    public void setupMethod(){
        System.out.println("Before: RUNNING BEFORE EACH SCENARIO");
    }
   // @Before(value = "@login", order=2)
    //public void login_scenario_before(){
   //     System.out.println("--->Before:RUNNING BEFORE EACH SCENARIO");
   // }
@After
    public void teardownMethod(Scenario scenario){
        if(scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        System.out.println("----> @After: RUNNING AFTER each scenario");
    BrowserUtils.sleep(3);
    Driver.closeDriver();
    }

    @BeforeStep
    public void setupStep(){
        System.out.println("--> @Before Step: Running before each step!");
    }

    @AfterStep
    public void teardownStep(){
        System.out.println("-->@AfterStep: running after each step!");
    }



}
