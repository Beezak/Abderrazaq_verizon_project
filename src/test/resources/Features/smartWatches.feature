Feature: shop for a smart watch
  @filter_watches
  Scenario: check available smart watches
    Given user is on the home page
    When user clicks on watches button
    And user chooses the brand
    And user chooses brand Type
    And user chooses the color
    Then user can see the results