package core;

import java.io.IOException;

public class Testcase02_01 extends Main implements  URL, Xpath,data,Data_for_user {

	
	public static String TestCase02_01() throws InterruptedException, IOException{
		driver=br();
		driver.get(URL.url);
		String email = "vburian@tubi.tv";
		String password= "tubitv";
	testc(Xpath.sign_in);
	tests(Xpath.semail,email);
	tests(Xpath.spassword,password);
	testc(Xpath.orange_signIn);
	screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase02_01.png");
	Thread.sleep(4000);
   String expected_result=driver.getCurrentUrl();
   driver.close();
	return expected_result;
	}
}
