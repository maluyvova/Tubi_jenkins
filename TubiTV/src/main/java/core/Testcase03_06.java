package core;

import java.io.IOException;

public class Testcase03_06 extends Main implements  URL, Xpath,data,Data_for_user{
	
	
	public static String TestCase03_06() throws InterruptedException, IOException{
		driver=br();
		driver.get(URL.urlActivate);
		testc(Xpath.asign_in);
		tests(Xpath.semail,Data_for_user.aemail);
		tests(Xpath.spassword,Data_for_user.spassword);
		testc(Xpath.register_);
		Thread.sleep(4000);
		String expected_result= driver.getCurrentUrl();
		 screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase03_06.png");
			driver.close();
			System.out.println(expected_result);
		return expected_result;}

}
