package testcases;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import junit.framework.Assert;

import testscripts.DriverScript;
import testscripts.FunctionLibrary;
import testscripts.GpsLibrary;


public class verifyLoginPage extends DriverScript {
	/* .............. Name of the WebElements present on the WebPage ................. */

	public static String nameUserNameInputBox = "'Username' Input-box";
	public static String namePasswordInputBox = "'Password' Input-box";
	public static String nameLogInButton = "'SignIn' Button";
	public static String nameLogOutLink = "'Log Out' link";




	/* .............. Locators for the test ................. */

	public static By locatorUserNameInputBox = By.xpath("//*[@id='txtName']");
	public static By locatorPasswordInputBox = By.xpath("//*[@id='txtPassword']");
	public static By locatorLogInButton = By.xpath("//*[@id='btnLogin']");
	public static By locatorLogOutLink = By.xpath("//div[@id='upPnlMenu']//a[@id='ucGPSMenu_lnkLogout']");



	// Click on Book Referral button for patient with no providers notified
	public static String verifyElements() throws SQLException, InterruptedException, IOException
	{

		APPLICATION_LOGS.debug("Executing test case : Verifying all the attributes of the Login Page");
		GpsLibrary.navigate();
		// Verify whether Username input-box, Password input-box and SignIn button present on the page or not
		Boolean usernameFieldPresent=FunctionLibrary.isElementPresent(locatorUserNameInputBox, nameUserNameInputBox);
		Boolean passwdFieldPresent=FunctionLibrary.isElementPresent(locatorPasswordInputBox, namePasswordInputBox);
		Boolean signInButtonPresent=FunctionLibrary.isElementPresent(locatorLogInButton, nameLogInButton);

		if(!usernameFieldPresent && !passwdFieldPresent && !signInButtonPresent )
		{
			return "Fail : Username Field or Password Field or SignIn button is not present on the page ";
		}
		return "Pass: All elements are present in the Login Page";


	}

}