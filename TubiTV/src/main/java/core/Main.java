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
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.*;
public class Main extends Browserss implements  URL, Xpath,data  {
	static WebDriver driver;
	static email email1= new email(); //random create new email for register
	WebDriverWait wait = new WebDriverWait (driver,15);
    Signin signin = new Signin();  
	public  static void main(String args[]) throws InterruptedException, IOException {
		Testcase05_08.TestCase05_08();
	
	
	;}	

	
	/*public static void  gr(String xpath, String css) {
		WebDriverWait wait = new WebDriverWait (driver,15);
		
		
		if ( driver.findElements(By.xpath(xpath)).size()!=0) {
			 driver.findElement(By.xpath(xpath)).click();}
      else {	
			driver.findElement(By.xpath(css)).click();}
			}*/
	
	
	
	
	
	
	public static void testc ( String a) {
		WebDriverWait wait = new WebDriverWait (driver,15);
	
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(a))).click();     //click method 
	}

	
	public static void tests ( String a,String b) {
		WebDriverWait wait = new WebDriverWait (driver,15);
	
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(a))).sendKeys(b);;     //send key method
	}
	
	
	public static String testg ( String a) {
		WebDriverWait wait = new WebDriverWait (driver,15);
	
	String b=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(a))).getText();   //get key method
	return b;
	}
	
	
	

	public static void screenshoot(String a) throws IOException {                  //STILL working on this 
		
	File src =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File( a));	
	
	


	

		
		
		
		
		

			
		
		
  
		    
			
			
			
		}
								
										
										
														
}
								
								
								
								/*	public static void TestCase16 () throws InterruptedException {
									WebDriverWait wait = new WebDriverWait (driver,15);
									
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/header/div/div[2]/div/ul/li[1]/a/button"))).click();
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/form/div[4]/p/a[2]"))).click();
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[1]/input"))).sendKeys(name);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[2]/input"))).sendKeys(lastname);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[3]/input"))).sendKeys(email);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[4]/input"))).sendKeys(password);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[5]/input"))).sendKeys(password);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[1]/input"))).sendKeys("03");
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[2]/input"))).sendKeys("03");
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[3]/input"))).sendKeys("1983");
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[7]/button"))).click();
									//System.out.println(expected_result+" "+expected_result2);
									String expected_result=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/header/div/div[2]/div/div/div[1]/span"))).getText();
									System.out.println(expected_result);
		*/





		
		
	