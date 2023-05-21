Feature: Registration functionalities
  @register_using_Email
  Scenario: Register using email address
    Given user is on the registration page
    When user chooses mobile register
    And user clicks os register by email address
    And User enters email address "aboubaker2017@gmail.com"
    And user clicks on the continue button
    Then an email will be sent the user