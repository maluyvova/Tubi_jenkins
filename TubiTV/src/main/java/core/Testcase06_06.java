package core;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Testcase06_06  extends Main implements  URL, Xpath,data,Data_for_user {

	
	public static String TestCase06_06() throws InterruptedException, IOException{
	driver=br();
	  driver.get(URL.url);
	
	  testc(Xpath.register); // click on register on the right upper corner
		tests(Xpath.first_name,Data_for_user.name);  //send data for first name field with 
		tests(Xpath.last_name,Data_for_user.lastname); //send dart for last name field with 
		tests(Xpath.email,email1.randomemail());   //  send data for email field with rondom email from email class
		tests(Xpath.password,Data_for_user.password);  //send data for password field with
		tests(Xpath.repassword,Data_for_user.password);  //send data for repassword field 
		tests(Xpath.month,Data_for_user.Month);   //send data for month field 
		tests(Xpath.day,Data_for_user.Day);     // send data for day field 
		tests(Xpath.year,Data_for_user.Year);   //send data for year field
		//screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase01_02.png");  //make screen screenshot
		testc(Xpath.orange_register);  //click on register button
		  Actions act=new Actions(driver); //Action class
		  Thread.sleep(4000);  
		  WebElement b=driver.findElement(By.xpath("/html/body/div/div/div[2]/header/div/div[2]/div/div/div[1]/span")); // pop-up in left corner
		    act.moveToElement(b).perform();  //mouse over
		    Thread.sleep(4000);
		    testc("/html/body/div/div/div[2]/header/div/div[2]/div/div/div[2]/a[1]"); // settings in left corner
	        testc(Xpath.removemyacount);   // click on remove my account
	        testc(Xpath.delete); //click on delete Permanently
	        testc(Xpath.other); //select box "Other"
	        boolean a=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div/div/div/div[4]/div[1]/div/div[1]/div[2]/div[4]/label/input")).isSelected(); //check if the checkbox is selected
	        if ( a==true) 
	        	tests(Xpath.textarea,"tubitv"); //sendkeys to the text field with tubitv
	        	testc(Xpath.submiti); //click on submit
	        	testc(Xpath.pfield); //click on password field
	        	screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase06_06.png");
	       	tests(Xpath.pfield,Data_for_user.password); //send data to password field in last step
	       	testc(Xpath.laststep);  //last step submitting
	       	Thread.sleep(4000);
	       	String result=driver.findElement(By.xpath(Xpath.register)).getText(); //get text from "register button" in home page
	       	driver.close();
	       	return result;
	        
	        
	        	
	        //&& d==true && c==true
	
	  
	  
	  
	  
}}
