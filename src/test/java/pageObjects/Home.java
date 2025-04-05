package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home extends BasePage {
	
	
	public Home() {
		super();
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

    @FindBy(xpath="//a[text()='Enroll']")
	WebElement enrollBtn;
    
    public void ClickEnroll() {
    	enrollBtn.click();
    }

}
