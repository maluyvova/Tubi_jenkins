package core;

import java.io.IOException;

public class Testcase01_10 
extends Main implements  URL, Xpath,data,Data_for_user{
	
	
	public static String TestCase01_10 () throws InterruptedException, IOException {
		driver=br();
		driver.get(URL.url);
		String password="1111111111111111111111111111111111";
		testc(Xpath.register);
		tests(Xpath.first_name,Data_for_user.name);
		tests(Xpath.last_name,Data_for_user.lastname);
		tests(Xpath.email,Data_for_user.email);
		tests(Xpath.password,password);
		tests(Xpath.repassword,password);
		tests(Xpath.month,Data_for_user.Month);
		tests(Xpath.day,Data_for_user.Day);
		tests(Xpath.year,Data_for_user.Year);
		testc(Xpath.orange_register);
		Thread.sleep(4000);
		testc(Xpath.password);
		testc(Xpath.orange_register);
		String  expectedResult1=testg("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[4]"); //get error message from password field
		screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase01_10.png");
		driver.close();
		//System.out.println(expected_result);
		return expectedResult1;}
	
	

}
