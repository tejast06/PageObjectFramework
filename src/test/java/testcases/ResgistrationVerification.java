package testcases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.BasePage;
import pageObjects.Home;
import pageObjects.RegsitrationForm;

public class ResgistrationVerification extends BasePage {
	public Home home;
	public RegsitrationForm regsitrationForm;
	
	public ResgistrationVerification() {
		super();
	}
	
	
	@BeforeTest
	public void setUp() {
		
		
		
		initialization("os","chrome");
		home = new Home();
		regsitrationForm = new RegsitrationForm();
	}
	
	@Test
	public void test() throws InterruptedException {
		
		
		home.ClickEnroll();
		
		
		regsitrationForm.enterDetailsAndClickSubmit(randomName(), "opendr", "05/05/1989", "test", "test",  "alexa1@mailinator.com", "alexa1@mailinator.com", randomNum(),
				"1111111111","opendr123","opendr123");
		
			
		
	}
	
	public String randomName() {
		String name=RandomStringUtils.randomAlphabetic(5);
		return name;
	}
	
	public String randomNum() {
		String number= RandomStringUtils.randomNumeric(10);
		return number;
	}
	
	

}
