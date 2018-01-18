package core;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class Testcase05_10 extends Main implements  URL, Xpath,data,Data_for_user{
	
	
	
	 public static String TestCase05_10() throws InterruptedException, IOException {
			String data = "Test3";
			  driver=br();
			  Actions a = new Actions(driver);  //action 
			    driver.get(URL.url);
			    testc(Xpath.sign_in);
			    tests(Xpath.semail,Data_for_user.aemail);
				tests(Xpath.spassword,Data_for_user.spassword);
				testc(Xpath.orange_signIn);
			    testc(Xpath.search_field);  //click on search field
			    tests(Xpath.search_field,data);   //send data to search field with test3 
			    for(int i=0;i<data.length();i++) {
			    a.moveToElement(driver.findElement(By.xpath(Xpath.search_field))).click().sendKeys(Keys.BACK_SPACE).build().perform();}   //send keys from keyboard with back space but this delete data just to left from cursor
			    for(int i=0;i<3;i++) {
			    a.moveToElement(driver.findElement(By.xpath(Xpath.search_field))).click().sendKeys(Keys.DELETE).build().perform(); }  //send keys from keyboard with delete but this delete data just to right from cursor
			    String result= testg("/html/body/div/div/div[2]/div/div[2]/div[2]/div[2]/div[2]/a/button");
			   // String result= testg(Xpath.watch);
			   screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase05_05 .png");
			   driver.close();
			   System.out.println(result);
            return result;}

}
