package core;

import java.io.IOException;

public class Testcase02_02 extends Main implements  URL, Xpath,data,Data_for_user{
	
	
	

	public static String TestCase02_02() throws InterruptedException, IOException{
		driver=br();
		driver.get(URL.url);
	testc(Xpath.sign_in);
    tests(Xpath.semail,Data_for_user.semail);
	tests(Xpath.spassword,Data_for_user.spassword);
	testc(Xpath.orange_signIn);
	screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase02_02.png");
	String expected_result1=testg(Xpath.error_message2_02);
	driver.close();
return expected_result1;
	
	
   
	}

}
