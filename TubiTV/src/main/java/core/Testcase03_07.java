package core;

import java.io.IOException;

public class Testcase03_07 extends Main implements  URL, Xpath,data,Data_for_user {

	
	
	
	
	
	public static String TestCase03_07() throws InterruptedException, IOException{
	    driver=br();
		driver.get(URL.urlActivate);
		testc(Xpath.aregister);
		//Thread.sleep(4000);
		testc(Xpath.signin_);
		Thread.sleep(4000);
		String expected_result= driver.getCurrentUrl();
		 screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase03_07.png");
		driver.close();
		return expected_result;}
}
