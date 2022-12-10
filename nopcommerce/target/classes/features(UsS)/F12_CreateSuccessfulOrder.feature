@smoke
Feature: F12_createOrder | user can make a successful order

  Scenario: user adds an item to the shopping chart and goes to checkout
    Given user go to login page
    When user login with "valid" "test10@example.com" and "P@ssw0rd"
    And user press on login button
    And user clicks on the product
    And user clicks on the add to cart button on the product page
    And green message appears and user wait till it dissapear
    And user clicks on the shopping cart button on the top right
    And user checks terms of service
    And use clicks on the checkout button
    And  user fills the shipping info
    Then verify the message that appeard




