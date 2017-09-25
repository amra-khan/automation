package com.excel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestCase extends ReadExceL {
	protected WebDriver driver;
	
        
	@BeforeClass
	public void setUp() throws IOException{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		ReadExceL.setExcelFile();
		String url = ReadExceL.getCellData(1, 1);
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void loginPageTest() throws IOException {
		//ReadExceL obj = new  ReadExceL();
	     LoginPage object = new LoginPage(driver);
	     object.enterPassword(ReadExceL.getCellData(1, 3));
	     object.enterUserName(ReadExceL.getCellData(1, 2));
	     object.clickLoginButton();
	     if(driver.getTitle().equalsIgnoreCase("Amra Khan | Goal Sheet | www.ourgoalplan.com")){
	     ReadExceL.setExcelData("pass" , 1, 4);
	     
	     }
	}
	
	@AfterClass
	public  void closeSetUp(){
		driver.close();
	}	
		  
	  }


