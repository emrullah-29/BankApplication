package MainTestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import PadgeObkects.AddCusomerPadgeObjects;
import PadgeObkects.CusomerViewPObjects;
import PadgeObkects.CustomerButtonLoginPobjects;
import PadgeObkects.DeleteCucomter;
import PadgeObkects.LoginAsManager;
import PadgeObkects.OpenAccountPOModels;
import PadgeObkects.ProcessPObjects;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LunchingApplication {
	
	WebDriver driver;
	

	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://www.way2automation.com/angularjs-protractor/banking/#/login");
	}
	
	@Ignore
	@Test
	
	public void GettheTitle() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Protractor practice website - Banking App");
		
	}

	@Ignore
	@Test
	public void clciktoButton() {
		CustomerButtonLoginPobjects clciktoButton = new  CustomerButtonLoginPobjects(driver);
		clciktoButton.customerLoginButton.click();
		
		if(clciktoButton.equals(clciktoButton)) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		
		
	}
	@Ignore
	@Test
	public void SelectName() throws InterruptedException {
		CustomerButtonLoginPobjects clciktoButton = new  CustomerButtonLoginPobjects(driver);
		clciktoButton.customerLoginButton.click();
		
		Select drpName = new Select(driver.findElement(By.name("userSelect")));
		drpName.selectByVisibleText("Ron Weasly");
		
		CustomerButtonLoginPobjects login = new  CustomerButtonLoginPobjects(driver);
		login.login.click();
		driver.navigate().back();
		Thread.sleep(1000);
		
	}
	@Ignore
	@Test
	public void loginAsmanager()  {
		LoginAsManager manager = new LoginAsManager(driver);
		manager.clickAsManager.click();
		AddCusomerPadgeObjects AddCus = new AddCusomerPadgeObjects(driver);
		AddCus.AddCusomer.click();
		AddCus.FirstName.sendKeys("Mac");
		AddCus.Lastname.sendKeys("Book");
		AddCus.ZipCode.sendKeys("123456");
		AddCus.AddCusomerButton.click();
		driver.switchTo().alert().accept();
			
		CusomerViewPObjects view = new CusomerViewPObjects(driver);
		view.CusomerView.click();
		DeleteCucomter delete = new DeleteCucomter(driver);
		delete.DeleteCucomter.click();
			
//		WebElement link= driver.findElement(By.xpath("//tbody//tr[6]"));
//		System.out.println(link.getText());
		
		List<WebElement> listElement = driver.findElements(By.tagName("tr"));
		for(int i =0;i<listElement.size();i++) {
		 String elementText = listElement.get(i).getText(); 
		 System.out.println(elementText);  
		}
		
		driver.navigate().back();
		driver.navigate().refresh();
	

	}
	
	@Test
	public void OpenAccount() {
		LoginAsManager manager = new LoginAsManager(driver);
		manager.clickAsManager.click();
		OpenAccountPOModels open = new OpenAccountPOModels(driver);
		open.openAccount.click();
		
		Select drpName = new Select(driver.findElement(By.name("userSelect")));
		drpName.selectByVisibleText("Ron Weasly");
		
		Select drpCur = new Select(driver.findElement(By.name("currency")));
		drpCur.selectByVisibleText("Rupee");
		
		ProcessPObjects ok = new ProcessPObjects(driver);
		ok.process.click();
		driver.switchTo().alert().accept();
		driver.navigate().back();
	}
	
	

	@AfterTest
	public void closeUp() {
		driver.close();
		driver.quit();
	}
}
