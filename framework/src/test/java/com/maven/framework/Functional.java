package com.maven.framework;

import java.util.concurrent.TimeUnit;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

 public class Functional {
		protected  WebDriver driver;

		@BeforeClass
		@Parameters("browser")
		public void setUp(String browser){
			 Logger log = Logger.getLogger("Functional");
			 log = Logger.getRootLogger();
			 PropertyConfigurator.configure(System.getProperty("user.dir")+ "\\src\\test\\java\\log4j.properties");
			if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver = new ChromeDriver();
			 }
				else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			driver.get("http://www.kimschiller.com/page-object-pattern-tutorial/index.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			log.debug("using wait ");
		}
		
	
		@AfterClass
		public  void closeSetUp(){
			driver.close();
		}	
	}


