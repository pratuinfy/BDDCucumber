Feature: feature to test google search functionality

  Scenario: validate google search is working
    Given browser is open
    And we are on the google search page
    When user enters a text in a search box
    And hits enter
    Then user is navigated to search result
