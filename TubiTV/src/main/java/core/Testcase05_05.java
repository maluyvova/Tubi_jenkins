package core;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class Testcase05_05 extends Main implements  URL, Xpath,data,Data_for_user{
	
	
	
	  public static String TestCase05_05() throws InterruptedException, IOException {
			String data = "Test3";
			  driver=br();
			  Actions a = new Actions(driver);  //action 
			    driver.get(URL.url);
			    testc(Xpath.search_field);  //click on search field
			    tests(Xpath.search_field,data);   //send data to search field with test3 
			    for(int i=0;i<data.length();i++) {
			    a.moveToElement(driver.findElement(By.xpath(Xpath.search_field))).click().sendKeys(Keys.BACK_SPACE).build().perform();}   //send keys from keyboard with back space but this delete data just to left from cursor
			    a.moveToElement(driver.findElement(By.xpath(Xpath.search_field))).click().sendKeys(Keys.DELETE).build().perform();   //send keys from keyboard with delete but this delete data just to right from cursor
			   String result= testg("//h1[@class='H1']");
			   screenshoot("/Users/maluy/eclipse-workspace/TubiTV/Screenshots/TestCase05_05 .png");
               return result;}

}
