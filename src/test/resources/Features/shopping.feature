Feature: shopping functionalities
  @add_phone_to_wishlist
  Scenario Outline: Adding a phone to the wish list
    Given user is signed in successfully using "<userid>" and "<password>"
    When user clicks on shop button
    And user clicks on deals button
    And user clicks on free phones button
    Then user can choose a phone
    And user can add the phone to the wishlist
    Examples:
      |userid             |password  |
      |abdou2017@gmail.com|beezak1991|

    @find_phones_with_specific_characteristics
Scenario Outline: find a phone with specific features
  Given user is signed in successfully using "<userid>" and "<password>"
  When user clicks on shop button
  And user clicks on deals button
  And user clicks on free phones button
  Then user can chose the brand of the phone of the phone
  And user can chose the color of the and search for result
  And user will ne able to see the phone with specified characteristics
  Examples:
    |userid             |password  |
    |abdou2017@gmail.com|beezak1991|