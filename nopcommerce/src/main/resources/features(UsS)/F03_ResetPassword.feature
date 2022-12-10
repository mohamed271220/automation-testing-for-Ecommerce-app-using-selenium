@smoke
Feature: F03_ResetPassword | User could reset his/her password successfully

  Scenario: user could change his/her password
    Given user go to login page
    When user click on the forgot password
    And user enters a valid "test7@example.com"
    And user press on recover button
    Then instruction message is displayed
