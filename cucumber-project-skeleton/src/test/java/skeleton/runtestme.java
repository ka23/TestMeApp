package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class runtestme {
	WebDriver driver;
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		System.setProperty("webdriver.chrome.driver","C:\\kalyani\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://10.232.237.143/TestMeApp/fetchcat.htm");
		driver.findElement(By.linkText("SignIn")).click();
	    
	}

	@When("user provides valid username and password")
	public void user_provides_valid_username_and_password() {
		driver.findElement(By.name("userName")).sendKeys("Lalitha");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.name("Login")).click();
	    
	}

	@Then("login sucessfully")
	public void login_sucessfully() {
		String msg=driver.findElement(By.cssSelector("ul.nav")).getText();
		String msg2="Hi, Lalitha";
		Assert.assertTrue(msg.contains(msg2));
		driver.findElement(By.linkText("SignOut")).click();
		
	    
	}

	@Given("login page is opened")
	public void login_page_is_opened() {
		System.setProperty("webdriver.chrome.driver","C:\\kalyani\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://10.232.237.143/TestMeApp/fetchcat.htm");
		driver.findElement(By.linkText("SignIn")).click();
	    
	}

	@When("user provides Invalid username and password")
	public void user_provides_Invalid_username_and_password() {
		driver.findElement(By.name("userName")).sendKeys("amitabh");
		driver.findElement(By.name("password")).sendKeys("amitabh123");
		driver.findElement(By.name("Login")).click(); 
	 
	}

	@Then("user should get an Invalid error message")
	public void user_should_get_an_Invalid_error_message() {
	  System.out.println("Invalid Username And password");
	   
	}

	@Given("user navigate to login page")
	public void user_navigate_to_login_page() {
		System.setProperty("webdriver.chrome.driver","C:\\kalyani\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://10.232.237.143/TestMeApp/fetchcat.htm");
		driver.findElement(By.linkText("SignIn")).click();
	    
	}

	@When("user provides Blank username and password")
	public void user_provides_Blank_username_and_password() {
		driver.findElement(By.name("userName")).sendKeys(" ");
		driver.findElement(By.name("password")).sendKeys("");
		driver.findElement(By.name("Login")).click();
	   
	}

	@Then("user should get an blank error message")
	public void user_should_get_an_blank_error_message() {
		 System.out.println("Username And password is blank");
	    
	}


}
