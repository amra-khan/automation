/**
 *  VerifyGoalSheet.java contains all the necessary methods need for verifying Goal Sheet data
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

public class VerifyGoalSheet extends DriverScript {

    /*
     * .............. Name of the WebElements present on the WebPage
     * .................
     */

    public static String nameUserName = "'User Name' displayed on Goal Sheet page";
    public static String nameLeadName = "'Lead name(s)' displayed on Goal Sheet page";
    public static String nameGoalsMenu = "'Goals' menu";
    public static String namePeopleMenu = "'People' menu";
    public static String nameWorkMenu = "'Work' menu";
    public static String nameCatalystMenu = "'Catalyst' menu";
    public static String nameKnowledgeMenu = "'Knowledge' menu";
    public static String nameToolsMenu = "'Tools' menu";
    public static String nameMyProfileMenu = "'My Profile' menu";

    /* .............. Locators for the test ................. */

    public static By locatorUserName = By
	    .xpath("//input[@id='ucUserSearchEmpList_txtUserSearch']");
    public static By locatorLeadName = By
	    .xpath("//span[@id='lblWorksWithLead']");
    public static By locatorGoalsMenu = By
	    .xpath("//div[@id='upPnlMenu']//div[@id='ucGPSMenu_pnlGoalsHeader']//span[@id='ucGPSMenu_lblGoals']");
    public static By locatorPeopleMenu = By
	    .xpath("//div[@id='upPnlMenu']//div[@id='ucGPSMenu_pnlPeopleHeader']//span[@id='ucGPSMenu_lblPeople']");
    public static By locatorWorkMenu = By
	    .xpath("//div[@id='upPnlMenu']//div[@id='ucGPSMenu_pnlWorkHeader']//span[@id='ucGPSMenu_Label1']");
    public static By locatorCatalystMenu = By
	    .xpath("//div[@id='upPnlMenu']//div[@id='ucGPSMenu_pnlCatalystHeader']//span[@id='ucGPSMenu_lblCatalyst']");
    public static By locatorKnowledgeMenu = By
	    .xpath("//div[@id='upPnlMenu']//div[@id='ucGPSMenu_pnlKnowldgeHeader']//span[@id='ucGPSMenu_lblKnowledge']");
    public static By locatorToolsMenu = By
	    .xpath("//div[@id='upPnlMenu']//div[@id='ucGPSMenu_pnlToolsHeader']//span[@id='ucGPSMenu_lblTools']");
    public static By locatorMyProfileMenu = By
	    .xpath("//div[@id='upPnlMenu']//div[@id='ucGPSMenu_pnlMyProfileHeader']//span[@id='ucGPSMenu_lblMyProfile']");

    // Navigate to Goal Sheet page
    public static String navigateToGoalSheetPage() throws InterruptedException,
	    IOException, BiffException {

	APPLICATION_LOGS
		.debug("Executing test case : Navigate to Goal Sheet page");

	System.out.println("Executing test case : Navigate to Goal Sheet page");

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

	return "Pass : Navigated to Goal Sheet page";

    }

    // Verify user details displayed on Goal Sheet page
    public static String verifyUserDetailsOnGoalSheetPage()
	    throws InterruptedException, IOException, BiffException {

	APPLICATION_LOGS
		.debug("Executing test case : Verify user details displayed on Goal Sheet page");
	System.out
		.println("Executing test case : Verify user details displayed on Goal Sheet page");

	// Navigate and login to GPS
	methodReturnResult = GpsLibrary.navigateAndLoginToGPS();
	if (methodReturnResult.contains(failTest)) {
	    return methodReturnResult;
	}

	/*
	 * .............. Verify user details displayed on Goal Sheet page
	 * .............
	 */
	// Verify User Name displayed on the page
	String userName = testData.getCellData("Login", "UserId_In", 1);
	String expectedText = userName;
	String actualText = FunctionLibrary.retrieveAttributeValue(
		locatorUserName, "value", nameUserName);
	methodReturnResult = FunctionLibrary.assertText(nameUserName,
		actualText, expectedText);
	if (methodReturnResult.contains(failTest))
	    return methodReturnResult;

	// Verify lead name displayed on the page
	String leadName = testData.getCellData("Login", "Leads_In", 1);
	expectedText = leadName;
	actualText = FunctionLibrary
		.retrieveText(locatorLeadName, nameLeadName);
	Boolean result = FunctionLibrary.verifyPartialText(nameLeadName,
		expectedText, actualText);
	if (!result)
	    return "Fail : Incorrect Lead name(s) displayed on Goal Sheet";

	// Logout from GPS
	methodReturnResult = GpsLibrary.logout();
	if (methodReturnResult.contains(failTest)) {
	    return methodReturnResult;
	}

	return "Pass : Successfully verified username and lead information displayed on Goal Sheet";

    }

    // Verify GPS Menus
    public static String verifyGPSMenus() throws InterruptedException,
	    IOException, BiffException {

	APPLICATION_LOGS.debug("Executing test case : Verify GPS Menus");
	System.out.println("Executing test case : Verify GPS Menus");

	// Navigate and login to GPS
	methodReturnResult = GpsLibrary.navigateAndLoginToGPS();
	if (methodReturnResult.contains(failTest)) {
	    return methodReturnResult;
	}

	/* .............. Verify GPS Menus ............. */
	// Verify 'Goals' menu displayed on the page
	String expectedText = "Goals";
	String actualText = FunctionLibrary.retrieveText(locatorGoalsMenu,
		nameGoalsMenu);
	methodReturnResult = FunctionLibrary.assertText(nameGoalsMenu,
		actualText, expectedText);
	if (methodReturnResult.contains(failTest))
	    return methodReturnResult;

	// Verify 'People' menu displayed on the page
	expectedText = "People";
	actualText = FunctionLibrary.retrieveText(locatorPeopleMenu,
		namePeopleMenu);
	methodReturnResult = FunctionLibrary.assertText(namePeopleMenu,
		actualText, expectedText);
	if (methodReturnResult.contains(failTest))
	    return methodReturnResult;

	// Verify 'Work' menu displayed on the page
	expectedText = "Work";
	actualText = FunctionLibrary
		.retrieveText(locatorWorkMenu, nameWorkMenu);
	methodReturnResult = FunctionLibrary.assertText(nameWorkMenu,
		actualText, expectedText);
	if (methodReturnResult.contains(failTest))
	    return methodReturnResult;

	// Verify 'Catalyst' menu displayed on the page
	expectedText = "Catalyst";
	actualText = FunctionLibrary.retrieveText(locatorCatalystMenu,
		nameCatalystMenu);
	methodReturnResult = FunctionLibrary.assertText(nameCatalystMenu,
		actualText, expectedText);
	if (methodReturnResult.contains(failTest))
	    return methodReturnResult;

	// Verify 'Knowledge' menu displayed on the page
	expectedText = "Knowledge";
	actualText = FunctionLibrary.retrieveText(locatorKnowledgeMenu,
		nameKnowledgeMenu);
	methodReturnResult = FunctionLibrary.assertText(nameKnowledgeMenu,
		actualText, expectedText);
	if (methodReturnResult.contains(failTest))
	    return methodReturnResult;

	// Verify 'Tools' menu displayed on the page
	expectedText = "Tools";
	actualText = FunctionLibrary.retrieveText(locatorToolsMenu,
		nameToolsMenu);
	methodReturnResult = FunctionLibrary.assertText(nameToolsMenu,
		actualText, expectedText);
	if (methodReturnResult.contains(failTest))
	    return methodReturnResult;

	// Verify 'My Profile' menu displayed on the page
	expectedText = "My Profile";
	actualText = FunctionLibrary.retrieveText(locatorMyProfileMenu,
		nameMyProfileMenu);
	methodReturnResult = FunctionLibrary.assertText(nameMyProfileMenu,
		actualText, expectedText);
	if (methodReturnResult.contains(failTest))
	    return methodReturnResult;

	// Logout from GPS
	methodReturnResult = GpsLibrary.logout();
	if (methodReturnResult.contains(failTest)) {
	    return methodReturnResult;
	}

	return "Pass : Successfully verified GPS menus displayed on Goal Sheet";

    }

}
