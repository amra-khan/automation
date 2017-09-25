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
  "duration": 11132302646,
  "status": "passed"
});
formatter.match({
  "location": "TestCase.if_User_enters_SearchKeyword(DataTable)"
});
formatter.result({
  "duration": 107508806,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d60.0.3112.113)\n  (Driver info: chromedriver\u003d2.30.477700 (0057494ad8732195794a7b32078424f92a5fce41),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 10 milliseconds\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027AMRA\u0027, ip: \u0027192.168.10.37\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.30.477700 (0057494ad8732195794a7b32078424f92a5fce41), userDataDir\u003dC:\\Users\\AMRAKH~1\\AppData\\Local\\Temp\\scoped_dir5944_820}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d60.0.3112.113, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 80a615d73eebfb7656727b9b72a74201\n*** Element info: {Using\u003dxpath, value\u003d//input[contains(@title, \u0027Search for Products\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:671)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:410)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:509)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:402)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.sendKeys(Unknown Source)\r\n\tat pageObjects.HomePage.searchProducts(HomePage.java:40)\r\n\tat stepDefinitions.TestCase.if_User_enters_SearchKeyword(TestCase.java:28)\r\n\tat ✽.When User enters SearchKeyword(HomePage.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TestCase.click_the_search_icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestCase.user_should_be_able_to_get_the_expected_product()"
});
formatter.result({
  "status": "skipped"
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
  "duration": 5767537,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d60.0.3112.113)\n  (Driver info: chromedriver\u003d2.30.477700 (0057494ad8732195794a7b32078424f92a5fce41),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 5 milliseconds\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027AMRA\u0027, ip: \u0027192.168.10.37\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.30.477700 (0057494ad8732195794a7b32078424f92a5fce41), userDataDir\u003dC:\\Users\\AMRAKH~1\\AppData\\Local\\Temp\\scoped_dir5944_820}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d60.0.3112.113, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 80a615d73eebfb7656727b9b72a74201\n*** Element info: {Using\u003dxpath, value\u003d//a[text()\u003d \u0027Log In\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:671)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:410)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:509)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:402)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.click(Unknown Source)\r\n\tat pageObjects.HomePage.openLoginWindow(HomePage.java:35)\r\n\tat stepDefinitions.TestCase.he_clicks_on_login_icon(TestCase.java:58)\r\n\tat ✽.When he clicks on login icon(LoginPage.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TestCase.he_should_be_able_to_see_the_Login_Page()"
});
formatter.result({
  "status": "skipped"
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
  "duration": 170663,
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
  "duration": 8727251,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d60.0.3112.113)\n  (Driver info: chromedriver\u003d2.30.477700 (0057494ad8732195794a7b32078424f92a5fce41),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 4 milliseconds\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027AMRA\u0027, ip: \u0027192.168.10.37\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.30.477700 (0057494ad8732195794a7b32078424f92a5fce41), userDataDir\u003dC:\\Users\\AMRAKH~1\\AppData\\Local\\Temp\\scoped_dir5944_820}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d60.0.3112.113, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 80a615d73eebfb7656727b9b72a74201\n*** Element info: {Using\u003dxpath, value\u003d//input[@class \u003d \u0027_2zrpKA\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:671)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:410)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:509)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:402)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.sendKeys(Unknown Source)\r\n\tat pageObjects.LoginPage.enterEmailId(LoginPage.java:33)\r\n\tat stepDefinitions.TestCase.user_enters_Username_as_and_Password_as(TestCase.java:77)\r\n\tat ✽.When User enters Username as \"8750152322\" and Password as \"telnet@123\"(LoginPage.feature:13)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TestCase.click_the_submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestCase.user_should_be_on_the_home_page()"
});
formatter.result({
  "status": "skipped"
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
  "duration": 109224,
  "status": "passed"
});
formatter.match({
  "location": "TestCase.he_should_get_the_product_with_highest_rating()"
});
formatter.result({
  "duration": 60471284764,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d60.0.3112.113)\n  (Driver info: chromedriver\u003d2.30.477700 (0057494ad8732195794a7b32078424f92a5fce41),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027AMRA\u0027, ip: \u0027192.168.10.37\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.30.477700 (0057494ad8732195794a7b32078424f92a5fce41), userDataDir\u003dC:\\Users\\AMRAKH~1\\AppData\\Local\\Temp\\scoped_dir5944_820}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d60.0.3112.113, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 80a615d73eebfb7656727b9b72a74201\n*** Element info: {Using\u003dxpath, value\u003d//div[@class \u003d \u0027_3BTv9X\u0027]}\r\n\tat sun.reflect.GeneratedConstructorAccessor13.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:671)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:410)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:509)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:402)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.toString(Unknown Source)\r\n\tat java.lang.String.valueOf(String.java:2994)\r\n\tat java.lang.StringBuilder.append(StringBuilder.java:131)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$23.toString(ExpectedConditions.java:686)\r\n\tat java.lang.String.valueOf(String.java:2994)\r\n\tat java.lang.StringBuilder.append(StringBuilder.java:131)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)\r\n\tat pageObjects.ProductList.getProduct(ProductList.java:44)\r\n\tat stepDefinitions.TestCase.he_should_get_the_product_with_highest_rating(TestCase.java:51)\r\n\tat ✽.Then he should get the product with highest rating(ProductList.feature:8)\r\n",
  "status": "failed"
});
});