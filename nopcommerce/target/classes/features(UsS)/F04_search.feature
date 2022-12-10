@smoke
Feature:  F04_search | Logged User could search for any product
  Scenario Outline: user could search using product name
    Given user clicks on the search bar and writes "<product>"
    When user click on search button
    Then all product that showed up contan the product word "<product>"
    Examples:
    |product|
    |    book     |
    |      laptop       |
    |         nike          |


  Scenario Outline: user could search for product using sku

    Given user clicks on the search bar and writes "<product>"
    When user click on search button
    And click on the only product that showed up
    Then the search sku matches the "<product>" sku
    Examples:
      |product|
      |    SCI_FAITH     |
      |      APPLE_CAM       |
      |          SF_PRO_11          |
