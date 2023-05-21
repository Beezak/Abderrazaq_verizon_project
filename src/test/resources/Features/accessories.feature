Feature: Accessories functionalities
  @phone_cases
  Scenario: check for phone cases
    Given user is on verizon home page
    When user clicks on shop and accessories buttons
    And user clicks on phone and tablet accessories
    And user clicks on phone cases
    Then user chooses a apple cases
