Feature: Is it added?
  User wants to know if you can add to the database
  Scenario: Adding languages
    Given I want to add the language "Hungarian"
    When I put a post request
    Then I should be told "save"