package PadgeObkects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerButtonLoginPobjects {
	
	public CustomerButtonLoginPobjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//button[contains(text(),'Customer Login')]")
	public WebElement customerLoginButton;
	
	@FindBy(xpath="//button[@class='btn btn-default']")
	public WebElement login;
}
