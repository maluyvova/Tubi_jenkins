package core;

import java.io.IOException;

public class Testcase02_04 extends Main implements  URL, Xpath,data,Data_for_user{
	
	
	public static String  TestCase02_04() throws InterruptedException, IOException{
		driver=br();
		driver.get(URL.url);
		String password= "gggggg";
	testc(Xpath.sign_in);
	tests(Xpath.semail,Data_for_user.aemail);
	tests(Xpath.spassword,password);
	testc(Xpath.orange_signIn);
	String expected_result1=testg(Xpath.error_message2_02);
	screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase02_04.png");
	driver.close();
	return expected_result1;}

}
