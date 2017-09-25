
// Flipkart Task (WORKING)

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FlipkartTask4
{
	
	public String chromePath="C:\\Users\\Maryam Khan\\workspace\\Drivers\\chromedriver.exe";
	public String chrome="webdriver.chrome.driver";
	
	public String ffPath="C:\\Users\\Maryam Khan\\workspace\\Drivers\\geckodriver.exe";
	public String ff="webdriver.gecko.driver";
 
	public WebDriver driver;
	
	String sTerm= "Apple iPhone 6s";
	  
	int sizePr;
	
	
	
  @BeforeTest
  public void openSite() 
  {
	  
	System.setProperty(chrome,chromePath);
	
	driver=new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	driver.manage().window().maximize();
  }
  
 // @AfterTest
  void quitBrowser()
  {
	  driver.quit();
  }
  
  
  @Test(priority=1)
  public void searchProduct()
  {
	  WebElement search= driver.findElement(By.xpath("//input[contains(@title,'Search for Products')]"));
	  
	  search.sendKeys(sTerm);
	  
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  	  
  }
  
  
  
  /**
   * Searching for a product and retrieving rating of all those products
   * @throws InterruptedException
   */
  
  @Test(priority=2)
  public void printProduct() throws InterruptedException
  {
	  
	 System.out.println("Search Term Is  : " + sTerm +"\n");
	  
	 WebDriverWait wait=new WebDriverWait(driver,40);
	 
	 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Availability']")));
	  
     driver.findElement(By.xpath("//div[text()='Availability']")).click();
	 
	// driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
     
     WebDriverWait wait1=new WebDriverWait(driver,40);
	 
	 wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Exclude Out of Stock']")));
	  
	 
	 driver.findElement(By.xpath("//div[text()='Exclude Out of Stock']")).click();  
	 
	 Thread.sleep(1000);//check
	 
	 WebElement ele=driver.findElement(By.xpath("(//a[contains(@title,'Apple iPhone 6s')])[10]"));
	 
	int items = Integer.parseInt(driver.findElement(By.xpath("//h1//span[4]")).getText());
	
	System.out.println("There are " + items + " items showing in the list");
				
	
	
	for(int i=0; i<items; i++)
	{
			JavascriptExecutor js=(JavascriptExecutor)driver; //JavascriptExecutor is an interface
			
			js.executeScript("window.scrollBy(0,100)","");
			
			
	} 	/*
	
	
	//use to scroll element into view 
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	js.executeScript("arguments[0].scrollIntoView(true);",ele); // */
		 
	 sizePr=driver.findElements(By.xpath("(//a[contains(@title,'Apple iPhone 6s')])")).size(); 
	 
	 System.out.println("\n"+ sizePr +" match the search criteria");
	  
	  String [] prName=new String[sizePr];
	  
	  String [] rating=new String[sizePr];
	  
	  String [] star=new String[sizePr];
	  
	  int[] ratingEdit=new int[sizePr];
	  
	  System.out.println("\nList of all Products : \n");
	   
	  //Apple iPhone 6s
	  for(int i=1;i<=sizePr;i++)
	  {
		  prName[i-1]=driver.findElement(By.xpath("(//a[contains(@title, '" + sTerm + "')])[" + i + "]")).getText(); 
		  
		  rating[i-1]=driver.findElement(By.xpath("(//a[contains(@title,'Apple iPhone 6s')]//following-sibling::div/span[contains(text(),'(')])[" + i + "]")).getText();
		  
		  star[i-1]=driver.findElement(By.xpath("(//a[contains(@title,'Apple iPhone 6s')]//following-sibling::div/span[contains(@id,'productRating')]/div[1])[" + i + "]")).getText();
		  
		  ratingEdit[i-1]=Integer.parseInt(rating[i-1].replace("(","").replace(")","").replace(",",""));
		  
		  System.out.println(i+ " "+ prName[i-1] +"\t"+ratingEdit[i-1]+"\t\t\t"+star[i-1]);  
		
	  }
	  
	  System.out.println("-------------------------------------\n");
	 
	  
	  System.out.println("\nList of Sorted Products (Ascending Rating) : \n");
	  
	  int r1;
	  String n1,s1;
	  
	  for(int i=0; i<sizePr; i++)
	  {  
          for(int j=1; j<(sizePr-i); j++)
          {  
                   if(ratingEdit[j-1] > ratingEdit[j])
                   {  
                          //swap elements  
                          r1 = ratingEdit[j-1];  
                          n1 = prName[j-1];
                          s1 = star[j-1];
                                   
                          ratingEdit[j-1] = ratingEdit[j]; 
                          prName[j-1]=prName[j];
                          star[j-1]=star[j];
                                                    
                          ratingEdit[j] = r1;  
                          prName[j] = n1;
                          star[j] = s1;
                          
                  } 
          }
	  }
	 
	
	  
	  int k;
	  
	  for(k=0;k<sizePr;k++)
	  {
		  System.out.println((k+1)+ " "+ratingEdit[k]+ "  "+prName[k]+"       "+star[k]);
		  
	 }
	
	 
	  
	 System.out.println("-------------------------------------\n");
	  
	 System.out.println("The product with the highest rating is : " +ratingEdit[k-1]+ "  "+prName[k-1]+"  "+star[k-1]);
	 
	 System.out.println("\n");
	 
	 for(k=0;k<sizePr-1;k++) 
	 {
		 if(ratingEdit[sizePr-1]==ratingEdit[k])
		 {
			 System.out.println(ratingEdit[k]);
			 System.out.println(prName[k]);
			 System.out.println(star[k]);
		 }
		
	 }
	 
	 System.out.println("-------------------------------------\n");
	  
  }
  
  
  //@Test(priority=1)
  public void customerCare()
  {
	  driver.findElement(By.xpath("//a[text()='24x7 Customer Care']")).click();
	  
	  int size = driver.findElements(By.xpath("//div[@id='browse-category']//a[@class='link']")).size();
	  
	  for(int i=size;i>0;i++)
	  {
		  driver.findElement(By.xpath("(//div[@id='browse-category']//a[@class='link'])[4]")).click();
		  
		  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		  
		  if(driver.findElement(By.xpath("(//div[@id='browse-category']/ul/li[5]//li/a)[1]")).isDisplayed())
		  {
			  driver.findElement(By.xpath("(//div[@id='browse-category']/ul/li[5]//li/a)[1]")).click();
		  }
		  
		  else
			  continue;
		  
		  
	  }
	
  }
  
  
  //@Test(priority=2)
  public void cc()
  {
	  WebDriverWait wait = new WebDriverWait(driver, 15);
	  
	  HashMap<Integer,String> hm=new HashMap<Integer,String>();
	   
	  driver.findElement(By.xpath("//a[contains(text(),'24x7 Customer Care')]")).click();
	  
	  for(int i=6;i>0;i--)
	  {
	    WebElement c=driver.findElement(By.xpath("//div[@id='browse-category']/ul/li["+i+"]//a"));
	    
	    String category=c.getText();
	    
	    System.out.println("category:"+category);
	    
	    wait.until(ExpectedConditions.elementToBeClickable(c));
	    
	    c.click();
	    
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS );
	    
	    Integer no=driver.findElements(By.xpath("//ul[@class='secondaryissue fk-hidden QA']/li")).size();
	    
	    hm.put(no,category);
	  }
	  
	  System.out.println("--------------------------------------");    
	  
	  System.out.println("no of questions per category"); 
	  
	  Map<Integer,String> treeMap = new TreeMap<Integer,String>(hm);
	   
	  for(Map.Entry m1:treeMap.entrySet())
	  {  
		  System.out.println(m1.getKey()+" "+m1.getValue());  
		 
	  }  
	   
  }
  
  
  
}
