@smoke
Feature: F10_AddProductToWishList | wishlist works fine


  Scenario: user adds an item to the wishlsist
    Given user clicks on the product to add to wishlist
    When user clicks on the add to wishlist on the product page
    Then green message appears



  Scenario: user adds an item to the wishlist and goes to inspect
    Given user clicks on the product to add to wishlist
    When user clicks on the add to wishlist on the product page
    And green message appears and user wait till it disappear
    And user clicks on the wishlist button on the top right
    Then the user should be able to see the sku code and the quantity for that product in the wishlist

