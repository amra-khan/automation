package com.excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	 
      @FindBy(name = "txtName")
      private WebElement login;
      
      @FindBy(name = "txtPassword")
      private WebElement password;
      
      @FindBy(name = "btnLogin")
      private WebElement loginBtn;
      
      public void enterUserName(String userName) {
    	  login.sendKeys(userName);
      }
      
      public void enterPassword(String pass) {
    	  password.sendKeys(pass);
      }
      
      public void clickLoginButton() {
    	  loginBtn.click();
      }
      
}
