package com.maven.framework;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;

public class SecondPage {
     
//	  WebDriver driver;
//	  public SecondPage(WebDriver driver) {
//		  this.driver = driver;
//		  
//		 
//	  }
	
      @FindBy(tagName ="h1")
      private WebElement heading;
      
      @FindBy(tagName = "p")
      private WebElement paragraph;
      
      
      public String headingConfirmation() {
    	  return heading.getText();
      }
}
