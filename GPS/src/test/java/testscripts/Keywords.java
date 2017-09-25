package testscripts;

import java.io.IOException;

import jxl.read.biff.BiffException;
import testcases.Sendmessage;
import testcases.VerifyGoalSheet;
import testcases.VerifyProfileData;
import testcases.verifyLoginPage;

public class Keywords extends DriverScript {

    /*
     * ......................... Verify GoalSheet Page
     * ...............................
     */

    // Navigate to Goal Sheet page
    public static String navigateToGoalSheetPage() throws InterruptedException,
	    IOException, BiffException {

	return VerifyGoalSheet.navigateToGoalSheetPage();

    }

    // Verify user details displayed on Goal Sheet page
    public static String verifyUserDetailsOnGoalSheetPage()
	    throws InterruptedException, IOException, BiffException {

	return VerifyGoalSheet.verifyUserDetailsOnGoalSheetPage();

    }

    // Verify GPS Menus
    public static String verifyGPSMenus() throws InterruptedException,
	    IOException, BiffException {

	return VerifyGoalSheet.verifyGPSMenus();

    }

    /*
     * ......................... Verify Profile Data
     * ...............................
     */

    // Navigate and login to GPS
    public static String navigateAndLoginToGPS() throws InterruptedException,
	    IOException, BiffException {

	return VerifyProfileData.navigateAndLoginToGPS();

    }

    // Navigate to My Profile page
    public static String navigateToMyProfile() throws InterruptedException,
	    IOException, BiffException {

	return VerifyProfileData.navigateToMyProfile();

    }

    // Move to HR Info section and verify employee details
    public static String moveToHRInfoSectionAndVerify()
	    throws InterruptedException, IOException, BiffException {

	return VerifyProfileData.moveToHRInfoSectionAndVerify();

    }

    public static String logout() throws InterruptedException, IOException {
	return GpsLibrary.logout();
    }

    // Verifying all the elements on the Login Page
    public static String verifyElements() throws Throwable,
	    InterruptedException, IOException {
	APPLICATION_LOGS.debug("Executing Veify Elements");
	return verifyLoginPage.verifyElements();
    }

    // verifyMessageElements
    public static String verifyMessageElements() throws Throwable,
	    InterruptedException, IOException {
	APPLICATION_LOGS.debug("Executing verifyMessageElements");
	return Sendmessage.verifyMessageElements();
    }

    // checkMessageRecieved
    public static String checkMessageRecieved() throws Throwable,
	    InterruptedException, IOException {
	APPLICATION_LOGS.debug("Executing checkMessageRecieved");
	return Sendmessage.checkMessageRecieved();
    }

}
