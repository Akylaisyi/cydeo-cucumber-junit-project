Feature: Web Table app login functionality
  Agile story:
  User should be able to login with correct credentials
  Scenario: positive login scenario
    Given User is on the Web Table app login page
    When User enters correct username
    And User enters correct password
    Then User clicks Login button
    Then User should see orders word in the URL
  Scenario: positive login scenario
    Given User is on the Web Table app login page
    When User enters "Test" username and "Tester" password
    Then User clicks Login button
    Then User should see orders word in the URL
  Scenario: positive login scenario
    Given User is on the Web Table app login page
    When User enters below correct credentials
    |username|Test|
    |password|Tester|
    Then User clicks Login button
    Then User should see orders word in the URL

