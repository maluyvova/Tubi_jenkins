package core;

import java.io.IOException;

public class Testcase05_02_2 extends Main implements  URL, Xpath,data,Data_for_user {
	
	
	public static String TestCase05_02_2() throws InterruptedException, IOException {
		 driver=br();
	    driver.get(URL.url);
	    testc(Xpath.search_field);
	    tests(Xpath.search_field,"Test 3");
	    testc(Xpath.test3);
	    testc("/html/body/div/div/div[2]/div/div[1]/div[1]/div[2]/div/div[2]/span/a"); //click on register, because you can not watch this movie
	    tests(Xpath.first_name,Data_for_user.name);  //send data for first name field with 
		tests(Xpath.last_name,Data_for_user.lastname); //send dart for last name field with 
		tests(Xpath.email,email1.randomemail());   //  send data for email field with rondom email from email class
		tests(Xpath.password,Data_for_user.password);  //send data for password field with
		tests(Xpath.repassword,Data_for_user.password);  //send data for repassword field 
		tests(Xpath.month,Data_for_user.Month);   //send data for month field 
		tests(Xpath.day,Data_for_user.Day);     // send data for day field 
		tests(Xpath.year,Data_for_user.Year);   //send data for year field
		screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase05_02_2.1.png");  //make screen screenshot
		testc(Xpath.orange_register);  //click on register button
	    String result=testg(Xpath.test3t);
	  System.out.println(result); 
	  screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase05_02_2.png");  
	  driver.close();
     return result;}

}
