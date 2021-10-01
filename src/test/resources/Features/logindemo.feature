Feature: Test login Functionality

  Scenario Outline: Check login with successfull credential
    Given broswer is open
    And verify user is able to see on login page
    When user enters <username> and <password>
    And User can able to click on log in button
    Then user is navigated to home page

    Examples:
    |username|password|
    |Sraban|12345|
    |Raghav|12345|