package core;

import java.io.IOException;

public class Testcase01_18 extends Main implements  URL, Xpath,data,Data_for_user{

	
	
	
	public static String TestCase01_18 () throws InterruptedException, IOException{
		driver=br();
		driver.get(URL.url);
		testc(Xpath.sign_in);
		testc(Xpath.register_down);
	    tests(Xpath.first_name,Data_for_user.name);
		tests(Xpath.last_name,Data_for_user.lastname);
		tests(Xpath.email,email1.randomemail());
		tests(Xpath.password,Data_for_user.password);
		tests(Xpath.repassword,Data_for_user.password);
		tests(Xpath.month,Data_for_user.Month);
		tests(Xpath.day,Data_for_user.Day);
		tests(Xpath.year,Data_for_user.Year);
		testc(Xpath.orange_register);
		screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase01_18.png");
		Thread.sleep(4000);
		String expected_result =driver.getCurrentUrl();
		driver.close();
		System.out.println(expected_result);
		return expected_result;}
}