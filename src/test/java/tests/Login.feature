Feature: User Login

Background: Given User navigates to Login page

Scenario Outline: Login with valid credentials
When User enters valid email <email>
And Enters valid password <password>
And Clicks on Login button
Then User should login successfully
Examples:
|email              |password|
|jonsmith1@gmail.com |zaq12wsx|
|jonsmith2@gmail.com |zaq12wsx|

Scenario: Login with invalid credentials
When User enters invalid email address "wecrrrr@gmail.om"
And Enters invalid password "123456"
And Clicks on Login button
Then User should get a proper warning message

Scenario: Login with valid email addresss and invalid password
When User enters valid email "wrwetw@com"
And Enters invalid password "1324355"
And Clicks on Login button
Then User should get a proper warning message

Scenario: Login with invalid email and valid password
When User enters invalid email address "wecrrrr123@gmail.om" 
And Enters valid password "123456"
And Clicks on Login button
Then User should get a proper warning message

Scenario: Login without providing any credentials
When User doesn't provide any credentials
And Clicks on Login button
Then User should get a proper warning message