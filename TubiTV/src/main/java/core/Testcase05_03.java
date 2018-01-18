package core;

import java.io.IOException;

public class Testcase05_03 extends Main implements  URL, Xpath,data,Data_for_user {
	
	
	  
	  
	  public static String TestCase05_03() throws InterruptedException, IOException {
			 driver=br();
		    driver.get(URL.url);
		    testc(Xpath.search_field);
		    tests(Xpath.search_field,"Test 3");										 
		    testc(Xpath.test3);
		    testc(Xpath.search_field);
		    tests(Xpath.search_field,"Test 7");
		    testc(Xpath.tets7);
		    String result=testg("/html/body/div/div/div[2]/div/div[1]/div[1]/div[3]/div/div/div/div[2]/div[1]/h1");
		    screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase05_03.png");
		    driver.close();
           return result;}
	  

}
