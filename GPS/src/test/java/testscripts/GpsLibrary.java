package testscripts;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class GpsLibrary extends DriverScript {

    // Stores current window handle
    public static String currentWindowHandle;

    // Store method return result
    public static String methodReturnResult = null;

    // Site name
    public static String testSiteName = "GPS";

    // User name
    public static String userName = null;

    // Expected page titles
    public static String gpsLoginPageTitle = "Login | www.ourgoalplan.com";
    public static String gpsGoalSheetPageTitle = null;
    public static String gpsMyProfilePageTitle = null;

    /*
     * .............. Name of the WebElements present on the WebPage
     * .................
     */

    public static String nameUserNameInputBox = "'Username' Input-box";
    public static String namePasswordInputBox = "'Password' Input-box";
    public static String nameLogInButton = "'LogIn' Button";
    public static String nameLogOutLink = "'Log Out' link";
    public static String nameUserName = "User name";
    public static String nameMyProfileLink = "'My Profile' link";

    /* .............. Locators for the test ................. */

    public static By locatorUserNameInputBox = By.xpath("//*[@id='txtName']");
    public static By locatorPasswordInputBox = By
	    .xpath("//*[@id='txtPassword']");
    public static By locatorLogInButton = By.xpath("//*[@id='btnLogin']");
    public static By locatorLogOutLink = By
	    .xpath("//a[@id='ucGPSMenu_lnkLogout']");
    public static By locatorUserName = By
	    .xpath("//table[@id='Table1']//a[@id='hyplinkMember']");
    public static By locatorMyProfileLink = By
	    .xpath("//div[@id='upPnlMenu']//div[@id='ucGPSMenu_pnlMyProfile']//a[@id='ucGPSMenu_hlnkMyProfile']");

    // Create a browser instance and navigate to the test site
    public static String navigate() throws MalformedURLException,
	    InterruptedException {

	System.out.println("Navigating to the test site - " + testSiteName
		+ " ...");
	APPLICATION_LOGS.debug("Navigating to the test site - " + testSiteName
		+ " ...");

	// Open a driver instance if not opened already

	try {

	    if (wbdv == null) {

		if (CONFIG.getProperty("is_remote").equals("true")) {

		    // Generate Remote address
		    String remote_address = "http://"
			    + CONFIG.getProperty("remote_ip") + ":4444/wd/hub";
		    remote_url = new URL(remote_address);

		    if (CONFIG.getProperty("test_browser").equals(
			    "InternetExplorer"))
			dc = DesiredCapabilities.internetExplorer();

		    else if (CONFIG.getProperty("test_browser").equals(
			    "Firefox"))
			dc = DesiredCapabilities.firefox();

		    else if (CONFIG.getProperty("test_browser")
			    .equals("Chrome"))
			dc = DesiredCapabilities.chrome();

		    // Initiate Remote Webdriver instance
		    wbdv = new RemoteWebDriver(remote_url, dc);

		}

		else {

		    if (CONFIG.getProperty("test_browser").equals(
			    "InternetExplorer"))
			wbdv = new InternetExplorerDriver();

		    else if (CONFIG.getProperty("test_browser").equals(
			    "Firefox"))
			wbdv = new FirefoxDriver();

		    else if (CONFIG.getProperty("test_browser")
			    .equals("Chrome"))
			wbdv = new ChromeDriver();

		}

	    }

	}

	catch (Throwable initException) {

	    APPLICATION_LOGS.debug("Error came while initiating driver : "
		    + initException.getMessage());
	    System.err.println("Error came while initiating driver : "
		    + initException.getMessage());

	}

	// Initiate Event Firing Web Driver instance
	driver = new EventFiringWebDriver(wbdv);

	// Implicitly wait for 30 seconds for browser to open
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	// Delete all browser cookies
	driver.manage().deleteAllCookies();

	// Navigate to Curaspan application
	driver.navigate().to(CONFIG.getProperty("test_site_url"));

	// Maximize browser window
	driver.manage().window().maximize();

	// Verify Login page appears
	expectedTitle = gpsLoginPageTitle;
	methodReturnResult = FunctionLibrary.assertTitle(expectedTitle);
	if (methodReturnResult.contains(failTest)) {

	    // Log result
	    APPLICATION_LOGS.debug("Not navigated to the test site - "
		    + testSiteName);
	    System.err.println("Not navigated to the test site - "
		    + testSiteName);
	    return methodReturnResult;

	}

	APPLICATION_LOGS.debug("Navigated to the test site - " + testSiteName);
	System.out.println("Navigated to the test site - " + testSiteName);

	return "Pass : Navigated to the test site - " + testSiteName;

    }

    // Login to the application
    public static String login(int Data_Row_No) throws InterruptedException,
	    IOException {

	APPLICATION_LOGS.debug("Logging in to the test site - " + testSiteName);
	System.out.println("Logging in to the test site - " + testSiteName);

	String userName = null;
	String password = null;

	try {

	    userName = testData.getCellData("Login", "UserId_In", Data_Row_No);

	    password = testData
		    .getCellData("Login", "Password_In", Data_Row_No);

	    APPLICATION_LOGS
		    .debug("Successfully Retrieved data from Xls File :-  Username : "
			    + userName + " and Password : " + password);
	    System.out
		    .println("Successfully Retrieved data from Xls File :-  Username : "
			    + userName + " and Password : " + password);

	}

	catch (Exception e) {

	    APPLICATION_LOGS.debug("Error while retrieving data from xls file"
		    + e.getMessage());
	    System.out.println("Error while retrieving data from xls file"
		    + userName);
	    return "Fail : Error while retrieving data from xls file";

	}

	// Verify whether Username input-box, Password input-box and SignIn
	// button present on the page or not
	Boolean usernameFieldPresent = FunctionLibrary.isElementPresent(
		locatorUserNameInputBox, nameUserNameInputBox);
	Boolean passwdFieldPresent = FunctionLibrary.isElementPresent(
		locatorPasswordInputBox, namePasswordInputBox);
	Boolean signInButtonPresent = FunctionLibrary.isElementPresent(
		locatorLogInButton, nameLogInButton);

	if (!usernameFieldPresent && !passwdFieldPresent
		&& !signInButtonPresent) {
	    return "Fail : Username Field or Password Field or SignIn button is not present on the page ";
	}

	// Clear Username input-box and input username
	FunctionLibrary.clearField(locatorUserNameInputBox,
		nameUserNameInputBox);
	FunctionLibrary.input(locatorUserNameInputBox, nameUserNameInputBox,
		userName);

	// Clear Password input-box and input password
	FunctionLibrary.clearField(locatorPasswordInputBox,
		namePasswordInputBox);
	FunctionLibrary.input(locatorPasswordInputBox, namePasswordInputBox,
		password);

	// Click on the Log in button
	FunctionLibrary.clickAndWait(locatorLogInButton, nameLogInButton);

	APPLICATION_LOGS.debug("Successfully logged in to the test site - "
		+ testSiteName);
	System.out.println("Successfully logged in to the test site - "
		+ testSiteName);

	return "Pass : Logged in to the test site - " + testSiteName;

    }

    // Login to the application
    public static String verifyGoalSheetPage() throws BiffException,
	    IOException {

	APPLICATION_LOGS.debug("Verifying GPS Goal Sheet page appears");
	System.out.println("Verifying GPS Goal Sheet page appears");

	// Verify user goal sheet page appears
	userName = testData.getCellData("Login", "UserName", 1);

	gpsGoalSheetPageTitle = userName
		+ " | Goal Sheet | www.ourgoalplan.com";
	expectedTitle = gpsGoalSheetPageTitle;

	methodReturnResult = FunctionLibrary.assertTitle(expectedTitle);
	if (methodReturnResult.contains(failTest)) {

	    // Log result
	    APPLICATION_LOGS.debug("Not navigated to the Goal Sheet page");
	    System.err.println("Not navigated to the Goal Sheet page");
	    return methodReturnResult;

	}

	// Verify User name appears on Goal Sheet page
	userName = testData.getCellData("Login", "UserName", 1);
	String expectedUserName = userName;
	String actualUserName = FunctionLibrary.retrieveText(locatorUserName,
		nameUserName);
	methodReturnResult = FunctionLibrary.assertText(nameUserName,
		actualUserName, expectedUserName);
	if (methodReturnResult.contains(failTest)) {

	    // Log result
	    APPLICATION_LOGS
		    .debug("User name appears on GPS Goal Sheet page is not correct");
	    System.err
		    .println("User name appears on GPS Goal Sheet page is not correct");
	    return methodReturnResult;

	}

	return "Pass : GPS Goal Sheet page appears";

    }

    // Navigate and login to GPS
    public static String navigateAndLoginToGPS() throws InterruptedException,
	    IOException, BiffException {

	// Navigate to GPS
	methodReturnResult = GpsLibrary.navigate();
	if (methodReturnResult.contains(failTest)) {
	    return methodReturnResult;
	}

	// Login to GPS
	methodReturnResult = GpsLibrary.login(1);
	if (methodReturnResult.contains(failTest)) {
	    return methodReturnResult;
	}

	// Verify GPS Goal Sheet page appears
	methodReturnResult = GpsLibrary.verifyGoalSheetPage();
	if (methodReturnResult.contains(failTest)) {
	    return methodReturnResult;
	}

	return "Pass : Navigated and logged in to GPS";

    }

    // Logout from the application
    public static String logout() throws InterruptedException {

	APPLICATION_LOGS
		.debug("Logging out of the test site - " + testSiteName);
	System.out.println("Logging out of the test site - " + testSiteName);

	// Click on 'Log Out'
	methodReturnResult = FunctionLibrary.clickLink(locatorLogOutLink,
		nameLogOutLink);
	Thread.sleep(5000L);
	FunctionLibrary.waitForPageToLoad();
	if (methodReturnResult.contains(failTest)) {
	    return methodReturnResult;
	}

	// Delete all cookies
	try {
	    driver.manage().deleteAllCookies();
	}

	catch (Throwable deleteCookieException) {

	    APPLICATION_LOGS.debug("Error came while clearing cookies : "
		    + deleteCookieException.getMessage());
	    System.err.println("Error came while clearing cookies : "
		    + deleteCookieException.getMessage());

	}

	// Verify user logged out successfully
	expectedTitle = gpsLoginPageTitle;
	methodReturnResult = FunctionLibrary.assertTitle(expectedTitle);
	if (methodReturnResult.contains(failTest)) {

	    // Log result
	    APPLICATION_LOGS.debug("User not logged out of the test site - "
		    + testSiteName);
	    System.err.println("User not logged out of the test site - "
		    + testSiteName);
	    return methodReturnResult;

	}

	APPLICATION_LOGS.debug("Successfully logged out of  the test site - "
		+ testSiteName);
	System.out.println("Successfully logged out of the test site - "
		+ testSiteName);

	return "Pass : Logged out the test site - " + testSiteName;

    }

}
