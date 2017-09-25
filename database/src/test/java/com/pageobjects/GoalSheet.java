package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoalSheet {
     
	public WebDriver driver;
	public GoalSheet(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//span[contains(@id , 'dtGoalDate_label')]")
	private WebElement date;
	
	@FindBy(xpath = "//span[contains(@id , 'ctl02_lblGoals')]")
	private WebElement firstGoal;
	
	@FindBy(xpath = "//span[contains(@id , 'ctl03_lblGoals')]")
	private WebElement secondGoal;
	
	@FindBy(xpath = "//span[contains(@id , 'ctl04_lblGoals')]")
	private WebElement thirdGoal;
	


    public String getDate() {
    	String sheetDate = date.getText();
    	return sheetDate;
    }
    
    public String getFirstGoal() {
    	return firstGoal.getText();
    }
    
    public String getSecondGoal() {
    	return secondGoal.getText();
    }
    
    public String getThirdGoal() {
    	return thirdGoal.getText();
    }
}