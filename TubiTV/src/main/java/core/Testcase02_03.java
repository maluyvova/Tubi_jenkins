package core;

import java.io.IOException;

public class Testcase02_03 extends Main implements  URL, Xpath,data,Data_for_user {
	
	

	public static String TestCase02_03() throws InterruptedException, IOException{
		driver=br();
		driver.get(URL.url);
		String email = "g@gmail.com";
	testc(Xpath.sign_in);
	tests(Xpath.semail,email);
	tests(Xpath.spassword,Data_for_user.spassword);
	testc(Xpath.orange_signIn);
	String expected_result1=testg(Xpath.error_message2_02);
	screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase02_03.png");
	driver.close();
	return expected_result1;
	
	}

}
