package core;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Testcase06_0 extends Main implements  URL, Xpath,data,Data_for_user {
	
	
	


	public static String TestCase06_0() throws InterruptedException, IOException{
		  driver=br();
		  driver.get(URL.url);
		testc(Xpath.sign_in);  //click on sign in
		tests(Xpath.semail,Data_for_user.aemail);   //sign in field
		tests(Xpath.spassword,Data_for_user.spassword);  //password field
		testc(Xpath.orange_signIn); //click on orange sign_in
		 WebElement b=driver.findElement(By.xpath("/html/body/div/div/div[2]/header/div/div[2]/div/div/div[1]/span")); // pop-up in left corner
		    Actions act=new Actions(driver); //Action class
		    act.moveToElement(b).perform();  //mouse ovver
		    Thread.sleep(4000);
		    testc("/html/body/div/div/div[2]/header/div/div[2]/div/div/div[2]/a[1]");
	    for (int i=1;i<5;i++) {
	    	act.moveToElement(driver.findElement(By.xpath(Xpath.first_nama))).click().sendKeys(Keys.BACK_SPACE).build().perform();} //delete from field first name, i'm using keybord back-space 5 times
	     tests(Xpath.first_nama,"ok"); //send key to first name
	     screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase06_00.png");
	     testc(Xpath.save);  //click on save
	     Thread.sleep(4000);
	 String expected_result=testg("/html/body/div/div/div[2]/header/div/div[2]/div/div"); //take the name in upper right corner
	  for (int i=1;i<3;i++) {
		    act.moveToElement(driver.findElement(By.xpath(Xpath.first_nama))).click().sendKeys(Keys.BACK_SPACE).build().perform();} //delete ok from first name field 3 times
		     tests(Xpath.first_nama,"Vlad"); //type Vlad in firstname field
		     testc(Xpath.save); //click on save
   driver.close();
   System.out.print(expected_result);
	return expected_result;	}

}
