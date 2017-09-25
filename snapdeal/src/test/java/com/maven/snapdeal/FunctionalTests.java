package com.maven.snapdeal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class FunctionalTests {
	
	protected  WebDriver driver;
	
	@BeforeClass
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
	}
	

	@AfterClass
	public  void closeSetUp(){
		driver.close();
	}	


}
