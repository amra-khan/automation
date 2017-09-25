package pageObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductList{
	
	private WebDriver driver;
	public ProductList(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
//	
//    @FindBy(xpath = "(//div[@class = 'col col-3-12 col-md-3-12 MP_3W3'])[1]")
//	List< WebElement> productList;
    
    @FindBy(xpath = "//a[@class= '_2cLu-l']")
    List<WebElement> productName;
    
//    public void clickFirstProduct() {
//    	firstProduct.click();
//    	
//    }
    @FindBy(xpath =  "//span[@class = '_38sUEc']")
    		List<WebElement> productRating;

//     for(WebElement e : productRatings) {
//    
//     }
    @FindBy(xpath = "//div[@class = '_3BTv9X']")
     WebElement test;
    
    public void getProduct() {
    	WebDriverWait wait = new WebDriverWait(driver,60);
    	wait.until(ExpectedConditions.elementToBeClickable(test));
    	System.out.println(productRating.size()+ productRating.get(0).getText());
    	ArrayList<String> productArray = new ArrayList<String>(productRating.size());
    	for(WebElement e : productRating) {
    		
    	    productArray.add(e.getText());
    }
  	   Collections.sort(productArray , Collections.reverseOrder());
  	   System.out.println("highest product rating is :" + productArray.get(0));
  	   

    }
    
    public void getProductName() {
    	 System.out.println(productName.size());
    	 ArrayList<String> productArray = new ArrayList<String>(productName.size());
     	for(WebElement e : productName) {
     		
     	    productArray.add(e.getText());
     }
     	System.out.println(productArray);
    	 
    }
    
//	public void getNameofProduct() {
//		System.out.println("product with highest rating is : " + firstProduct.getText());
//	}
	

}
