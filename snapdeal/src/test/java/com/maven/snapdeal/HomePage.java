package com.maven.snapdeal;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends  FunctionalTests{
    private WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver  = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[contains(@id , 'ValEnter')]")
	private WebElement searchBar;
	
	@FindBy(xpath = "//button[contains(@class,'searchformButton')]")
	private WebElement searchButton;


   public void enterSearchKeyword(String name) {
	   searchBar.click();
	   searchBar.sendKeys(name);
	 
   }
   
   public void clickSearchButton() {
	   searchButton.click();
   }
 
}