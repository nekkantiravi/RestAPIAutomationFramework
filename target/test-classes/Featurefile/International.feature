Feature:Verify international shipping

Scenario: Verify IS

Given i am on the hompage
When i click on shipping to link
Then i should navigate to context chooser page
And i select shipping country
And i select currency
And i click on save button
Then i should navigate to the corresponding country page
