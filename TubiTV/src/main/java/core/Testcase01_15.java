package core;

import java.io.IOException;

public class Testcase01_15 extends Main implements  URL, Xpath,data,Data_for_user {
	
	public static String TestCase01_15 () throws InterruptedException, IOException {
		driver = br();
		driver.get(URL.url);
		String Year = "3567";
		
		testc(Xpath.register);
		tests(Xpath.first_name,Data_for_user.name);
		tests(Xpath.last_name,Data_for_user.lastname);
		tests(Xpath.email,Data_for_user.email);
		tests(Xpath.password,Data_for_user.password);
		tests(Xpath.repassword,Data_for_user.password);
		tests(Xpath.month,Data_for_user.Month);
		tests(Xpath.day,Data_for_user.Day);
		tests(Xpath.year,Year);
	    testc(Xpath.orange_register);
		Thread.sleep(4000);
		testc(Xpath.day);
		testc(Xpath.year);
		testc(Xpath.orange_register);
		String expected_result1=testg("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[3]"); //get error message from year field
		screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase01_15.png");
	driver.close();
		return expected_result1;
		}
	
	
	
	
	

}
