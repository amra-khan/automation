package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2 {
	public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url  = "http://www.ourgoalplan.com/";
		driver.get(url);
		driver.findElement(By.id("txtName")).sendKeys("amrak");
		driver.findElement(By.id("txtPassword")).sendKeys("mind@amrafire");
		driver.findElement(By.name("btnLogin")).click();
		boolean e = driver.getPageSource().contains("abcrakadabrakadabra");
		System.out.println(e);
//		if(bodyText.contains("abcrakadabrakadabra")) {
//			System.out.println("test passed");
//		}
		driver.close();
		
	}
}
