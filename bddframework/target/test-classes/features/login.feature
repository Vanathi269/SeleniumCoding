Feature: Orange HRM login module
this feature will cover all the possible scenarios for OHRM login module

Scenario: Validate the title of the page
When user launches the application
Then the title of the longin page should be displayed

Scenario: validate user login
Given user launches the application
When user enters username
And user enters password
And user clicks on login button
Then  user should be logged in successfully


Scenario: validate user login
Given user launches the application
When user enters username as "Admin"
And user enters password as "admin123"
And user clicks on login button
Then  user should be logged in successfully
