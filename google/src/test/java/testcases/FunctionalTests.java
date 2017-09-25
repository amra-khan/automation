package testcases;
import org.testng.annotations.AfterClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
//import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import datatable.*;
import net.sourceforge.htmlunit.corejs.javascript.GeneratedClassLoader;

public class FunctionalTests {
    protected static WebDriver driver;
   
   public static Logger log = Logger.getLogger("FunctionalTests");

	@BeforeClass
    public static void initialize() throws IOException {
		
    	log.debug("executing driver script");
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
    	driver = new ChromeDriver();
    	ReadExcel.getExcelSheet(ReadExcel.getCellData(1, 2),0);
    	String url = ReadExcel.getCellData(1, 0);
    	driver.get(url);
    	log.debug("launching brwoser");
    	driver.manage().window().maximize();
    }
    
    @AfterClass
    public void closeBrowser() {
    	driver.close();
    	log.debug("closing browser");
    }
}
