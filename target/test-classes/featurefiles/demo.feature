Feature: Validating the login Page

Scenario: Verifying the login functionality

Given User opens the  browser and launches the url using "https://www.facebook.com/"
When User enters the credentials to login
|  "sara.eric129@gmail.com"   |  12345  |
And User clicks the login button
Then User is on the web page