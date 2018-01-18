package core;

import java.io.IOException;

public class Testcase04_03 extends Main implements  URL, Xpath,data,Data_for_user {
	
	
	
    
	  public static void TestCase04_03() throws InterruptedException, IOException {
			 driver=br();
		    driver.get(URL.url);
		    testc(Xpath.sign_in);
		    testc(Xpath.forgot_password);
		    tests(Xpath.email_field,email1.randomemail());
		    testc(Xpath.submit);
	        testc(Xpath.email_field);
	        Thread.sleep(4000);
	        testc(Xpath.submit);
	        String expected=testg("/html/body/div/div/div[2]/div/div[1]/div[2]/div/div/div/form/div");
	        screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase04_03.png");
	        System.out.println(expected);
	  
	  }

}
