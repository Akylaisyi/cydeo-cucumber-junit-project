@regression
Feature:Library login feature
User Story:
As a user, I should be able to login with the correct credentials to different accounts. And dashboard should be displayed.
Accounts are: librarian, student, admin
Background: For all scenarios user is on the login page of the library application
  Given user is on the Login page of the application

@librarian @smoke
  Scenario: Login as librarian

    When user enters with librarian username
    And  user enters librarian password
    Then user should see the dashboard
@student @smoke
  Scenario: Login as student
    When user enters with student username
    And  user enters student password
    Then user should see the dashboard
@admin @smoke
  Scenario: Login as admin

    When user enters with admin username
    And  user enters with admin password
    Then user should see the dashboard

