
@tag
Feature: Customer Care Page

#@tag1
#Scenario: Customer support Helpline 
#Given User is on home page
#When User clicks on Customer Care link
#Then he should see the customer Care page

@tag2
Scenario: Customer Care issues
When User clicks on each issue
And clicks on view more
Then user should be able to count number of questions

