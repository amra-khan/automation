package com.crossB.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Grid_2
	{
	 WebDriver driver;
	 String baseUrl,nodeUrl;
	 
	 @BeforeTest
	 @Parameters("browser")
	 public void setup(String browser) throws MalformedURLException
	 {
	  System.setProperty("webdriver.gecko.driver", "C:\\Selenium Drivers\\grid\\geckodriver.exe");  //Machine B's path
	  
	  baseUrl="https://www.timeanddate.com/worldclock/india/new-delhi";
	  
	  nodeUrl="http://192.168.11.9:5566/wd/hub"; //Machine B's URL
	  DesiredCapabilities capability = null;
	  if(browser.equalsIgnoreCase("firefox")) {
		  capability=DesiredCapabilities.firefox();
		  
		  capability.setBrowserName("firefox");
		  
	  }
	  else if(browser.equalsIgnoreCase("chrome")) {
          capability=DesiredCapabilities.chrome();
		  
		  capability.setBrowserName("chrome");
		  
	  }
	 
	 // capability.setCapability("marionette", true);
	  capability.setPlatform(Platform.WINDOWS);
	 
	  
	  
	  driver=new RemoteWebDriver(new URL(nodeUrl),capability);  //URL of remote webdriver
	 }
	 
	 @AfterTest
	 public void afterTest()
	 {
	  driver.quit();
	 }
	 
	 @Test
	 public void simpleTest()
	 {
	  driver.get(baseUrl);
	  Assert.assertEquals("Current Local Time in New Delhi, Delhi, India",driver.getTitle());
	 }

	}
// use this for connecting node
//java -jar selenium-server-standalone-3.3.1.jar -role node -hub http://192.168.1.164:4444/grid/register -port 5555
