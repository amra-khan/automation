@tag
Feature: Home Page 



@tag1
Scenario: Enter the item for search  
Given User is on the home page
When User enters SearchKeyword
  | adidas shoes |
  | iphone 7 |
And click the search icon
Then user should be able to get the expected product





@tag3
Scenario: Customer Support Helpline
When User Clicks on Customer Care icon
Then User should see the Customer Care Page
