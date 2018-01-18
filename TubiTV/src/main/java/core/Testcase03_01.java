package core;

import java.io.IOException;

public class Testcase03_01 extends Main implements  URL, Xpath,data,Data_for_user {
	
	public static String TestCase03_01() throws InterruptedException, IOException{
		driver=br();
		driver.get(URL.urlActivate);
	Thread.sleep(4000);
   String expected_result=driver.getCurrentUrl();
   screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase03_01.png");
   driver.close();
   return expected_result;}

}
