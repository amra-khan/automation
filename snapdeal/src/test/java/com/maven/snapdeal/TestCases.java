package com.maven.snapdeal;

import java.awt.AWTException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCases extends FunctionalTests {
	
	@Test(priority = 0)
	public void HomePageTest() throws InterruptedException {
		HomePage home = new HomePage(driver);
	
			home.enterSearchKeyword("apple iphone");
		
		home.clickSearchButton();
		//Thread.sleep(2000);
		
	}
   
	@Test(priority = 1)
	public void changeSliderTest() throws InterruptedException {
		ChangeSlider range = new ChangeSlider(driver);
		Thread.sleep(2000);
		range.enterFromRange("15000");
		range.enterToRange("20000");
		range.clickGo();
	}
	
	@Test(priority = 2)
	public  void priceRangeTest() {
		PriceRange price = new PriceRange(driver);
		price.verifyPriceRange();
	}
}
