Feature: See Phone Number of a Nearby Store
  @retrieve_phoneNumber
  Scenario: See Phone Number of a Nearby Store
    Given user is on the Verizon website
    When user clicks on stores link
    And user provides a zip code "20166"
    Then user selects the right address from the list
    And the store's phone number should be displayed