package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	
	public LoginPage() {
		super();
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//a[@id='loginBtn']")
	WebElement loginBtn;
	
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@placeholder='Enter your password']")
	WebElement password;
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement btn;
	
	public void enterCredentialsAndClickLogin(String un,String pw) {
		loginBtn.click();
		username.sendKeys(un);
		password.sendKeys(pw);
		btn.click();
		
	}

}
