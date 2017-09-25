$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePage.feature");
formatter.feature({
  "line": 2,
  "name": "Home Page",
  "description": "",
  "id": "home-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Enter the item for search",
  "description": "",
  "id": "home-page;enter-the-item-for-search",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User is on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User enters SearchKeyword",
  "rows": [
    {
      "cells": [
        "adidas shoes"
      ],
      "line": 9
    },
    {
      "cells": [
        "iphone 7"
      ],
      "line": 10
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "click the search icon",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user should be able to get the expected product",
  "keyword": "Then "
});
formatter.match({
  "location": "Hooks.user_is_on_the_home_page()"
});
formatter.result({
  "duration": 12137905920,
  "status": "passed"
});
formatter.match({
  "location": "TestCase.if_User_enters_SearchKeyword(DataTable)"
});
formatter.result({
  "duration": 554503185,
  "status": "passed"
});
formatter.match({
  "location": "TestCase.click_the_search_icon()"
});
formatter.result({
  "duration": 241944306,
  "status": "passed"
});
formatter.match({
  "location": "TestCase.user_should_be_able_to_get_the_expected_product()"
});
formatter.result({
  "duration": 144636,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Customer Support Helpline",
  "description": "",
  "id": "home-page;customer-support-helpline",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@tag2"
    },
    {
      "line": 18,
      "name": "@tag3"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "User Clicks on Customer Care icon",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "User should see the Customer Care Page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("LoginPage.feature");
formatter.feature({
  "line": 3,
  "name": "Login Page",
  "description": "",
  "id": "login-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Login into flipkart",
  "description": "",
  "id": "login-page;login-into-flipkart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "he clicks on login icon",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "he should be able to see the Login Page",
  "keyword": "Then "
});
formatter.match({
  "location": "TestCase.he_clicks_on_login_icon()"
});
formatter.result({
  "duration": 337128724,
  "status": "passed"
});
formatter.match({
  "location": "TestCase.he_should_be_able_to_see_the_Login_Page()"
});
formatter.result({
  "duration": 67412,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Login into flipkart",
  "description": "",
  "id": "login-page;login-into-flipkart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "User is on the Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "User enters Username as \"8750152322\" and Password as \"telnet@123\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "click the submit button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user should be on the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "TestCase.user_is_on_the_Login_Page()"
});
formatter.result({
  "duration": 93011,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8750152322",
      "offset": 25
    },
    {
      "val": "telnet@123",
      "offset": 54
    }
  ],
  "location": "TestCase.user_enters_Username_as_and_Password_as(String,String)"
});
formatter.result({
  "duration": 570093199,
  "status": "passed"
});
formatter.match({
  "location": "TestCase.click_the_submit_button()"
});
formatter.result({
  "duration": 8882553,
  "status": "passed"
});
formatter.match({
  "location": "TestCase.user_should_be_on_the_home_page()"
});
formatter.result({
  "duration": 100265,
  "status": "passed"
});
formatter.uri("ProductList.feature");
formatter.feature({
  "line": 3,
  "name": "Product List",
  "description": "",
  "id": "product-list",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Product name with highest rating",
  "description": "",
  "id": "product-list;product-name-with-highest-rating",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User is on the product list page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "he should get the product with highest rating",
  "keyword": "Then "
});
formatter.match({
  "location": "TestCase.user_is_on_the_product_list_page()"
});
formatter.result({
  "duration": 97278,
  "status": "passed"
});
formatter.match({
  "location": "TestCase.he_should_get_the_product_with_highest_rating()"
});
formatter.result({
  "duration": 2504822068,
  "status": "passed"
});
});