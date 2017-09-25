package com.maven.selenium;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.io.File;


public class Screenshot {
	 WebDriver driver;
	 public String baseUrl = "http://demo.guru99.com/selenium/newtours/";
	  @Test
	  public void takescreenshot() {
		  System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get(baseUrl);
		   File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   try {
		   FileUtils.copyFile(src, new File("D:\\screenshot.png")) ;
		   }catch(Exception e) {
			   e.printStackTrace();
		   }
			

	  }
}