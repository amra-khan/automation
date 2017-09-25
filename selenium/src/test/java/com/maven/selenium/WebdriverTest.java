
package com.maven.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;
public class WebdriverTest {
		
	 WebDriver driver;
	 public String baseUrl = "http://demo.guru99.com/selenium/newtours/";
	  @Test
	  public void verifySearch() {
		  System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			System.out.println("launching chrome browser"); 
		      driver.get(baseUrl);
		      String expectedTitle = "Welcome: Mercury Tours";
		      String actualTitle = driver.getTitle();
		      Assert.assertEquals(actualTitle, expectedTitle);
		      driver.close();
	  }
	}


