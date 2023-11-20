Feature: Check the login Functionality

  Scenario: 
    Given user is on the login page
    When user enterd valid Username and Password
    And click on login button
    Then user is redirected to home page
