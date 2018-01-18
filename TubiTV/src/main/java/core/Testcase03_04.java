package core;

import java.io.IOException;

public class Testcase03_04 extends Main implements  URL, Xpath,data,Data_for_user {

	
	
	
	
	
	public static String TestCase03_04() throws InterruptedException, IOException{
		driver=br();
		driver.get(URL.urlActivate);		
		testc(Xpath.asign_in);
		tests(Xpath.semail,Data_for_user.aemail);
		tests(Xpath.spassword,Data_for_user.spassword);
		testc(Xpath.orange_signIn);
		Thread.sleep(4000);
		String expected_result= driver.getCurrentUrl();
		 screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase03_04.png");
		driver.close();
		return expected_result;}
}
