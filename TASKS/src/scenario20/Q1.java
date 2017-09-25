package scenario20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
		driver.findElement(By.xpath("//a[@href= 'TeamLeaveWFHCount.aspx']")).click();
		String leaves = driver.findElement(By.xpath("//a[@href = 'LeaveList.aspx?lid=6&uid=1978']")).getText();
		System.out.println(leaves);
		driver.close();
	}
}
