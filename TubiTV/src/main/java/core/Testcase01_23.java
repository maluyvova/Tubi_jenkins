package core;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testcase01_23 extends Main implements  URL, Xpath,data,Data_for_user {
	public static String TestCase01_23 () throws InterruptedException, IOException{
		JavascriptExecutor jse = ((JavascriptExecutor) driver);
		driver=br();
		driver.get(URL.url);
		WebDriverWait wait = new WebDriverWait(driver,15);
		testc(Xpath.register); //register in home page
		testc(Xpath.facebook);  //register via facebook
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email"))).sendKeys(data.newfacebookemail3); //email field in facebook
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("pass"))).sendKeys(data.newfacebookpassword); //password field in facebook
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginbutton"))).click(); //login button in facebook
		testc("/html/body/div[5]/div[2]/div/div/form/div/div[1]/div[2]/div[1]/div[1]/button"); //popup in facebook to continue
		Thread.sleep(4000);
		screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase01_23_1.png");
		testc(Xpath.tubitv); //click on "tubi" logo in left right corner 
		Thread.sleep(2000);
		String expected_result=driver.getCurrentUrl();
		screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase01_23.png");
	driver.close();
		return expected_result;
}}
