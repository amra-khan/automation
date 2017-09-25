package scenario2;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.sun.jna.platform.win32.COM.TypeLib.ByReference;

public class Q1 {
  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter the name");
	    String name = sc.next();
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url  = "https://www.facebook.com/";
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys("amrak350@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("");
		driver.findElement(By.id("loginbutton")).click();
		String Username = driver.findElement(By.xpath("//*[contains(@class ,'linkWrap noCount')]")).getText();
		System.out.println(Username);
	    if(Username.equalsIgnoreCase(name)) {
	    	System.out.println("test passed");
	    }
	    
   }
}



