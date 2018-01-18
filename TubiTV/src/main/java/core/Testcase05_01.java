package core;

import java.io.IOException;

public class Testcase05_01 extends Main implements  URL, Xpath,data,Data_for_user{
	
	
	
	  public static String TestCase05_01() throws InterruptedException, IOException {
			 driver=br();
		    driver.get(URL.url);
		    testc(Xpath.search_field);   //click on search field
		    tests(Xpath.search_field,"Test 7");	  //send key to search field with test7	 								 
		    testc(Xpath.tets7);   //open test7 title 
		    String result=testg("/html/body/div/div/div[2]/div/div[1]/div[1]/div[3]/div/div/div/div[2]/div[1]/h1"); 
		    screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase05_01.png");
		    driver.close();
          return result;}
	  

}
