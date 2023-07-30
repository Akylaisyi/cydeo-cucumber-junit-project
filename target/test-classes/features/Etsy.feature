@etsy
Feature: Etsy search functionality

  Scenario: Etsy Title Verification
    Given User is on the Etsy home page
    When User should see tittle is as expected
@2nd
  Scenario:Title verification
    Given User is on the Etsy home page
    Then User types "Wooden spoon"
    Then User clicks search button
    Then User sees "Wooden spoon" as a title