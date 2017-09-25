package stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import static org.testng.AssertJUnit.assertTrue;
//import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.*;

public class TestCase  {
      		
     public WebDriver driver;
     public TestCase() {
    	 driver = Hooks.driver;
     }
	@When("^User enters SearchKeyword$")
	public void if_User_enters_SearchKeyword(DataTable keyword) throws Throwable {
		HomePage home = new HomePage(driver);
		List<String> data = keyword.topCells();
		home.searchProducts(data.get(0));
	
	}

	@Then("^click the search icon$")
	public void click_the_search_icon() throws Throwable {
		HomePage home = new HomePage(driver);
		home.clickSearchIcon();
	}

	@Then("^user should be able to get the expected product$")
	public void user_should_be_able_to_get_the_expected_product() throws Throwable {
	   System.out.println("on the product list page");
	}
	
	@When("^User is on the product list page$")
	public void user_is_on_the_product_list_page() throws Throwable {
	    System.out.println(("on the productLiist ppage"));
	}

	@Then("^he should get the product with highest rating$")
	public void he_should_get_the_product_with_highest_rating() throws Throwable {
		ProductList list = new ProductList(driver);
		list.getProduct();
		list.getProductName();
	}
      
	@When("^he clicks on login icon$")
	public void he_clicks_on_login_icon() throws Throwable {
		HomePage home = new HomePage(driver);
		   home.openLoginWindow();
	}

	@Then("^he should be able to see the Login Page$")
	public void he_should_be_able_to_see_the_Login_Page() throws Throwable {
	    System.out.println("Inside login Page");
	    
	}
	
	
	@Given("^User is on the Login Page$")
	public void user_is_on_the_Login_Page() throws Throwable {
		System.out.println("inside Login Page");
	}

	@When("^User enters Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void user_enters_Username_as_and_Password_as(String username, String password) throws Throwable {
		
		LoginPage login = new LoginPage(driver);
		login.enterEmailId(username);
		login.enterPassword(password);
		login.clickLoginButton();
		
	}
	
	
	
//	@When("^click the submit button$")
//	public void click_the_submit_button() throws Throwable {
//		LoginPage login = new LoginPage(driver);
//		login.clickLoginButton();
//	}
	@Then("^user should be on the home page$")
	public void user_should_be_on_the_home_page() throws Throwable {
	    System.out.println("inside home page");
	}
	
	@When("^User clicks on Customer Care link$")
	public void user_clicks_on_Customer_Care_link() throws Throwable {
		HomePage home = new HomePage(driver);
		home.clickCustomerSupport();
	}

	@Then("^he should see the customer Care page$")
	public void he_should_see_the_customer_Care_page() throws Throwable {
	  System.out.println("on customer care page");
	}

	@When("^User clicks on each issue$")
	public void user_clicks_on_each_issue() throws Throwable {
		CustomerCare obj = new CustomerCare(driver);
		obj.clickEachIssue();
	}

//	@When("^clicks on view more$")
//	public void clicks_on_view_more() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^user should be able to count number of questions$")
//	public void user_should_be_able_to_count_number_of_questions() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	
//	@When("^User Clicks on Customer Care icon$")
//	public void user_Clicks_on_Customer_Care_icon() throws Throwable {
//		HomePage home = new HomePage(driver);
//		home.clickCustomerSupport();
//	
//	
//	}
//
//	@Then("^User should see the Customer Care Page$")
//	public void user_should_see_the_Customer_Care_Page() throws Throwable {
//		
//	}

	

	




}
