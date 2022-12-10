@smoke
Feature: F09_AddProductsToShoppingCart | shopping cart works fine


  Scenario: user adds an item to the shopping chart
    Given user clicks on the product
    When user clicks on the add to cart button on the product page
    Then green message appears and user click on shopping cart link



  Scenario: user adds an item to the shopping chart and goes to inspect
    Given user clicks on the product
    When user clicks on the add to cart button on the product page
    And green message appears and user wait till it dissapear
    And user clicks on the shopping cart button on the top right
    Then the user should be able to see the sku code and the quantity for that product

