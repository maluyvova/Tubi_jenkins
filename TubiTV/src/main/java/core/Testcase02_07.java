package core;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testcase02_07 extends Main implements  URL, Xpath,data,Data_for_user {
	
	
	public static String TestCase02_07 () throws InterruptedException, IOException{
		driver=br();
		driver.get(URL.url);
		WebDriverWait wait = new WebDriverWait(driver,15);
		testc(Xpath.sign_in); //sign_in button
		testc(Xpath.sfacebook); //sign_in via facebook
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email"))).sendKeys(data.newfacabookemail4); //email field in Facebook
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("pass"))).sendKeys(data.newfacebookpassword);  //password field in Facebook
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginbutton"))).click(); //login button in facebook
		testc("/html/body/div[5]/div[2]/div/div/form/div/div[1]/div[2]/div[1]/div[1]/button"); //popup in facebook to continue
		Thread.sleep(4000);//pasword field in tubitv
		tests(Xpath.newpassword,data.newfacebookpassword); 
		screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase02_07.png");
		tests(Xpath.newpassword1,data.newfacebookpassword); //repassword field in tubitv
		testc(Xpath.newregister); //submit button in tubitv
		Thread.sleep(2000);
		String expected_result=testg("//div[@class='JE-KsM_bWE']");//greeting in right corner 
	driver.close();
		return expected_result;
	}

}
