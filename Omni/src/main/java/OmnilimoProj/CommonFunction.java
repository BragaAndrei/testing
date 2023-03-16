package OmnilimoProj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonFunction extends Boss {

	static Actions act;
	static JavascriptExecutor executor;

	static public void getAction(WebElement element) {

		act = new Actions(driver);
		act.moveToElement(element).build().perform();
	}

	static public void jsActions(WebElement element) { //for click
		executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", element);
	}
//	static public void jsActionInsert(WebElement element, String value) {
//		
//		executor.executeScript("document.getElementById('"+ element + "').value ='"+ value +"'");
//		
//	}

	static public void driverWait(WebElement element) {
		WebDriverWait waitt = new WebDriverWait(driver, Duration.ofSeconds(20));
		waitt.until(ExpectedConditions.visibilityOf(element));

	}
	
	static public WebElement getLocator(String stringg) {
		return driver.findElement(By.xpath("//div[contains(text(),'%s')]".formatted(stringg)));
	}
	
	static public WebElement getLocatorStrongTag(String stringg) {
		return driver.findElement(By.xpath("//strong[contains(text(),'%s')]".formatted(stringg)));
	}
	static public WebElement getLocatorSpanTag(String stringg) {
		return driver.findElement(By.xpath("//span[contains(text(),'%s')]".formatted(stringg)));
	}
	
	
	
	
	
	
	
	
}
