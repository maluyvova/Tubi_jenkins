package core;

import java.io.IOException;

public class Testcae04_01 extends Main implements  URL, Xpath,data,Data_for_user {
	
	
	
	
	  public static String TestCase04_01() throws InterruptedException, IOException{
		  driver=br();
		  driver.get(URL.url);
		 testc(Xpath.sign_in);
		 testc(Xpath.forgot_password);
		 Thread.sleep(4000);
		String expected_result= driver.getCurrentUrl();
		  screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase04_01.png");
		  driver.close();
		  return expected_result;}

}
