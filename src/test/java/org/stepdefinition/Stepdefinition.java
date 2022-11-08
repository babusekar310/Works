package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefinition {
	public WebDriver driver; 
	@Given("To Configure the browser in webdriver manager")
	public void to_Configure_the_browser_in_webdriver_manager() {
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Babu\\eclipse-workspace\\CucumberNew\\driver\\chromedriver.exe");
	    	ChromeOptions options = new ChromeOptions();
	    	
	    	options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
	    	
	    	driver = new ChromeDriver(options);
	}

	@When("To launch the browser our case edge browser")
	public void to_launch_the_browser_our_case_edge_browser() {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	    
	}

	@When("To check the login by entering negative username")
	public void to_check_the_login_by_entering_negative_username() {
	    	driver.findElement(By.id("email")).sendKeys("java1234");
	}

	@When("To check the login by entering positive password")
	public void to_check_the_login_by_entering_positive_password() {
			driver.findElement(By.id("pass")).sendKeys("12345678");
	   
	}

	@When("To submit the value by clicking login button")
	public void to_submit_the_value_by_clicking_login_button() {
	    	driver.findElement(By.name("login")).click();
	}

	@Then("To quit the browser after clicking the login")
	public void to_quit_the_browser_after_clicking_the_login() throws InterruptedException {
			Thread.sleep(3000);
			driver.quit();
	}

}
