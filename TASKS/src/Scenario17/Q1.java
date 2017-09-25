package Scenario17;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url  = "http://www.ourgoalplan.com/";
	driver.get(url);
	driver.findElement(By.id("txtName")).sendKeys("amrak");
	driver.findElement(By.id("txtPassword")).sendKeys("amra@tester");
	driver.findElement(By.name("btnLogin")).click();
	driver.findElement(By.xpath("//a[@href = 'GoalSheet.aspx']")).click();
	List<WebElement> list = driver.findElements(By.xpath("//*[contains(@id, 'chkStatus')]"));
	for(WebElement e : list) {
		//int i = 0;
		boolean a = e.isSelected();
		System.out.println("checkbox status is:"+ a);
		//boolean a = e.isSelected();
		//System.out.println(a);
		//i++;
	}
	}
}
