package pageObjects;

import org.openqa.selenium.support.PageFactory;

public class SelectExam extends BasePage{
	
	public SelectExam() {
		super();
		PageFactory.initElements(driver, this);
		
	}

}
