@wiki
Feature: Wikipedia Search Features

  @WPS-TC01
  Scenario: Wikipedia Search Functionality Title Verification
    When  User is on Wikipedia homepage
    Then User types "Steve Jobs" in the wiki search box
    Then User clicks wiki search button
    And User sees "Steve Jobs" is in the wiki title

  @WPS-TC02
  Scenario: Wikipedia Search functionality Header Verification
    When  User is on Wikipedia homepage
    Then User types "Steve Jobs" in the wiki search box
    Then User clicks wiki search button
    Then User sees "Steve Jobs" is in the main header

  @WPS-TC03
  Scenario: Wikipedia Search functionality Image Header Verification
    When  User is on Wikipedia homepage
    Then User types "Steve Jobs" in the wiki search box
    Then User clicks wiki search button
    Then User sees "Steve Jobs" is in the image header

  @scenarioOutline
  Scenario Outline: Wikipedia Search functionality with scenario Outline
    When User is on Wikipedia homepage
    Then User types "<searchValue>" in the wiki search box
    Then User clicks wiki search button
    And User sees "<expectedTitle>" is in the wiki title
    Then User sees "<expectedMainHeader>" is in the main header
    Then User sees "<expectedImageHeader>" is in the image header

    Examples: search values we are going to using in this scenario outlines
      | searchValue     | expectedTitle   | expectedMainHeader | expectedImageHeader |
      | Steve Jobs      | Steve Jobs      | Steve Jobs         | Steve Jobs          |
     # | Marry Barra     | Marry Barra     | Marry Barra        | Marry Barra         |
      | Rosalind Brewer | Rosalind Brewer | Rosalind Brewer    | Rosalind Brewer     |