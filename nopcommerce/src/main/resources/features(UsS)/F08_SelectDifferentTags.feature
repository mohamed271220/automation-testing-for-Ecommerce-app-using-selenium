@smoke
Feature:  F08_SelectDifferentTags | user should be select from the tags
 Scenario Outline: user selects different

    Given user goes to a category and click on a subcategorey
    When user clicks on any tag "<name>"
    Then the page should take the user to that "<name>"
Examples:
|name|
|  cool  |
|    computer    |
|          apparel      |