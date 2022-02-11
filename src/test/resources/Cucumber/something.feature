Feature: Is it added?
  User wants to know if you can add to the database
  Scenario: Adding languages
    Given I want to add a language
    When I put a post request to add the language
    Then I should be told "save"

Feature: Is it added?
  User wants to know if you can add to the database
  Scenario: Adding categories
    Given I want to add a category
    When I put a post request to add the category
    Then I should have returned "save"

Feature: Is it added?
  User wants to know if you can add to the database
  Scenario: Adding actors
    Given I want to add an actor
    When I put a post request to add an actor
    Then I have returned "save"