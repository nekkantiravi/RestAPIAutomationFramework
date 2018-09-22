Feature: Check the functionality of Myaccount page

Scenario: Verify My Address link

Given i am on the hompage
When i click on Myaccount link
Then i should navigate to login page
And i enter user name
And i enter password
And i click on Login button
Then i should naivigate to Myaccount page
When i click on Address link on the left navigation
Then i should navigate to Adddress page
And i click on shipping address edit link
Then i should navigate to shipping address
And i enter first name
And i enter last name
And i select country
And i enter address
And i enter city
And i select state
And i select zipcode
And i click on save address button
Then i should naivigate to Myaccount page

