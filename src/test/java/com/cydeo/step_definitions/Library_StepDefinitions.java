package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Library_StepDefinitions {
    @Given("user is on the Login page of the application")
    public void user_is_on_the_login_page_of_the_application() {
        System.out.println("User is ont he login page of the library application.");
    }
    @When("user enters with librarian username")
    public void user_enters_with_librarian_username() {
        System.out.println("User enters librarian username.");
    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("User enters librarian password.");
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("User sees the dashboard page. ");

    }
    @When("user enters with student username")
    public void user_enters_with_student_username() {
        System.out.println("User enters student username.");
    }
    @When("user enters student password")
    public void user_enters_student_password() {
        System.out.println("User enters student password.");
    }
    @When("user enters with admin username")
    public void user_enters_with_admin_username() {
        System.out.println("User enters admin username");
    }
    @When("user enters with admin password")
    public void user_enters_with_admin_password() {
        System.out.println("User enters admin username");
    }

}
