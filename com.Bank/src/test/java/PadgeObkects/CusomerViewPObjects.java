package PadgeObkects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CusomerViewPObjects {
	
	public CusomerViewPObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css=" div.center > button:nth-child(3)")
	public WebElement CusomerView;

}
