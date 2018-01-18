package core;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testcase04_02 extends Main implements  URL, Xpath,data,Data_for_user{

	
	
	
	  public static String TestCase04_02() throws InterruptedException, IOException {
			 driver = br();
			 
			 String lastname="Anthon";
				String password="1234567";
				String Month = "02";
				String Day = "01";
				String Year = "1989";
				String name = "Vlad";
			 WebDriverWait wait = new WebDriverWait(driver,15);
			 String URLT="https://www.mohmal.com/en/view";
				driver.get(URLT);
			    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("rand"))).click();
			    String email1=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[1]"))).getText();
			    
			    driver.navigate().to(URL.url);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Xpath.register))).click();
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Xpath.first_name))).sendKeys(name);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Xpath.last_name))).sendKeys(lastname);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Xpath.email))).sendKeys(email1);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Xpath.password))).sendKeys(password);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Xpath.repassword))).sendKeys(password);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Xpath.month))).sendKeys(Month);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Xpath.day))).sendKeys(Day);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Xpath.year))).sendKeys(Year);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Xpath.orange_register))).click();
			    Thread.sleep(4000);
			   
			    WebElement b=driver.findElement(By.xpath("/html/body/div/div/div[2]/header/div/div[2]/div/div/div[1]/span"));
			    Actions act=new Actions(driver);
			    act.moveToElement(b).perform();
			    testc("/html/body/div/div/div[2]/header/div/div[2]/div/div/div[2]/a[2]");
			    testc(Xpath.sign_in);
			    testc(Xpath.forgot_password);
			    tests(Xpath.email_field,email1);
			   testc(Xpath.submit);
			   Thread.sleep(4000);
			    driver.navigate().to(URLT);
			   testc("/html/body/div[1]/div/div[6]/table/tbody/tr");
			   testc("/html/body/div[1]/div/div[6]/table/tbody/tr[2]");
			   testc("/html/body/div[1]/div/div[6]/table/tbody/tr[2]");
				
			    //testc(Xpath.sign_in);
				//testc(Xpath.forgot_password);
				//tests(Xpath.email_field,email1);
				//testc(Xpath.submit);
			//	driver.navigate().to(URLT);
				// testc("/html/body/div[1]/div/div[6]/table/tbody/tr/td[1]/a");
				 return email1;
		  }
}
