package core;

import java.io.IOException;

public class Testcase01_06 extends Main implements  URL, Xpath,data,Data_for_user {
	
	public static String TestCase01_06() throws InterruptedException, IOException {
		driver =br();
		driver.get(URL.url);
		String email="@f.com";
		testc(Xpath.register);  //click on register
		tests(Xpath.first_name,Data_for_user.name);  //send key to first name field with
		tests(Xpath.last_name,Data_for_user.lastname);  //send key to last name field with
		tests(Xpath.email,email);   //send key to email field from this class data
		tests(Xpath.password,Data_for_user.password); //send key to password field with
		tests(Xpath.repassword,Data_for_user.password);  //send key to repassword field with
		tests(Xpath.month,Data_for_user.Month);   //send key to month field with
		tests(Xpath.day,Data_for_user.Day);    //send key to day field with
		tests(Xpath.year,Data_for_user.Year);   //send key to year field with
		testc(Xpath.orange_register);     //click on register button
		Thread.sleep(4000);
		testc(Xpath.email); //click on email field one more time 
		testc(Xpath.orange_register);  //click on register one more time
		String expected_result1=testg("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[3]");  //get error message from email field 
		screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase01_06.png");  //make screenshot 
		Thread.sleep(4000);
		driver.close();
		return expected_result1;}

	
	
	
	
	
	

}
