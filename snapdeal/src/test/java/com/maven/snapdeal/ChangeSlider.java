package com.maven.snapdeal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChangeSlider {
	
	 private WebDriver driver;
		public ChangeSlider(WebDriver driver) {
			this.driver  = driver;
			PageFactory.initElements(driver, this);
		}
		
     @FindBy(xpath = "//input[@name = 'fromVal']")
     private WebElement sliderRangeFrom;
     
     @FindBy(xpath = "//input[@name = 'toVal']")
     private WebElement sliderRangeTo;
     
     @FindBy(xpath = "//div[contains(@class,'price-go-arrow')]")
     private WebElement selectGo;
     
     @FindBy(xpath = "//button[text()= 'View More']")
     private WebElement viewMore;
     
     public void enterFromRange(String fRange) {
    	 //sliderRangeFrom.click();
    	 sliderRangeFrom.clear();
    	 sliderRangeFrom.sendKeys(fRange);
     }
     
     public void enterToRange(String tRange) {
    	 sliderRangeTo.clear();
    	 sliderRangeTo.sendKeys(tRange);
     }
     
     public void clickGo() {
    	 WebDriverWait wait = new WebDriverWait(driver, 30);
    	 wait.until(ExpectedConditions.elementToBeClickable(selectGo));
    	 //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	 selectGo.click();
     }
}
