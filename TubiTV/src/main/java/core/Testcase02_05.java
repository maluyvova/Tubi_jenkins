package core;

import java.io.IOException;

public class Testcase02_05 extends Main implements  URL, Xpath,data,Data_for_user {
	
	
	public static String TestCase02_05() throws InterruptedException, IOException{
		driver=br();
		driver.get(URL.url);
	testc(Xpath.register);	
	testc(Xpath.signin_down);
	tests(Xpath.semail,Data_for_user.aemail);
	tests(Xpath.spassword,Data_for_user.spassword);
	testc(Xpath.orange_signIn);
	Thread.sleep(4000);
	screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase02_05.png");
   
	String expected_result=driver.getCurrentUrl();
	System.out.println(expected_result);
   driver.close();
return expected_result;}

}
