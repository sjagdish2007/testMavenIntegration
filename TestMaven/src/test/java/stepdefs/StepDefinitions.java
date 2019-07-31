package stepdefs;
 


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
 
/**
 * Created by thilinaga on 7/3/2017.
 */
public class StepDefinitions {
	public static WebDriver driver;
    @Given("^I am on the \"([^\"]*)\" page on URL \"([^\"]*)\"$")
    public void i_am_on_the_page_on_URL(String arg1, String arg2) throws Exception {
        // Write code here that turns the phrase above into concrete actions
    	System.setProperty("webdriver.gecko.driver","C:\\Jars\\Cucumber_Jars-20190717T124523Z-001\\Cucumber_Jars\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(arg2.toString());
		Thread.sleep(2000);
    }
 
    @Given("^I am on the tes URL$")
    public void I_am_on_the_tes_URL() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	System.setProperty("webdriver.gecko.driver","C:\\Jars\\Cucumber_Jars-20190717T124523Z-001\\Cucumber_Jars\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to("https://register.freecrm.com/register/");
		Thread.sleep(2000);
		//driver.quit();
       
    }
 
    
    @When("^I fill in \"([^\"]*)\" with \"([^\"]*)\"$")
    public void i_fill_in_with(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        
    }
 
    @When("^I click on the \"([^\"]*)\" button$")
    public void i_click_on_the_button(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        
    }
 
    @Then("^I should see \"([^\"]*)\" message$")
    public void i_should_see_message(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	driver.findElement(By.name("phone")).isDisplayed();
    	//driver.quit();   
    }
 
    @Then("^I should see the \"([^\"]*)\" button$")
    public void i_should_see_the_button(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        
    }
 
}