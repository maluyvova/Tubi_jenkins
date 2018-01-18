package core;

import java.io.IOException;

public class Testcase05_04 extends Main implements  URL, Xpath,data,Data_for_user {
	
	
	  
	  
	  public static String TestCase05_04() throws InterruptedException, IOException {
			driver=br();
		    driver.get(URL.url);
		    testc(Xpath.search_field);
		    tests(Xpath.search_field,"xxxxxx");										 
		    String result=testg("/html/body/div/div/div[2]/div/div[1]/div[3]/div/h2");
		    screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase05_04.png");
		    driver.close();
           return result;}

}
