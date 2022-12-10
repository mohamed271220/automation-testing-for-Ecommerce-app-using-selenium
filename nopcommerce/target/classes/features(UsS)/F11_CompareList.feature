@smoke
Feature: F11_CompareList | compare works fine


  Scenario: user adds an item to the CompareList
    Given user clicks on the product to add to Compare
    When user clicks on the add to CompareList on the product page
    And user chooses another product to compare them to each other and clicks on it
    And user clicks on the add to CompareList on the product page on the new product
    And green message appears conatains a confirmation message and link to that Compare list user clicks on that link
    Then both products show up


