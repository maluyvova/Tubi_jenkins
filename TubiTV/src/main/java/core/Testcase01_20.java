package core;

import java.io.IOException;

public class Testcase01_20 extends Main implements  URL, Xpath,data,Data_for_user {

	
	

	public static String TestCase01_20 () throws InterruptedException, IOException{
		driver = br();
		driver.get(URL.url);
		String year ="2010";
	
		testc(Xpath.register); 
		tests(Xpath.first_name,Data_for_user.name);
		tests(Xpath.last_name,Data_for_user.lastname);
		tests(Xpath.email,email1.randomemail());
		tests(Xpath.password,Data_for_user.password);
		tests(Xpath.repassword,Data_for_user.password);
		tests(Xpath.month,Data_for_user.Month);
		tests(Xpath.day,Data_for_user.Day);
		tests(Xpath.year,year);
	    testc(Xpath.orange_register);
		Thread.sleep(4000);
		String expected_result =testg(Xpath.emessage);
		screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase01_20.png");
		driver.close();
return expected_result;}
}
