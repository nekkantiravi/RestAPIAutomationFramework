Feature: Signin functionality

Scenario: Verify user is able to signin 
Given i am on the hompage
When i click on Myaccount link
Then i should navigate to login page
And i enter user name
And i enter password
And i click on Login button
Then i should naivigate to Myaccount page



