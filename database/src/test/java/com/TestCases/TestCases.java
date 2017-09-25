package com.TestCases;
import java.util.ArrayList;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pageobjects.*;
import com.maven.database.*;

public class TestCases extends FunctionalTests {
	
	@Test(priority = 0)
	public void loginPageTest() {
		LoginPage login = new LoginPage(driver);
		login.enterUserName("amrak");
		login.enterPassword("amra@tester");
		login.clickLoginButtton();
	}
  
	
	@Test(priority = 1)
	public void HomePageTest() {
		HomePage home = new HomePage(driver);
		home.clickGoalSheet();
	}
	
	@Test(priority= 2)
	public void goalSheetTest() {
		GoalSheet sheet = new GoalSheet(driver);
		sheet.getDate();
		String array[] = new String[3];
	    array[0]=sheet.getFirstGoal();
		array[1]= sheet.getSecondGoal();
		array[2]= sheet.getThirdGoal();
		for(int i = 0 ;i<3;i++) {
		System.out.println(array[i]);
		}
		//ReadDatabase data = PageFactory.initElements(driver, ReadDatabase.class);
		 ReadDatabase.getDatafromDatabase();
	
			 
		 }
	
	}

