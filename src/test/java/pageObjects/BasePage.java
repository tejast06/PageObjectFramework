package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	
	public static WebDriver driver;
	
	public BasePage() {
		
		// TODO Auto-generated constructor stub
	}

	public void initialization() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://countygeneraltest.opendr.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

}
