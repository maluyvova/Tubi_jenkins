package core;

import java.io.IOException;

public class Testcase05_02_1 extends Main implements  URL, Xpath,data,Data_for_user {
	
	
	
	 public static String TestCase05_02_1() throws InterruptedException, IOException {
		 driver=br();
	    driver.get(URL.url);
	    testc(Xpath.search_field);
	    tests(Xpath.search_field,"Test 3");
	    testc(Xpath.test3);
	    testc(Xpath.ssignin); //click on signin, because you can not watch this movie
	    tests(Xpath.semail,Data_for_user.aemail);
		tests(Xpath.spassword,Data_for_user.spassword);
		testc(Xpath.orange_signIn);
	    String result=testg(Xpath.test3t);
	  System.out.println(result); 
	  screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase05_02_1.png");  
	  driver.close();
      return result;}


}
