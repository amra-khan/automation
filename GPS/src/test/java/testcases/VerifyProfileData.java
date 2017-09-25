/**
 *  VerifyProfileDate.java contains all the necessary methods need for verifying GPS Profile data
 */

package testcases;

import java.io.IOException;

import jxl.read.biff.BiffException;

import org.openqa.selenium.By;

import testscripts.DriverScript;
import testscripts.FunctionLibrary;
import testscripts.GpsLibrary;

/**
 * @author Mindfire
 * 
 */

public class VerifyProfileData extends DriverScript {

    // Expected page titles
    public static String gpsMyProfilePageTitle = GpsLibrary.userName
	    + " | MyProfile | www.ourgoalplan.com";

    /*
     * .............. Name of the WebElements present on the WebPage
     * .................
     */

    public static String nameMyProfileLink = "'My Profile' link";
    public static String nameHRInfoLink = "'HR Info' link";
    public static String nameHRInfoText = "'HR Info' text";
    public static String nameEmployeeID = "'Employee ID' text";
    public static String nameMindfireEmailID = "'Mindfire Email ID' text";

    /* .............. Locators for the test ................. */

    public static By locatorMyProfileLink = By
	    .xpath("//div[@id='upPnlMenu']//div[@id='ucGPSMenu_pnlMyProfile']//a[@id='ucGPSMenu_hlnkMyProfile']");
    public static By locatorHRInfoLink = By
	    .xpath("//div[@id='TabContainer1_header']//span[@id='__tab_TabContainer1_view7']");
    public static By locatorHRInfoText = By
	    .xpath("//div[@id='TabContainer1_view7_pnlHRInfo']//span[@id='TabContainer1_view7_lblCollapsiblHrDetails']");
    public static By locatorEmployeeID = By
	    .xpath("//div[@id='TabContainer1_view7_pnlHrDetails']//span[@id='TabContainer1_view7_lblEmployeeId']");
    public static By locatorMindfireEmailID = By
	    .xpath("//div[@id='TabContainer1_view7_pnlConatctInfo']//span[@id='TabContainer1_view7_lblMindfireID']");

    // Navigate and login to GPS
    public static String navigateAndLoginToGPS() throws InterruptedException,
	    IOException, BiffException {

	APPLICATION_LOGS
		.debug("Executing test case : Navigate and login to GPS");
	System.out.println("Executing test case : Navigate and login to GPS");

	// Navigate and login to GPS
	methodReturnResult = GpsLibrary.navigateAndLoginToGPS();
	if (methodReturnResult.contains(failTest)) {
	    return methodReturnResult;
	}

	// Logout from GPS
	methodReturnResult = GpsLibrary.logout();
	if (methodReturnResult.contains(failTest)) {
	    return methodReturnResult;
	}

	return "Pass : Navigated and logged in to GPS";

    }

    // Navigate to My Profile page
    public static String navigateToMyProfile() throws InterruptedException,
	    IOException, BiffException {

	APPLICATION_LOGS
		.debug("Executing test case : Navigate to My Profile page");
	System.out.println("Executing test case : Navigate to My Profile page");

	// Navigate and login to GPS
	methodReturnResult = GpsLibrary.navigateAndLoginToGPS();
	if (methodReturnResult.contains(failTest)) {
	    return methodReturnResult;
	}

	// Navigate to My Profile page
	methodReturnResult = VerifyProfileData.navigateToGPSMyProfilePage();
	if (methodReturnResult.contains(failTest)) {
	    return methodReturnResult;
	}

	// Logout from GPS
	methodReturnResult = GpsLibrary.logout();
	if (methodReturnResult.contains(failTest)) {
	    return methodReturnResult;
	}

	return "Pass : Navigated to My Profile page";

    }

    // Move to HR Info section and verify employee details
    public static String moveToHRInfoSectionAndVerify()
	    throws InterruptedException, IOException, BiffException {

	APPLICATION_LOGS
		.debug("Executing test case : Move to HR Info section and verify employee details");
	System.out
		.println("Executing test case : Move to HR Info section and verify employee details");

	// Navigate and login to GPS
	methodReturnResult = GpsLibrary.navigateAndLoginToGPS();
	if (methodReturnResult.contains(failTest)) {
	    return methodReturnResult;
	}

	// Navigate to My Profile page
	methodReturnResult = VerifyProfileData.navigateToGPSMyProfilePage();
	if (methodReturnResult.contains(failTest)) {
	    return methodReturnResult;
	}

	// Move to HR Info section
	methodReturnResult = VerifyProfileData.moveToHRInfo();
	if (methodReturnResult.contains(failTest)) {
	    return methodReturnResult;
	}

	/*
	 * .............. Verify Employee details from HR Info section
	 * .............
	 */

	// Verify Employee ID
	String employeeID = testData.getCellData("Login", "EmpId_In", 1);
	String expectedText = employeeID;
	String actualText = FunctionLibrary.retrieveText(locatorEmployeeID,
		nameEmployeeID);
	methodReturnResult = FunctionLibrary.assertText(nameEmployeeID,
		actualText, expectedText);
	if (methodReturnResult.contains(failTest))
	    return methodReturnResult;

	// Verify Mindfire Email ID
	String mindfireEmailID = testData.getCellData("Login", "EmailId_In", 1);
	expectedText = mindfireEmailID;
	actualText = FunctionLibrary.retrieveText(locatorMindfireEmailID,
		nameMindfireEmailID);
	methodReturnResult = FunctionLibrary.assertText(nameMindfireEmailID,
		actualText, expectedText);
	if (methodReturnResult.contains(failTest))
	    return methodReturnResult;

	// Logout from GPS
	methodReturnResult = GpsLibrary.logout();
	if (methodReturnResult.contains(failTest)) {
	    return methodReturnResult;
	}

	return "Pass : Moved to HR Info section and verified Employee details";

    }

    /* ............... Library methods section ................ */

    // Navigate to My Profile page
    public static String navigateToGPSMyProfilePage() {

	APPLICATION_LOGS.debug("Navigating to GPS My Profile page ...");
	System.out.println("Navigating to GPS My Profile page ...");

	// Check whether 'My Profile' link present on the page or not
	if (!FunctionLibrary.isElementPresent(locatorMyProfileLink,
		nameMyProfileLink))
	    return "Fail : My Profile link is not Present on the page";

	// Click on 'My Profile' link and wait for page to load
	FunctionLibrary.clickAndWait(locatorMyProfileLink, nameMyProfileLink);

	// Verify we navigated to 'My Profile' page
	expectedTitle = gpsMyProfilePageTitle;
	methodReturnResult = FunctionLibrary.assertTitle(expectedTitle);
	if (methodReturnResult.contains(failTest)) {
	    return methodReturnResult;
	}

	return "Pass : Navigated to My Profile page";

    }

    // Move to HR Info section
    public static String moveToHRInfo() {

	APPLICATION_LOGS.debug("Moving to HR Info section ...");
	System.out.println("Moving to HR Info section ...");

	// Check whether 'HR Info' link present on the page or not
	if (!FunctionLibrary
		.isElementPresent(locatorHRInfoLink, nameHRInfoLink))
	    return "Fail : My Profile link is not Present on the page";

	// Click on 'HR Info' link and wait for page to load
	FunctionLibrary.clickAndWait(locatorHRInfoLink, nameHRInfoLink);

	// Verify we navigated to 'HR Info' section
	String expectedText = "HR Details";
	String actualText = FunctionLibrary.retrieveText(locatorHRInfoText,
		nameHRInfoText);
	methodReturnResult = FunctionLibrary.assertText(nameHRInfoText,
		actualText, expectedText);
	if (methodReturnResult.contains(failTest)) {

	    // Log result
	    APPLICATION_LOGS.debug("Not navigated to HR Info section");
	    System.err.println("Not navigated to HR Info section");
	    return methodReturnResult;

	}

	return "Pass : Moved to HR Info section";

    }

}
