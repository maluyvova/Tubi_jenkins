package core;

import java.io.IOException;

public class Testcase01_03 extends Main implements  URL, Xpath,data,Data_for_user




{
	
	
	
	

	public static String TestCase01_03() throws InterruptedException, IOException {
		driver=br();   //get a live driver
		driver.get(URL.url);  //launch app
		String name = "vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv";  //first name
        testc(Xpath.register);  //click on register on right upper corner
		tests(Xpath.first_name,name);  //send key to first name field with name
		String expected_result=testg("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[1]");  //get a error message
		screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase01_03.png"); //make screenshot
		driver.close();  // close browser
		System.out.println(expected_result);
		return expected_result
				;}
	
	
	
	

}
