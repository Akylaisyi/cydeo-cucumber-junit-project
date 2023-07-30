Feature: Some of the general functionality verification

  Scenario: Dropdown options verification
    Given User is already logged in to the Web table app
    When User is on the Order page
    Then user sees below options under product dropdown
      | MoneyCog   |
      | FamilyBea  |
      | Screenable |


    Scenario: Payment options verifications
      Given User is already logged in to the Web table app
      When User is on the Order page
      Then Use sees Visa as enabled payment option
      Then user sees MasterCard as enabled payment option
      Then user sees American Express as enabled payment option

      Scenario: Order place verification
        Given User is already logged in to the Web table app
        When User is on the Order page
        Then User enters quantity "2"
        Then user clicks to the calculate button
        Then User enters customer name "Jane Doe"
        And User enters street "7th Street"
        And User enters city "Dallas"
        And User enters state "Texas"
        And User enter zip "76015"
        And User selects payment option "American Express"
        And User enters credit card number "155489451"
        And  User enters expiration date "01/25"
        And User clicks to process order button
        Then user should see "Jane Doe" int the first row of the web table


