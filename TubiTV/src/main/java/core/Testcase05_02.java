package core;

import java.io.IOException;

public class Testcase05_02 extends Main implements  URL, Xpath,data,Data_for_user {
	
	
	  public static String TestCase05_02() throws InterruptedException, IOException {
			 driver=br();
		    driver.get(URL.url);
		    testc(Xpath.search_field);
		    tests(Xpath.search_field,"Test 3");
		    testc(Xpath.test3);
		    String result=testg(Xpath.message);
		  System.out.println(result); 
		  screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase05_02.png");  
		  driver.close();
          return result;}

}
