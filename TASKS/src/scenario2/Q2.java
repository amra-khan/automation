package scenario2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2 {
	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url  = "https://www.facebook.com/";
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys("amrak350@gmail.com");
		driver.findElement(By.id("pass"));
		driver.findElement(By.id("loginbutton")).click();
		driver.findElement(By.xpath("//a[@class, '_2s25']")).click();
   }

}
