package core;

import java.io.IOException;

public class Testcase03_05_1 extends Main implements  URL, Xpath,data,Data_for_user{
	
	
	
	
	
	public static String TestCase03_05_1() throws InterruptedException, IOException{
		driver=br();
		driver.get(URL.urlActivate);	
		testc(Xpath.asign_in);
		tests(Xpath.semail,Data_for_user.aemail);
		tests(Xpath.spassword,Data_for_user.spassword);
		testc(Xpath.orange_signIn);
		testc(Xpath.tubitv);
		 screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase03_05_1.png");
		String expected_result1=testg(Xpath.greting);
		driver.close();
return expected_result1;}

}
