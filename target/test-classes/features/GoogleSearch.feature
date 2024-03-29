Feature: Google search functionality
  Agile story: As a user, when I am on the Google search page
  I should be able to search anything and see relevant results

  Scenario: Search page default title verification
    When user is on the Google search page
    Then user should see the title is Google

    @wip
    Scenario: Search result title verification
      When user is on the Google search page
      Then users searches for "apple"
      Then user should see "apple" in the title
