Feature: Testing sign in functionalities
  Background:
    Given user is on the sign in page
  @negative_test
  Scenario: log in with invalid credentials
    When user enters invalid the userId "Babobabo1991"
    And user enters password "123456789"
    And user clicks on the sign in button
    Then user gets an error message
  @positive_test
  Scenario Outline: log in with valid credentials
    When user enters valid userid "<userid>" and password "<password>"
    And user clicks on the sign in button
    Then user is signed in
    Examples:
      |userid             |password  |
      |abdou2017@gmail.com|beezak1991|
