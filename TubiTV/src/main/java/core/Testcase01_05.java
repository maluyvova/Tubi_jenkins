package core;

import java.io.IOException;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Testcase01_05 extends Main implements  URL, Xpath,data,Data_for_user {

	
	
	
	

	public static String TestCase01_05() throws InterruptedException, IOException {
		driver=br();
		driver.get(URL.url);
		String email="v.com"; 
		testc(Xpath.register);  //click on register
		tests(Xpath.first_name,Data_for_user.name); //send keys to first name field with
		tests(Xpath.last_name,Data_for_user.lastname); // send keys to last name field with 
		tests(Xpath.email,email);
		tests(Xpath.password,Data_for_user.password);  //send keys to password field with 
		tests(Xpath.repassword,Data_for_user.password);  //send keys to repassword field with
		tests(Xpath.month,Data_for_user.Month);  // send keys to month field with
		tests(Xpath.day,Data_for_user.Day);     //send keys to day field with
        tests(Xpath.year,Data_for_user.Year);    // send keys to year field with
		testc(Xpath.orange_register);       //click on register button
		Thread.sleep(4000); 
	    testc("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[3]/input");  //click on email one more time
		testc(Xpath.orange_register);      //click on register one more time
		String expected_result1=testg("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[3]");  //get result error message
		screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase01_05.png");  //make screenshot
		Thread.sleep(4000);
		driver.close();   //close webrowser
		return expected_result1;}


}
