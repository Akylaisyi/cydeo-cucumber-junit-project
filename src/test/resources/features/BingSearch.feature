Feature: Bing search functionality
  Agile story: As a user, when I am on the Bing search page
  I should be able to search anything and see relevant results
@wip
  Scenario: Search page default title verification
    When user is on the Bing search page
    Then user enters "orange" in the Bing search box
    Then user should see the "orange" in the title