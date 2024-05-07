package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	RemoteWebDriver driver;
	
	@Given("I open the Google search page")
	public void i_open_the_google_search_page() {
	driver=new ChromeDriver();

	    
	    driver.manage().window().maximize();
	    driver.get("https://www.google.com/");
	    System.out.println(driver.getTitle()) ;
	}
	@When("I search for {string}")
	public void i_search_for(String search) {
	  WebElement searchbox = driver.findElement(By.xpath("(//div[@class='RNNXgb']//div)[1]"));
	  searchbox.sendKeys(search);
	  searchbox.click();	
	 
	}
	@Then("I should see the results page")
	public void i_should_see_the_results_page() {		
	WebElement image = driver.findElement(By.xpath("(//div[@class='YmvwI'])[2]"));
	image.click();
	if(image.equals(image)) {
		System.out.println("sucessful");
	}
	else
	{
		 byte[] screenshot = driver.getScreenshotAs(OutputType.BYTES);
		 TakesScreenshot ts = (TakesScreenshot) driver;

		 byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		attach(src, "image/png", "screenshot");
		
	}
	}

	private void attach(byte[] src, String string, String string2) {
		// TODO Auto-generated method stub
		
	}
	/*
	    @After
	   /*public void tearDown(Scenario scenario) {
	        if (scenario.isFailed()) {
	            // Take screenshot if scenario fails
	            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	            scenario.attach(screenshot, "image/png", "Screenshot");
	        }
	        driver.quit();*/
	    }
	

