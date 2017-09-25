package com.maven.selenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UploadAndDownload {
	WebDriver driver;
//	ProfilesIni profile = new ProfilesIni();
//	FirefoxProfile myprofile = profile.getProfile("myfirefox");
//
//	
	@Test
	public void uploadFiles() throws IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.get("http://png2jpg.com/");
		driver.findElement(By.xpath("//span[text()='Upload Files']")).click();
		Runtime.getRuntime().exec("D:\\Script1.exe");
		
	
		
		
	}
	@Test
	public void downloadFiles() {
		// Create a profile
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		//driver = new  FirefoxDriver();
		FirefoxProfile profile=new FirefoxProfile();
//		driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/");
//	    driver.findElement(By.linkText("smilechart.xls")).click();
	    profile.setPreference("browser.download.folderList", 1);
	    profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/octet-stream,application/zip");
	    //FirefoxProfile profile=new FirefoxProfile();
	    driver = new FirefoxDriver(profile);
		driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/");
	    driver.findElement(By.linkText("smilechart.xls")).click();

		 
		
		    
     }
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
 }
