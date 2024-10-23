Feature: Account Page Feature

  Background:
    Given user has already logged in to application
    |username|password|
    |testAuto229@gmail.com|IamQueen@001|

    Scenario: Accounts Page Title
      Given user is on the Accounts Page
      When user gets the title of the page
      Then the title of page should be "My Account"


      Scenario: Accounts Section Count
        Given user is on the Accounts Page
        Then user gets accounts section
        |My Account|
        |My Orders |
        |My Affiliate Account|
        |Newsletter          |
        And accounts section count should be 4