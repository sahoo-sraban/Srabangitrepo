package Stepdefinations;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logindemosteps {
	
	WebDriver driver=null;
	
	@Given("broswer is open")
	public void broswer_is_open() {
	   String projectpath=System.getProperty("user.dir");
	   System.out.println("project path :"+projectpath);
		
		System.out.println("inside step broswer is open");
		System.setProperty("webdriver.chrome.driver",projectpath+"/src/test/resources/drivers/chromedriver.exe");
	
	driver=new ChromeDriver(); 
	
		
		
	}
	
	

	@Given("verify user is able to see on login page")
	public void verify_user_is_able_to_see_on_login_page() {
	   driver.get("https://example.testproject.io/web/");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_user_name_password(String username,String password) {
	   
		driver.findElement(By.id("name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		
	}

	@When("User can able to click on log in button")
	public void user_can_able_to_click_on_log_in_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("login")).click();
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() throws InterruptedException {
	   driver.getPageSource().contains("Logout");
	   Thread.sleep(3000);
	   
	   driver.quit();
	   driver.close();
	   
	}

}
