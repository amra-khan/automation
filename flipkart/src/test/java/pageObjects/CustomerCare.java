package pageObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomerCare {
	
	private WebDriver driver;
	public CustomerCare(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[@text = 'Order']")
	WebElement order; 
	
	@FindBy(xpath = "//span[@text= 'Cancellations and Returns']")
	WebElement cancelItems;
	
	@FindBy(tagName = "p")
	List <WebElement> querySelector; 
	
	@FindBy(xpath = "//div[@class = 'question']")
	List<WebElement> questionList;
	
	@FindBy(xpath = "//div[@class = '_1MiVJp']")
	WebElement test;
	
//	@FindBy(xpath = "//div[contains(@data-id  , '55bf4fc6bc000041005be760')]")
//	WebElement test;
	
	public void clickEachIssue() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		order.click();
		
		System.out.println(querySelector.size());
		cancelItems.click();
		System.out.println(querySelector.size());
		
	
	
//		ArrayList<Integer> questionArray = new ArrayList<Integer>();
//		System.out.println(listIssues.size() + "  " + querySelector.size());
//		for(WebElement e : listIssues) {
//			e.click();
//			querySelector.get(0).click();
//			questionArray.add(questionList.size());
//			System.out.println(questionArray);
//			
//		}
//		Collections.sort(questionArray , Collections.reverseOrder());
//		System.out.println("issue with highest number of question is:" + questionArray.get(0));
//	}
	}
}

