package com.maven.snapdeal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PriceRange {
	
	 private WebDriver driver;
		public PriceRange(WebDriver driver) {
			this.driver  = driver;
			PageFactory.initElements(driver, this);
		}
		
	@FindBy(xpath = "//span[contains(@class,'product-price ')]")
      List <WebElement> priceLabel;
   
	
	public void verifyPriceRange() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		ArrayList<String> list = new ArrayList<String>(priceLabel.size());
		String a;
		for(int i = 0 ;i < priceLabel.size(); i++) {
			list.add(priceLabel.get(i).getText());
			a = list.get(i).substring(4, 9);
			
			
			
			System.out.println(a);
			if(a.compareTo("15,000")>0 && a.compareTo("20,000")<0 ) {
				System.out.println("out of range");
			}
			
		}
		System.out.println(list);
		
		
		
	}
}
