@smoke
Feature: F05_currencies | Currency test

  Scenario: user selects euro currency
    Given user selects euro's sign
    Then Euro sign is on every product price on home page
