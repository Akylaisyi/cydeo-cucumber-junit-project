
@datatable
Feature: Cucumber Data Tables Implementation practices


  Scenario: List of fruits and vegetables I like
    Then user should see below list
      | orange     |
      | apple      |
      | kiwi       |
      | strawberry |
      | tomato     |
      | pear       |
      | eggplant   |


  Scenario: List of pets we love
    Then user should be bale to see:
      | cat    |
      | dog    |
      | parrot |
      | turtle |

  Scenario: Officer reads data about Driver
    Then officer is bale to see any data he search
      | name     | John       |
      | lastname | Doe        |
      | age      | 29         |
      | address  | somewhere  |
      | state    | CA         |
      | zipcode  | 15455      |
      | phone    | 1545514545 |

  Scenario: User should be able to see all 12 months in months dropdown
    Given User is on the dropdown page of practice tool
    Then User should see below info in month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June       |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |
