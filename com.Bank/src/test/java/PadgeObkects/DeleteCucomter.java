package PadgeObkects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteCucomter {
	
	public DeleteCucomter(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css=" tr.ng-scope:nth-child(1) td:nth-child(5) > button:nth-child(1)")
	public WebElement DeleteCucomter;

}
