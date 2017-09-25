package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinitions.*;

public class LoginPage {
	
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//input[@class = '_2zrpKA']")
	private WebElement emailId;
	
	@FindBy(xpath = "//input[@type = 'password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type = 'submit']")
	private WebElement loginButton;
	
	
	
	public void enterEmailId(String email) {
		emailId.sendKeys(email);
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickLoginButton() {
		System.out.println(driver);
		
		Actions action = new Actions(driver);
		action.click(loginButton);
	}
  }
