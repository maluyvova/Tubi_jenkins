package core;

import java.io.IOException;

public class Testcase05_08 extends Main implements  URL, Xpath,data,Data_for_user {

	
	
	
	
	  public static String TestCase05_08() throws InterruptedException, IOException {
			
		  driver=br();
			    driver.get(URL.url);
			    testc(Xpath.sign_in);
			    tests(Xpath.semail,Data_for_user.aemail);
				tests(Xpath.spassword,Data_for_user.spassword);
				testc(Xpath.orange_signIn);
			    testc(Xpath.search_field);
			    tests(Xpath.search_field,"Test 3");	
			    Thread.sleep(4000);
			    testc(Xpath.test3);
			    testc(Xpath.search_field);
			    tests(Xpath.search_field,"Test 7");
			    Thread.sleep(4000);
			    testc(Xpath.tets7);
			    String result=testg("/html/body/div/div/div[2]/div/div[1]/div[1]/div[3]/div/div/div/div[2]/div[1]/h1");
			    screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase05_03.png");
			    System.out.println(result);
			    driver.close();
	           return result;}
}


