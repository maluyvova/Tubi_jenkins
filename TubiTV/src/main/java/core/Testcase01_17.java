package core;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testcase01_17 extends Main implements  URL, Xpath,data,Data_for_user{
	
	

	public static String TestCase01_17 () throws InterruptedException, IOException{
		driver=br();
		driver.get(URL.url);
		WebDriverWait wait = new WebDriverWait(driver,15);
		testc(Xpath.register); //click on register on the right upper corner
		testc(Xpath.facebook);   //click on register via facebook
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email"))).sendKeys(Data_for_user.femail); //send key to email facebook
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("pass"))).sendKeys(Data_for_user.fpassword); //send password for facebook 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginbutton"))).click();   //click on login in facebook
		Thread.sleep(4000);
		String expected_result= driver.getCurrentUrl(); 
		screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase01_17.png");
	driver.close();
		return expected_result;
	
	
	
	

}}
