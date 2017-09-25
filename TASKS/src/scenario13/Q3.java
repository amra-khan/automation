package scenario13;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.xerces.util.SynchronizedSymbolTable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class Q3 {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url  = "http://www.ourgoalplan.com/";
	driver.get(url);
	driver.findElement(By.id("txtName")).sendKeys("amrak");
	driver.findElement(By.id("txtPassword")).sendKeys("amra@firemind");
	driver.findElement(By.name("btnLogin")).click();
	driver.findElement(By.xpath("//a[@title='Change Password']")).click();
	String mainWindow = driver.getWindowHandle();
	System.out.println(mainWindow);
	//int size = driver.getWindowHandles().size();
	
	//String childWindow[] = new String[driver.getWindowHandles().size()];
		//System.out.println(size + ""+ Window[0]);
	//ArrayList<String> list = new ArrayList<String>(driver.getWindowHandles());
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//driver.switchTo().window()
	for(String a : driver.getWindowHandles()) {
		System.out.println(a);
		if(!(mainWindow.equalsIgnoreCase(a))) {
			driver.switchTo().window(a);
		System.out.println(a);
//		childWindow[i]= mainWindow
//		System.out.println(childWindow[i]);
//		driver.switchTo().window(childWindow[i]);
		driver.findElement(By.id("txtPassword1")).sendKeys("amra@firemind");
	    driver.findElement(By.id("txtPassword2")).sendKeys("amra@firemind");
	    driver.findElement(By.xpath("//input[@id='btnSave']")).click();
	   
	    driver.close();
		}
	}
	    driver.switchTo().window(mainWindow);
	    driver.findElement(By.xpath("//a[@title='LogOut']")).click();
	    driver.findElement(By.id("txtName")).sendKeys("amrak");
		driver.findElement(By.id("txtPassword")).sendKeys("amra@mindfire");
		driver.findElement(By.name("btnLogin")).click();
		driver.close();
	    
	    }
	    

	
	}

