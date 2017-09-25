package testcases;

import java.io.IOException;
import java.sql.SQLException;

import jxl.read.biff.BiffException;

import org.openqa.selenium.By;

import testscripts.DriverScript;
import testscripts.FunctionLibrary;
import testscripts.GpsLibrary;

public class Sendmessage extends DriverScript {

    /**
     * @param args
     */
    // verifyMessageElements
    public static String verifyMessageElements() throws SQLException,
	    InterruptedException, IOException {

	APPLICATION_LOGS
		.debug("Executing test case : Verifying the attributes of Send Message Page");
	GpsLibrary.navigate();
	// Verify whether Username input-box, Password input-box and SignIn
	// button present on the page or not
	GpsLibrary.login(3);
	FunctionLibrary.clickAndWait(By.id("ucGPSMenu_hlnkWriteMessage"),
		"New Message");
	Boolean addToField = FunctionLibrary.isElementPresent(
		By.id("grouplink_txtAddPerson"), "grouplink_txtAddPerson");
	Boolean fromFieldPresent = FunctionLibrary.isElementPresent(
		By.id("txtFrom"), "txtFrom");
	Boolean subjectFieldPresent = FunctionLibrary.isElementPresent(
		By.id("txtSubject"), "txtSubject");
	Boolean messageEditor = FunctionLibrary.isElementPresent(
		By.id("cke_txtEditorMessage"), "cke_txtEditorMessage");
	if (!addToField && !fromFieldPresent && !subjectFieldPresent
		&& !messageEditor) {
	    return "Fail: Send Message Page Attributes Failed to show up";
	}
	return "Pass: All elements are present in the Send Message Page";

    }

    // checkMessageRecieved
    public static String checkMessageRecieved() throws SQLException,
	    InterruptedException, IOException, BiffException {

	APPLICATION_LOGS
		.debug("Executing test case : Verifying the attributes of Send Message Page");
	GpsLibrary.navigate();
	// Verify whether Username input-box, Password input-box and SignIn
	// button present on the page or not
	GpsLibrary.login(3);
	FunctionLibrary.clickAndWait(By.id("ucGPSMenu_hlnkWriteMessage"),
		"New Message");
	String sendername = testData.getCellData("Login", "UserId_In", 2);
	String fromName = "Priyadarshan Mohanty";
	FunctionLibrary.waitForPageToLoad();
	FunctionLibrary.inputChord(By.id("grouplink_txtAddPerson"),
		"grouplink_txtAddPerson", sendername + ",");
	Thread.sleep(2000L);
	FunctionLibrary.clickLink(By.id("grouplink_btnAddUser"),
		"Add User button");
	FunctionLibrary.waitForPageToLoad();
	String subject = "Test Sitam Message";
	FunctionLibrary.inputChord(By.id("txtSubject"), "txtSubject", subject);
	FunctionLibrary.clickLink(By.id("cke_51_label"),
		"click on source button");
	FunctionLibrary.inputChord(
		By.xpath("//*[@id='cke_contents_txtEditorMessage']/textarea"),
		"textmessage", "Test Message Inputted");
	// btnSend
	FunctionLibrary.clickAndWait(By.id("btnSend"), "Click Send");
	FunctionLibrary.waitForPageToLoad();
	FunctionLibrary.clickAndWait(By.id("ucGPSMenu_hlnkGoalsheet"),
		"ucGPSMenu_hlnkGoalsheet");
	// String actMessage=FunctionLibrary.retrieveText(By.id("lblError"),
	// "lblError");
	String expMessage = "Message sent successfully.";
	String status;
	/*
	 * if (actMessage.equalsIgnoreCase(expMessage.trim())){ status= "Pass";
	 * }else{ return "Fail: There is an error in sending messages"; }
	 */
	GpsLibrary.logout();
	// Login using Sitam
	GpsLibrary.login(2);
	FunctionLibrary.clickAndWait(By.id("ucGPSMenu_hlnkMessage"),
		"ucGPSMenu_hlnkMessage");
	// String
	// actSubject=FunctionLibrary.retrieveText(By.id("gvMessageList_ctl02_hlnkMessageSubject"),
	// "gvMessageList_ctl02_hlnkMessageSubject");
	String subjectStatus = FunctionLibrary.assertText(subject.trim(),
		FunctionLibrary.retrieveText(
			By.id("gvMessageList_ctl02_hlnkMessageSubject"),
			"gvMessageList_ctl02_hlnkMessageSubject"));
	System.out.println("test" + subjectStatus);
	String actFromName = FunctionLibrary.retrieveText(
		By.id("gvMessageList_ctl02_hlinkUser"),
		"gvMessageList_ctl02_hlinkUser");
	System.out.println(actFromName);
	if (subjectStatus.equals("Pass")
		&& actFromName.trim().contains(fromName.trim())) {
	    return "Pass";
	    /*
	     * if (fromName.trim().contains(actFromName.trim())) {
	     * status="Pass"; return
	     * "Pass: The message was sent successfully by the sender and recieved successfully by the reciever"
	     * ; }else{ return "Fail: The message was not sent successfully"; }
	     */
	}
	return "Fail: The message was not sent successfully";

    }

}
