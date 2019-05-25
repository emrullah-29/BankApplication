package PadgeObkects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginAsManager {
	
	public LoginAsManager(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css="div.center:nth-child(3) > button.btn.btn-primary.btn-lg")
	public WebElement clickAsManager;
	
	
	
}
