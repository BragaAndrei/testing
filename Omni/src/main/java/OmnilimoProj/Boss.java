package OmnilimoProj;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Boss {

	
	protected static WebDriver driver;
	protected static Logger log = Logger.getLogger(Boss.class);

	@BeforeTest
	public void stepsBefore() {
		PropertyConfigurator.configure("..\\Omnilimo\\Log4j.properties");

		Reporter.log("==Testing is starting==", true);

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		
		log.info("Chrome has been opened");

		driver.manage().window().maximize();
		driver.get("https://dev.omni.tecorien.dev/");
		log.info("website opened");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

	}

	// Test
	@AfterTest
	public void stepsAfter() throws IOException {
		screens();
		driver.quit();
	}
	

	public void screens() throws IOException {

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String path = "..\\Omnilimo\\Screens\\";
		FileUtils.copyFile(src, new File(path + "" + driver.getClass().getSimpleName() + ""
				+ this.getClass().getSimpleName() + "" + time() + ".png"));

	}

	public String time() {
		return new SimpleDateFormat("dd-MM-yyyy HH-dd-ss").format(new Date());
	}
}
