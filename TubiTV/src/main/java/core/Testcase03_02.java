package core;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testcase03_02 extends Main implements  URL, Xpath,data,Data_for_user {
	
	
	public static String TestCase03_02() throws InterruptedException, IOException{
		driver=br();
		driver.get(URL.urlActivate);
	WebDriverWait wait = new WebDriverWait ( driver,15);
	String email = "vburian@tubi.tv";
	String password ="tubitv";
	testc(Xpath.afacebook);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email"))).sendKeys(Data_for_user.aemail);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("pass"))).sendKeys(Data_for_user.spassword);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginbutton"))).click();
	//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[5]/div[2]/div/div/form/div/div[1]/div[2]/div[1]/div[1]/button"))).click();
	Thread.sleep(4000);
	String expected_result= driver.getCurrentUrl();
	 screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase03_02.png");
	driver.close();
	return expected_result;
	}

}
