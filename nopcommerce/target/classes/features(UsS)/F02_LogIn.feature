@smoke
  Feature: F02_logIn | User could log in with valid email and password


    Scenario: user could login with valid email and password
    Given user go to login page
    When user login with "valid" "test7@example.com" and "P@ssw0rd"
    And user press on login button
    Then user login to the system successfully

    Scenario: user could login with invalid email or password
    Given user go to login page
    When user login with "invalid" "wrong@example.com" and "P@ssw0rd"
    And user press on login button
    Then user could not login to the system