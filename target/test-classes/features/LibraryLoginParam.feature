Feature: Login with parameters
  @librarianParam
  Scenario: Login as librarian 49
    Given I am on the login page
    When I enter username "librarian49@library"
    And I enter password "libraryUser"
    And click the sign in button
    And there should be 2903 users
    Then dashboard should be displayed