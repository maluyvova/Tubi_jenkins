package core;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Testcase06_04 extends Main implements  URL, Xpath,data,Data_for_user {
	
	
	
	
	

	public static String TestCase06_04() throws InterruptedException, IOException{
		  driver=br();
		  driver.get(URL.url);
			String newpassword="newpassword";
			String wrongdata="m";
		testc(Xpath.sign_in);  //click on sign in
		tests(Xpath.semail,Data_for_user.aemail);   //sign in field
		tests(Xpath.spassword,Data_for_user.spassword);  //password field
		testc(Xpath.orange_signIn); //click on orange sign_in
		 WebElement b=driver.findElement(By.xpath("/html/body/div/div/div[2]/header/div/div[2]/div/div/div[1]/span")); // pop-up in left corner
		    Actions act=new Actions(driver); //Action class
		    act.moveToElement(b).perform();  //mouse over
		    Thread.sleep(4000);
		    testc("/html/body/div/div/div[2]/header/div/div[2]/div/div/div[2]/a[1]"); // settings in left corner
           tests(Xpath.sspassword,wrongdata);//send a password for "current password" field
           tests(Xpath.npassword,newpassword); //send a new password for "new password" field 
           tests(Xpath.rnpassword,newpassword); // resend a new password for "confirm password" 
           testc(Xpath.changepassword); //click on "change password"  
           String result=testg(Xpath.errormesage); // pop-up message
           System.out.println(result);
           driver.close();
             return result;         }	

}
