package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegsitrationForm extends BasePage {

	public RegsitrationForm() {
		super();
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//div[@class='col-md-4 padding-right-0 mob-padding-right-15']//input[@name='first_name']")
	WebElement firstname;
	
	@FindBy(xpath="//*[@id=\"enrollForm\"]/div[2]/div/div/div[3]/div/input")
	WebElement lastName;
	
	@FindBy(xpath="//input[@id='dob']")
	WebElement dob;
	
	@FindBy(xpath="//*[@id=\"enrollForm\"]/div[3]/div/div/div[2]/div/div/label[2]/a/input")
	WebElement male;
	
	@FindBy(xpath="//input[@name='address_1']")
	WebElement address;
	
	@FindBy(xpath="//input[@name='city']")
	WebElement city;
	
	@FindBy(xpath="//select[@id='state']/option[text()='Alabama']")
	WebElement state;
	
	@FindBy(xpath="//input[@id='email_address']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='retype_email_address']")
	WebElement retypeEmail;
	
	@FindBy(xpath="//*[@id=\"enrollForm\"]/div[6]/div/div/div[1]/div/input")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"enrollForm\"]/div[6]/div/div/div[2]/div/input")
	WebElement retypePw;
	
	@FindBy(xpath="//input[@name='phone_number']")
	WebElement phoneNum;
	
	@FindBy(xpath="//*[@id=\"enrollForm\"]/div[8]/div/div/div/label[1]/input")
	WebElement txtMsg;
	
	@FindBy(xpath="//input[@name='terms_conditions_sms']")
	WebElement smsCheck;
	
	@FindBy(xpath="//input[@name='terms_conditions']")
	WebElement tc;
	
	@FindBy(xpath="//button[text()='Submit']")
	WebElement btn;
	
	@FindBy(xpath="//input[@name='zip']")
	WebElement zipCode;
	
	public void enterDetailsAndClickSubmit(String fn,String ln,String db,String addre,String ct,String em,String retyrem,String pn,String zp,
			String pw,String retypepw) {
		firstname.sendKeys(fn);
		lastName.sendKeys(ln);
		dob.sendKeys(db);
		address.sendKeys(addre);
		city.sendKeys(ct);
		state.click();
		email.sendKeys(em);
		retypeEmail.sendKeys(retyrem);
		phoneNum.sendKeys(pn);
		zipCode.sendKeys(zp);
		password.sendKeys(pw);
		retypePw.sendKeys(retypepw);
		male.click();
		txtMsg.click();
		smsCheck.click();
		tc.click();
		btn.click();
		
	}

}
