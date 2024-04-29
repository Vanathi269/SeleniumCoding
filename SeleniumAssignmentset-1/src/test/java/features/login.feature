Feature: Orange HRM login module 
this feature will cover all the possible scenarios for OHRM login module

Scenario: validate user login
Given user launches the application
When user enters username
And user enters password
And user clicks on login button
Then  user should be logged in successfully