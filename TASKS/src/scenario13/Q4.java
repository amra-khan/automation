package scenario13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url  = "http://www.ourgoalplan.com/";
		driver.get(url);
		driver.findElement(By.id("txtName")).sendKeys("amrak");
		driver.findElement(By.id("txtPassword")).sendKeys("amra@tester");
		driver.findElement(By.name("btnLogin")).click();
		driver.findElement(By.xpath("//a[@href= 'MessageList.aspx']")).click();
		//ArrayList<String> list = new ArrayList<String>();
     
	 List<WebElement> list = driver.findElements(By.xpath("//a[contains(@href,'Message.aspx?id')]"));
	 System.out.println(list);
	
	 String element[] = new String[list.size()];
	 for(WebElement e : list) {
		 int i = 0;
		 element[i] = e.getText();
		 i++;
	 }
	 Arrays.sort(element);
	 System.out.println(element);
		
			
		
	
	}
}
