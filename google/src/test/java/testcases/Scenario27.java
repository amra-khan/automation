package testcases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import datatable.*;
import operation.ReadObject;
public class Scenario27 extends FunctionalTests{
	
      //  Scenario27 obj = PageFactory.initElements(driver, this.getClass());
        
   
	@Test(priority = 0)
		public static void enterTextForSearch() throws IOException {
		ReadExcel.getExcelSheet(ReadExcel.getCellData(1, 2),0);
		String keyword = ReadExcel.getCellData(1, 1);
		    driver.findElement(By.xpath(ReadObject.getProperties().getProperty("google_search_textbox"))).sendKeys(keyword);
		
	}
	
	@Test(priority = 1)
	public static void clickSearchButton() throws IOException {
		 driver.findElement(By.xpath(ReadObject.getProperties().getProperty("google_search_button"))).submit();
	}
	
   @Test(priority = 2)
   public static void countLinkText() throws IOException {
	  
	   List <WebElement> links = driver.findElements(By.tagName(ReadObject.getProperties().getProperty("links")));
	  ArrayList<String> list = new ArrayList<String>(links.size());
	   int linkcount = links.size();
	   for(WebElement e : links) {
		    list.add(e.getText());
	   }
	  System.out.println("number of links is:" + linkcount + "link text are:" + list);
	  
   }
   
 
   
}
