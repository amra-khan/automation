package com.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition; 
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Scenario2 {
	WebDriver driver;
	String url = "https://www.facebook.com/";
	
    @BeforeTest
      public void launchBrowser() {
    	System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get(url);
    }
    
    
    @Test(priority = 0)
      public void login() {
    	driver.findElement(By.id("email")).sendKeys("madonath5@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("tanker@123");
		driver.findElement(By.id("loginbutton")).click();
      }
    
    @Test(priority = 1)
      public void VerifyUsername() {
    	String Username = driver.findElement(By.xpath("//*[contains(@class ,'linkWrap noCount')]")).getText();
		System.out.println(Username);
	    if(Username.equalsIgnoreCase("madona thakur")) {
	    	System.out.println("test passed for username verification");
	    }
    }
    
    @Test(priority = 2)
      public void SendMessage() {
      WebElement msgIcon=driver.findElement(By.xpath("(//div[@class='_2n_9'])[2]"));
	  msgIcon.click();
	  WebElement newMsg=driver.findElement(By.xpath("//a[text()='New Message']"));
	  newMsg.click();
	  driver.findElement(By.xpath("//input[@class='inputtext textInput']")).sendKeys("Qamer Asiftah");
	  WebDriverWait wait1=new WebDriverWait(driver,40);                                   //EXPLICIT WAIT
	  wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='user selected']//span[text()='Qamer Asiftah']")));
	  driver.findElement(By.xpath("//li[@class='user selected']//span[text()='Qamer Asiftah']")).click(); 
	  WebElement e3= driver.findElement(By.xpath("//div[contains(@class,'_1mf')]")); 		
	  Actions actions = new Actions(driver);
	  actions.moveToElement(e3);
	  actions.click();
	  actions.sendKeys("Yo!");         
	  actions.build().perform();
	  driver.findElement(By.xpath("(//a[contains(@class,'close button')])")).click();
        
        
//        Actions action = new Actions(driver);
//        action.moveToElement().click().build().perform();
//        driver.findElement(By.xpath("//a[@id = 'u_0_f']")).click();
        
    }
    
//    @Test(priority = 2)
//      public void PostonYourWall() {
//        driver.findElement(By.xpath("//a[contains(@data-gt,'home_chrome')]"));
//    	WebElement status = driver.findElement(By.xpath("//div[contains(@class, 'navigationFocus')]"));
//    	status.sendKeys("hello");
//    	Actions act = new Actions(driver);
//    	WebElement post = driver.findElement(By.xpath("//button[contains(@data-testid , 'post-button')]"));
//    	act.moveToElement(post).click().build().perform();
//    	
//    
//    }

	 
	 @AfterTest
	  public void closeBrowser() {
		 driver.close();
	 }
   	
    
    
    
    		
   }
   
    

