package core;

import java.io.IOException;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Testcase01_04 extends Main implements  URL, Xpath,data,Data_for_user



{

	public static String TestCase01_04() throws InterruptedException, IOException {
		driver =br();
		driver.get(URL.url);  //launch app
		String lastname="AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"; //last name
		testc(Xpath.register);  //click on register
		tests(Xpath.first_name,Data_for_user.name);   //send key to firstname field with naem
		tests(Xpath.last_name,lastname);   // send key to last name field with 
		String expected_result1=testg("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[2]"); //get epected result some error message 
		screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase01_04.png"); // make a screenshot
		driver.close();
		return expected_result1
				;
		
	}

}
