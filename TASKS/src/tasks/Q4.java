package tasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Q4 {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url  = "http://www.ourgoalplan.com/";
	driver.get(url);
	driver.manage().window().maximize();
	driver.findElement(By.id("txtName")).sendKeys("amrak");
	driver.findElement(By.id("txtPassword")).sendKeys("mind@amrafire");
	driver.findElement(By.name("btnLogin")).click();
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//a[@href='Message.aspx']")).click();
	driver.findElement(By.xpath("//label[text()= 'Myself']")).click();    
	driver.findElement(By.xpath("//input[contains(@id,'txtSubject')]")).sendKeys("Test2");
	driver.switchTo().frame(driver.findElement(By.xpath("//*[contains(@title,'Rich text editor')]")));
	driver.findElement(By.tagName("body")).sendKeys("Hello");
	
	driver.switchTo().parentFrame();
	  
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.findElement(By.xpath("//a[@href= 'MessageList.aspx']")).click();
	String msg=driver.findElement(By.xpath("(//a[contains(@href,'Message.aspx?id')])[1]")).getText();
	if(msg.equalsIgnoreCase("test2")) {
		System.out.println("test passed");
	}
	driver.close();
	
	}
}
