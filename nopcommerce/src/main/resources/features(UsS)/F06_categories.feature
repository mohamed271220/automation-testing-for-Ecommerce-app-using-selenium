@smoke
Feature:  F06_category | user can choose a subcategorey successfully
  Scenario: user hover over an category and choses a subcategorey

    Given user hover over a random main category and click on a subcategorey
    Then the word on the top of the page matches the categorey name