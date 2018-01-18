package core;

import java.io.IOException;

public class Testcase01_02 extends Main implements  URL, Xpath,data,Data_for_user
{
	public static String TestCase01_02() throws InterruptedException, IOException {
		driver=br();
	    driver.get(URL.url);  //launch web site
		testc(Xpath.register); // click on register on the right upper corner
		tests(Xpath.first_name,Data_for_user.name);  //send data for first name field with 
		tests(Xpath.last_name,Data_for_user.lastname); //send dart for last name field with 
		tests(Xpath.email,email1.randomemail());   //  send data for email field with rondom email from email class
		tests(Xpath.password,Data_for_user.password);  //send data for password field with
		tests(Xpath.repassword,Data_for_user.password);  //send data for repassword field 
		tests(Xpath.month,Data_for_user.Month);   //send data for month field 
		tests(Xpath.day,Data_for_user.Day);     // send data for day field 
		tests(Xpath.year,Data_for_user.Year);   //send data for year field
		screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase01_02.png");  //make screen screenshot
		testc(Xpath.orange_register);  //click on register button
		screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase01_02_1.png");  //mskr s screen screenshot
		Thread.sleep(4000);
		String expected_result =driver.getCurrentUrl(); //current url
		driver.close();
		System.out.println(expected_result);
		
		return expected_result;
	}
	
	
	
	
}
