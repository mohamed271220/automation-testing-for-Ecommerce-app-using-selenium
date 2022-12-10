@smoke
Feature:  F07_filterWithColor | user should be able to use the color filter
  Scenario: user changes the filter to color while in a sub category

    Given user hover over a random main category and click on a subcategorey
    When user clicks on the SortBy dropdown list user clicks on color
    Then products should be resorted