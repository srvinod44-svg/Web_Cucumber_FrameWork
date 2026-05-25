@loginScenario
Feature: user Login
  As a registered user
  i want to login to my account
  so that i can access my dashboard

@smoke
  Scenario: successful login with valid credentials
    Given user is on login page
    When user enter login credentials
    Then user is able to logged-in successfully

@sanity
  Scenario: successful login with valid credentials
    Given user is on login page
    When user enter login credentials
    Then user is able to logged-in successfully

@regression
  Scenario: login with in-valid credentials
    Given user enter "admin" as user name and "admin123" as password login credentials
    When user click the login button
    Then user validate error message


  @scenarioOutline
  Scenario Outline: login with multiple credentials
    Given user enter "<username>" as user name and "<password>" as password login credentials
    When user click the login button
    Then user should be redirected to "<pages>"

    Examples:
      |  username|password   |pages        |
      | admin     |admin123   | dashboard|
      | guest       | guest123 | guest home|
      |invalid   | invalid123 | error page|

