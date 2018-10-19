Feature: Handling different types of popups

Scenario: Handling window popup

Given i am on the hompage
And i click on childpoup window link
Then child window should be opened
And i click on close button
Then i should navigate to parent window