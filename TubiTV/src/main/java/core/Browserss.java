package core;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browserss implements Browsers
{
public static WebDriver driver;
public static WebDriverWait wait;
	public static WebDriver br() {
	
	
	if(Browsers.mybrowser.equals("Chrome")) {
		
		  String driverPath=""; 
	        if (System.getProperty("os.name").toUpperCase().contains("MAC"))   driverPath="./resources/webdrivers/mac/chromedriver";
	        else if (System.getProperty("os.name").toUpperCase().contains("WINDOWS")) driverPath = "";
		System.setProperty("webdriver.chrome.driver", driverPath);
		System.setProperty("webdriver.chrome.silentOutput","true");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("disable-infobars");
		option.addArguments("--disable-notifications");
		if (System.getProperty("os.name").toUpperCase().contains("MAC"))
	       option.addArguments("-start-fullscreen");
	       else if (System.getProperty("os.name").toUpperCase().contains("WINDOWS"))
		option.addArguments("--start-maximazed");
		else throw new IllegalArgumentException("UknowOS");
		
		driver = new ChromeDriver(option);
		 wait = new WebDriverWait (driver,15);
		
	}
	else if (Browsers.mybrowser.equals("Firefox")) {
		
		
		
		Logger logger = Logger.getLogger("");
		logger.setLevel(Level.OFF);
			
		       String driverPath=""; 
		        if (System.getProperty("os.name").toUpperCase().contains("MAC"))   driverPath="./resources/webdrivers/mac/geckodriver.sh";
		        else if (System.getProperty("os.name").toUpperCase().contains("WINDOWS")) driverPath = "";
			System.setProperty("webdriver.gecko.driver", driverPath);
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			 wait = new WebDriverWait (driver,15);
		
	}
	
	
	
	else if (Browsers.mybrowser.equals("Safari")) {

		Logger logger = Logger.getLogger("");
		logger.setLevel(Level.OFF);
		
		if (!System.getProperty("os.name").contains("Mac")) {throw new IllegalArgumentException("Safari is available only on Mac");}
		
		driver = new SafariDriver();
		driver.manage().window().maximize();
		 wait = new WebDriverWait (driver,15);
		
}
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	return driver;
}}