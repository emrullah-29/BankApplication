package PadgeObkects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCusomerPadgeObjects {
	
	public AddCusomerPadgeObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[contains(text(),'Add Customer')]")
	public WebElement AddCusomer;
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	public WebElement FirstName;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	public WebElement Lastname;
	
	@FindBy(xpath="//input[@placeholder='Post Code']")
	public WebElement ZipCode;
	
	@FindBy(xpath="//button[@class='btn btn-default']")
	public WebElement AddCusomerButton;
}
