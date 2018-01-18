package core;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.*;
public class Signin extends Main implements  URL, Xpath,data,Data_for_user{
	static WebDriver driver;
	WebDriverWait wait = new WebDriverWait (driver,15);
	//public static void  throws InterruptedException {
		
//	Signin.something();	
//	}
	
		public static void something() throws InterruptedException {
	 driver=br();
		driver.get(URL.url);
		String email = "vburian@tubi.tv";
		String password= "tubitv";
	Main.testc(Xpath.sign_in);  //click on sign in
	Main.tests(Xpath.semail,email);   //sign in field
	Main.tests(Xpath.spassword,password);  //password field
	Main.testc(Xpath.orange_signIn); //click on orange sign_in
	 WebElement b=driver.findElement(By.xpath("/html/body/div/div/div[2]/header/div/div[2]/div/div/div[1]/span")); // pop-up in left corner
	    Actions act=new Actions(driver); //Action class
	    act.moveToElement(b).perform();  //mouse ovver
	    Thread.sleep(4000);
	  Main.testc("/html/body/div/div/div[2]/header/div/div[2]/div/div/div[2]/a[1]");}
		
	}
	
	

