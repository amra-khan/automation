package Scenario19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Q2 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url  = "http://www.ourgoalplan.com/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.id("txtName")).sendKeys("amrak");
		driver.findElement(By.id("txtPassword")).sendKeys("amra@tester");
		driver.findElement(By.name("btnLogin")).click();
		driver.findElement(By.xpath("//a[@href='MessageList.aspx']")).click();
		int mainSize=  driver.findElements(By.tagName("tr")).size();
		System.out.println(mainSize);
		driver.findElement(By.xpath("//input[@id ='ctl00_cphBody_txtSearch']")).sendKeys("Chinmoy");
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='ctl00_cphBody_lbtnSearch']"))).click();
		int size = driver.findElements(By.partialLinkText("Chinmoy")).size();
		//list = driver.findElements(By.tagName("tr"));
		System.out.println(size);
	    driver.findElement(By.xpath("//*[contains(@href,'Page$2')]")).click();
	    int nextSize = driver.findElements(By.partialLinkText("Chinmoy")).size();
	    System.out.println(nextSize);
		driver.close();
		
	}

}
