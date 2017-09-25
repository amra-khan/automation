package com.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//a[@href = 'GoalSheet.aspx']")
	private WebElement goals;
	
	public void clickGoalSheet() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		goals.click();
	}
}
