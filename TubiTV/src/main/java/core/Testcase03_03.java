package core;

import java.io.IOException;

public class Testcase03_03 extends Main implements  URL, Xpath,data,Data_for_user{
	
	
	public static String TestCase03_03() throws InterruptedException, IOException{
	driver=br();
		driver.get(URL.urlActivate);

		testc(Xpath.aregister);
		tests(Xpath.first_name,Data_for_user.name);
		tests(Xpath.last_name,Data_for_user.lastname);
		tests(Xpath.email,email1.randomemail());
		tests(Xpath.password,Data_for_user.password);
		tests(Xpath.repassword,Data_for_user.password);
		tests(Xpath.month,Data_for_user.Month);
		tests(Xpath.day,Data_for_user.Day);
		tests(Xpath.year,Data_for_user.Year);
		testc(Xpath.orange_register);
		Thread.sleep(4000);
		String expected_result= driver.getCurrentUrl();
		 screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase03_03.png");
		driver.close();
		System.out.println(expected_result);
		return expected_result;
		}

}
