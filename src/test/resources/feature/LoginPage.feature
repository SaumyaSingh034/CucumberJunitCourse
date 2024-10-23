Feature: Login Feature File

  Scenario: Login Page Title
    Given user is on the login page
    When user gets the title of the page
    Then the title of page should be "Account Login"

    Scenario: Forget Password Link
      Given user is on the login page
      Then forgot password link should be displayed

      Scenario: Login with correct credentials
        Given user is on the login page
        When user enters email "testAuto229@gmail.com"
        And user enters password "IamQueen@001"
        And user clicks on the Login button
        Then user gets the title of the page
        And the title of page should be "My Account"