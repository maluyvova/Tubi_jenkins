package core;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Testcase06_11 extends Main implements  URL, Xpath,data,Data_for_user {
	public static boolean TestCase06_11() throws InterruptedException, IOException{
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
		    testc("/html/body/div/div/div[2]/header/div/div[2]/div/div/div[2]/a[1]"); // settings in left corner
		    testc(Xpath.notifications);  //click on notifications
		    testc(Xpath.checkbox);  //check box
		    testc(Xpath.ssave); //save
		    Thread.sleep(4000);
		    testc(Xpath.tubit); //home button in the right corner
		    act.moveToElement(b).perform();  //mouse ovver
		    Thread.sleep(4000);
		    testc("/html/body/div/div/div[2]/header/div/div[2]/div/div/div[2]/a[1]"); // settings in left corner
		    testc(Xpath.notifications);  //click on notifications
		    boolean d=driver.findElement(By.xpath(Xpath.checkbox)).isSelected();
		    if ( d!=true) 
		    driver.close();
		    
			return d;
		    
		    

}}
