Feature: As a user, I should be able to access to Files module.
  Background:
    Given user on the dashboard page
    When the user clicks the "Files" module
  @file
  Scenario: verify users can access to Files module
  // When the user clicks the "Files" module
    Then verify the page title is "Files - Trycloud QA"
  @ss
  Scenario: verify users can select all the uploaded files from the page
  // Given user on the dashboard page
    When the user clicks the "Files" module
    And user click the top-left checkbox of the table
    Then verify all the files are selected