Feature: Support Functionalities
  Background:
    Given user is on home page
    When user clicks on support button
    And user clicks on contact us option
  @support_test
  Scenario: check the availability of support service contacts
    And user clicks on more option button
    Then user can see contact info
  @international_travel_test
  Scenario: check support service for international travels
    And user clicks on Mobile button
    And user clicks on International travel
    And user clicks on call us
    Then user can see contact number