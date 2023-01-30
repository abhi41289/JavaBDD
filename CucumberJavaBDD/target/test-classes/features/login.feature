
Feature: Login to the application

  Scenario : Verify whether admin user is able to login with valid credentials
    Given user is on LOGIN page
    When  user enters username and password
    And clicks on the SUBMIT button
    Then user is navigated to the HOMEPAGE



