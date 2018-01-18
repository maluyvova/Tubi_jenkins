package core;

import java.io.IOException;

public class Testcase01_08 extends Main implements  URL, Xpath,data,Data_for_user {

	
	
	public static String  TestCase01_08 () throws InterruptedException, IOException {
		driver=br();
		driver.get(URL.url);
		String email="avburian@tubi.tv";
		testc(Xpath.register);
		tests(Xpath.first_name,Data_for_user.name);
	    tests(Xpath.last_name,Data_for_user.lastname);
		tests(Xpath.email,email);
		tests(Xpath.password,Data_for_user.password);
		tests(Xpath.repassword,Data_for_user.password);
		tests(Xpath.month,Data_for_user.Month);
		tests(Xpath.day,Data_for_user.Day);
		tests(Xpath.year,Data_for_user.Year);
		testc(Xpath.orange_register);
		Thread.sleep(4000);
		testc(Xpath.email);
		testc(Xpath.orange_register);
		screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase01_08.png");
		String expected_result1=testg("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/p/span");
		driver.close();
		return expected_result1;}
	
	
	
	
	
	
	
	
}
