package core;

import java.io.IOException;

public class Testcase01_01 
extends Main implements  URL, Xpath,data 


{
  
	
	
	
	public static String TestCase01_0() throws IOException {
		driver =br();
		driver.get(URL.url);
		String expectedResult=driver.getCurrentUrl(); 
		 screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase01_0.png");
		System.out.println(expectedResult);
		driver.close();
		return expectedResult;
		
	}
}
