package tasks;

import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;
//import java.time.LocalDate;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Q1 {
      public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url  = "http://www.ourgoalplan.com/";
		driver.get(url);
		driver.findElement(By.id("txtName")).sendKeys("amrak");
		driver.findElement(By.id("txtPassword")).sendKeys("mind@amrafire");
		driver.findElement(By.name("btnLogin")).click();
		String date = driver.findElement(By.xpath("//*[contains(@id,'ucAddGoal_dtGoalDate_label')]")).getText();
		Date today = new Date();
	    //String todayDate = today.toString();
		SimpleDateFormat sd =new SimpleDateFormat("MM/dd/yyyy");
		String todayDate = sd.format(today);
		System.out.println(todayDate);
		if(date.equals(todayDate)){
			System.out.println("test passed");
			
		}
		//System.out.println(date.replaceAll("[^a-zA-Z0-9]", "") + " "+ todayDate);
		
		driver.close();
	    
		
	}
}
