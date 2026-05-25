@backgroundScenario
Feature: user Login
  As a registered user
  i want to login to my account
  so that i can access my dashboard

  Background:
    Given user is on login page
    And user enter valid credentials


  Scenario: successful login
    Given user click the "login" button
    Then user should be redirected to "home"


  Scenario: log-out functionality
    Given user is logged in
    When user click the "logout" button
    Then user should be redirected to "login"