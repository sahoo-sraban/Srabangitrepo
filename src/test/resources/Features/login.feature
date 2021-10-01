@smokeScenario
Feature: feature to test login functionality

  Scenario: Check login in successfull with valid credential
    Given user is on login page
    When enter user name & pswd
    And clcik on lognin button
    Then user is navigated to thr home page

    
      