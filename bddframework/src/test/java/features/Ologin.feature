Feature: Orange HRM login module

Scenario Outline: validate user login
Given user launches the application
When user enters <username> and <password>
And user clicks on login button
Then  user should be logged in successfully
Examples:
|username|password|
|Admin|admin123|
|HR|hr123|