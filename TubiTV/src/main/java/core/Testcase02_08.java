package core;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testcase02_08 extends Main implements  URL, Xpath,data,Data_for_user{
	
	
	
	public static String TestCase02_08 () throws InterruptedException, IOException{
		driver=br();
		driver.get(URL.url);
		WebDriverWait wait = new WebDriverWait(driver,15);
		testc(Xpath.sign_in); //register in home page
		testc(Xpath.sfacebook);  //register via facebook
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email"))).sendKeys(data.newfacabookemail5); //email field in facebook
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("pass"))).sendKeys(data.newfacebookpassword); //password field in facebook
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginbutton"))).click(); //login button in facebook
		testc("/html/body/div[5]/div[2]/div/div/form/div/div[1]/div[2]/div[1]/div[1]/button"); //popup in facebook to continue
		Thread.sleep(4000);
		screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase02_08.png");
		testc("/html/body/div[1]/div/div[2]/div/div[1]/div/div/div/p[4]/a"); //click on "continue anyway" in a butom 
		Thread.sleep(2000);
		String expected_result=driver.getCurrentUrl();
		screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase02_07.png");
	driver.close();
		return expected_result;
	}
	

}
