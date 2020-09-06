package wrapper2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Genericwrapper2 implements Wrappermethod{
	public ChromeDriver driver;

	public void invokeApp(String url) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rhcho\\eclipse-workspace\\POMframewrk2\\driver\\chromedriver.exe");
		 driver =new ChromeDriver();
		 driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		
		
	}

	public void enterById(String idvalue, String data) {
		driver.findElementById(idvalue).sendKeys(data);
		
	}
	
	public void enterbyName(String namevalue, String data) {
		driver.findElementByName(namevalue).sendKeys(data);
		
	}

	public void enterbyClassname(String cnamevalue, String data) {
		driver.findElementByClassName(cnamevalue).sendKeys(data);
		
	}

	public void enterbyLinktext(String value, String data) {
		driver.findElementByLinkText(value).sendKeys(data);
		
	}

	public void enterbyXpath(String xpathvalue, String data) {
		driver.findElementByXPath(xpathvalue).sendKeys(data);
		
	}

	public void clickbyid(String value) {
		driver.findElementById(value).click();
		
	}

	public void clickbyname(String value) {
	driver.findElementByName(value).click();
		
	}

	public void clickbylinktext(String value) {
		driver.findElementByLinkText(value).click();
		
	}

	public void clickbyxpath(String value) {
		driver.findElementByXPath(value).click();
		
	}

	public void SelectbyvisibletextbyId(String Id, String value) {
		WebElement ele = driver.findElementById(Id);
		Select dd = new Select(ele);
		dd.selectByVisibleText(value);
		
			}

	public void clickbyClassname(String value) {
		driver.findElementByClassName(value);
		
	}
	
	public void clickByClassName(String value) {
		
	}
		
		

	public void closebrowser() {
		driver.close();
		
}
	
		
		
	}

			
		
