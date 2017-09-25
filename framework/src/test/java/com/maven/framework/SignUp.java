package com.maven.framework;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp {
//    WebDriver driver ;
    
	@FindBy(id="firstname")
	private WebElement firstName;
	
	@FindBy(id="lastname")
	private WebElement lastName;

	@FindBy(id="address")
	private WebElement address;

	@FindBy(id="zipcode")
	private WebElement zipCode;
	
	@FindBy(id="signup")
	private WebElement submitButton;
	
//	public SignUp(WebDriver driver) {
//		this.driver = driver;
//		PageFactory.initElements(driver, this);
//	}
//	
	public void enterName(String firstField, String lastField) {
		
		firstName.sendKeys(firstField);
		lastName.sendKeys(lastField);
		System.out.println(";;ll;l "+firstField);
		
	}
	public void enterAddress(String addressField) {
		
		address.sendKeys(addressField);
	}
	
	public void enterZipcode(String zipcodeField) {
		zipCode.sendKeys(zipcodeField);
	}
	
	
	public void clickSignUpButton() {
		submitButton.click();
		
	}
}
