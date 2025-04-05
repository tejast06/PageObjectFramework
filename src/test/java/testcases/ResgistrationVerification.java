package testcases;

import java.time.Duration;

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
		initialization();
		home = new Home();
		regsitrationForm = new RegsitrationForm();
	}
	
	@Test
	public void test() {
		
		home.ClickEnroll();
		regsitrationForm.enterDetailsAndClickSubmit("alexa", "test", "05/05/1989", "test", "test",  "alexa1@mailinator.com", "alexa1@mailinator.com", "7718048783",
				"1111111111","opendr123","opendr123");
	}

}
