package com.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Testgroups {
	
	WebDriver driver;
	
	@Test(groups = {"gmail", "facebook"})
       public void init() {
		driver.manage().window().maximize();
	}
	
	@Test(groups = {"gmail"})
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://mail.google.com/");
		driver.findElement(By.xpath("//input[@id = 'identifierId']")).sendKeys("madonath5");
	
		WebElement next = driver.findElement(By.xpath("//div[@id = 'identifierNext']"));
		Actions action = new Actions(driver);
		action.moveToElement(next).click().build().perform();
		driver.findElement(By.xpath("//input[@class = 'whsOnd zHQkBf']")).sendKeys("tanker@123");
		next = driver.findElement(By.xpath("//div[@id = 'ZFr60d CeoRYc']"));
		action.moveToElement(next).click().build().perform();
		
	}
	@Test(groups = {"facebook"})
	public void login() {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("madonath5@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("tanker@123");
		driver.findElement(By.id("loginbutton")).click();
	}
	 
	 
    @AfterTest
     void close() {
    	driver.close();
    	
    }

}
