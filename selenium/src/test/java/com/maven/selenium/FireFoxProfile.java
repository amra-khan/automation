package com.maven.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.Test;

public class FireFoxProfile {
	WebDriver driver;
	 
   @Test	
   public  void firefoxTest() {
	   System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
	   ProfilesIni profile = new ProfilesIni();
	   FirefoxProfile myprofile = profile.getProfile("myfirefox");
	  
	   driver = new FirefoxDriver(myprofile);
	   driver.manage().window().maximize();
	   driver.get("http://www.google.com");
	   driver.close();
	   
   }
}