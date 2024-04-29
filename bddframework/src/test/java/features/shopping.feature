Feature: validating the shopping application

Scenario: validate the login page
Given user launches the shopping application 
When user enters username as "Admin"
And user enters password as "admin123"
And user clicks on login button
And selecting the particular case
Then  user should be logged in successfully

