@smoke
Feature: F01_SignUp | users could sign up with new accounts

  Scenario: guest user could sign up with valid data successfully

    Given user go to register page
    When user select a gender type
    And user enter their first name "automation" and last name "tester"
    And user enter their date of birth
    And user enter an email "test10@example.com" field
    And user fill the Password fields "P@ssw0rd" "P@ssw0rd"
    And user clicks on register button
    Then  success message is displayed