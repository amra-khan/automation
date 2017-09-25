package com.maven.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DateTimeTest {
  
	
	@Test
  public void f() {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id = 'datepicker']")).click();
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[1]")).click();
		WebElement picker = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']"));
		List <WebElement> rows = picker.findElements(By.tagName("tr"));
		
		List<WebElement> columns = picker.findElements(By.tagName("td"));
		for(WebElement box : columns){
			if(box.getText().equals(13)) {
				
				box.findElement(By.linkText("17")).click();
				break;
			}
			
		}
		driver.close();
  }
	
}
