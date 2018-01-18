package core;

import java.io.IOException;

public class Testcase02_06 extends Main implements  URL, Xpath,data,Data_for_user{

	
	public static String TestCase02_06() throws InterruptedException, IOException{
		driver=br();
		driver.get(URL.url);
		
	testc(Xpath.register);	
	testc(Xpath.signin_up);
	tests(Xpath.semail,Data_for_user.aemail);
	tests(Xpath.spassword,Data_for_user.spassword);
    testc(Xpath.orange_signIn);
	Thread.sleep(4000);
	String expected_result=driver.getCurrentUrl();
	screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase02_06.png");
	driver.close();
return expected_result;}
}
