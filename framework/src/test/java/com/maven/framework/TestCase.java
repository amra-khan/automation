package com.maven.framework;




import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;


public class TestCase extends Functional{
	//private WebDriver driver;
	//SignUp signup;
	//SecondPage page;
    
	
	@Test(priority = 0)
	public void SignUpTest() {
		
		SignUp signup = PageFactory.initElements(driver, SignUp.class);
		//PropertyConfigurator.configure("log4j.properties");
		signup.enterName("amra","khan");
		//log.debug("sending name");
		signup.enterAddress("221 baker Street");
		//log.debug("sending address");
		signup.enterZipcode("22101");
		//log.info("all details entered");
		
		signup.clickSignUpButton();
	}
	
	@Test(priority = 1)
	public void SecondPageTest() {
		SecondPage page = PageFactory.initElements(driver, SecondPage.class);
		page.headingConfirmation();
	}
	   
	
}

