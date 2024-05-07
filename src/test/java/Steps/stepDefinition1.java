package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition1 {
	RemoteWebDriver driver;
	@Given("User enter the Emailid as {string}")
	public void user_enter_the_emailid_as(String string) {
         driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://oto.seppam.in/");
	    driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("jeevimoni@toolfe.com");
       /*driver.findElement(By.xpath("//input[@type='emailAddress']")).sendKeys("pritom@scandexbd.com");*/
	   
	}

	@And("User enter the password as {string}")
	public void user_enter_the_password_as(String string) {
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Otomate@123");
	}

	@When("User click on the login button")
	public void user_click_on_the_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Then("click on check-in button")
	public void click_on_check_in_button() throws Exception {
		Thread.sleep(8000);
		WebElement clockInButton = driver.findElement(By.xpath("//span[text()='Check In']"));
	        if (clockInButton.isDisplayed()) {
	            // Click clock-in button
	            clockInButton.click();
	        } else {
	        	Thread.sleep(3000);
	            // If clock-in button is not available, click clock-out button
	            WebElement clockOutButton = driver.findElement(By.xpath("//span[text()='Check Out']"));
	            clockOutButton.click();
	        }
		System.out.println("Success");	}

	@Then("click on project icon")
	public void click_on_project_icon() throws Exception {
		Thread.sleep(8000);
		driver.findElement(By.xpath("(//h1[@class='font-semibold text-heading']/following-sibling::span)[1]")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[contains(@class,'text-black font-bold')]")).sendKeys("TestingImportant");
		driver.findElement(By.cssSelector("input[name='projectCode']")).sendKeys("1901");
		driver.findElement(By.name("businessUnit")).click();
		driver.findElement(By.xpath("(//select[contains(@class,'text-black ')]//option)[2]")).click();
		driver.findElement(By.xpath("//select[@name='brandContacts']")).click();
		driver.findElement(By.xpath("(//option[text()='Select Business Partner']/following-sibling::option)[2]")).click();
		driver.findElement(By.xpath("(//span[text()='ACC']/following::input)[3]")).sendKeys("234");   
	        WebElement element = driver.findElement(By.xpath("//div[contains(@class,'multiselect-container multiSelectContainer')]//div[1]"));
	        element.click();

	     driver.findElement(By.xpath("//li[text()='Recycle Activities']")).click();
	     Thread.sleep(1000);	      
	     driver.findElement(By.xpath("//button[text()='Project']")).click();
		
	}

	@And("click on order icon")
	public void click_on_order_icon() throws Exception {
		Thread.sleep(8000);
		driver.findElement(By.xpath("(//h1[@class='font-semibold text-heading']/following-sibling::button)[1]")).click();
		driver.findElement(By.tagName("select")).sendKeys("testing");
		driver.findElement(By.name("orderNo")).sendKeys("1306");
		driver.findElement(By.name("orderDetails")).sendKeys("hi");
		driver.findElement(By.xpath("//button[text()='Save']")).click();
	}

	@Then("Orderno created successfully")
	public void orderno_created_successfully() {
	   driver.close();
	}

}
