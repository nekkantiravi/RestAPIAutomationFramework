Feature: Verify CRM registration page

Scenario: Verify CRM successful creation of registration page

Given i am on the hompage
When i click on signup link
Then i should navigate to registration  page
And i select edition from dropdown
And i should enter firstname
And i should enter lastname
And i should enter email
And i should enter confirmemail
And i should enter username
And i should enter password
And i should enter confirm password
And i check the terms and conditions checkbox
And i click on submit button
Then i shoud navigate to profile details page
