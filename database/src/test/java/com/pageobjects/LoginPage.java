package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id  = "txtName")
	private WebElement login;
	
	@FindBy(id = "txtPassword")
	private WebElement pass;
	
	@FindBy(name = "btnLogin")
	private WebElement loginbtn;
	
	public void  enterUserName(String name) {
		login.sendKeys(name);
	}
	
	public void enterPassword(String password) {
		pass.sendKeys(password);
	}
	
	public void clickLoginButtton() {
		loginbtn.click();
	}
	

}
