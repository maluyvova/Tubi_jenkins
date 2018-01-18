package core;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Testcase06_02 extends Main implements  URL, Xpath,data,Data_for_user{
	public static String TestCase06_02() throws InterruptedException, IOException{
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
	    for (int i=1;i<5;i++) {
	    	act.moveToElement(driver.findElement(By.xpath(Xpath.smount))).click().sendKeys(Keys.BACK_SPACE).build().perform();//delete from field month, i'm using keybord back-space 5 times
	    	act.moveToElement(driver.findElement(By.xpath(Xpath.sday))).click().sendKeys(Keys.BACK_SPACE).build().perform();//delete from field day, i'm using keybord back-space 5 times
	    	act.moveToElement(driver.findElement(By.xpath(Xpath.syear))).click().sendKeys(Keys.BACK_SPACE).build().perform();//delete from field year, i'm using keybord back-space 5 times
	    } 
	     tests(Xpath.smount,"03"); //send key to month
	     tests(Xpath.sday,"01"); //send key to month
	     tests(Xpath.syear,"1999"); //send key to month
	     screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase06_01.png");
	    testc(Xpath.save); //click on save
	    Thread.sleep(4000); 
	    driver.navigate().back();//navigate back in browser
	     act.moveToElement(b).perform();  //mouse ovver
		    Thread.sleep(4000);
		    testc("/html/body/div/div/div[2]/header/div/div[2]/div/div/div[2]/a[1]");// settings in left corner
		    Thread.sleep(4000); 
		   String a=driver.findElement(By.xpath(Xpath.sday)).getAttribute("value");//get text from day
		   String d=driver.findElement(By.xpath(Xpath.syear)).getAttribute("value");// get text from year
		   String c=driver.findElement(By.xpath(Xpath.smount)).getAttribute("value"); // get text from month
 driver.close();
 System.out.println(a+c+d);
	return a+c+d;}
}
