Feature: Login page

  Scenario Outline: Check login successful with valid credential
    Given User will on login page
    When User enters <username> and <password>
    And Click on login button
    Then User is redireced to home page

    Examples: 
      | username    | password     |
      | Pratiksha72 | Pratiksha@72 |
      | Aditya72    | Aditya@72    |
      | Namrata72  | Namrata@72   |
      | Sadiya72    | Sadiya@72    |
