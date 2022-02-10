Feature: Is it added?
  User wants to know if you can add to the database
  Scenario: Adding languages
    Given I want to add a language
    When I put a post request to add the language
    Then I should be told "saved"