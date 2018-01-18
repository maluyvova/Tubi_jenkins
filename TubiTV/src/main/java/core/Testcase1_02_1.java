package core;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testcase1_02_1 extends Main implements  URL, Xpath,data,Data_for_user{

	
	
	
	
	public static String TestCase1_02_1() throws InterruptedException {
		driver=br();
		WebDriverWait wait = new WebDriverWait (driver,15);
		String URLT="https://www.mohmal.com/en/view";
		driver.get(URLT);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("rand"))).click();
	    //String email= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/header/div/div/div/div[2]/div/div[1]/div"))).getText();
	    String email1=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[1]"))).getText();
      System.out.println(email1);
	    driver.navigate().to(URL.url);
		testc(Xpath.register);
	    tests(Xpath.first_name,Data_for_user.name);
		tests(Xpath.last_name,Data_for_user.lastname);
		tests(Xpath.email,email1);
		tests(Xpath.password,Data_for_user.password);
		tests(Xpath.repassword,Data_for_user.password);
		tests(Xpath.month,Data_for_user.Month);
		tests(Xpath.day,Data_for_user.Day);
		tests(Xpath.year,Data_for_user.Year);
		testc(Xpath.orange_register);
	    Thread.sleep(4000);
		driver.navigate().to(URLT);
	Thread.sleep(4000);
	 testc("//td[@class='subject']"); //click on that email
Thread.sleep(4000);
driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[1]/div/div[7]/div/div[2]/iframe")));//change to that email frame
int b= driver.findElements(By.tagName("a")).size();  //check how many links on a page
for (int i=0;i<b;i++) {
String result=driver.findElements(By.tagName("a")).get(i).getText();	
System.out.println(result);}  //this loop gives me text of all links
wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Verify Your Email"))).click();  // click for link witch have a name Verify email

for (int i=0;i<b;i++) {
if  (driver.findElements(By.tagName("a")).get(i).getText().contains("Verify Your Email")) {
 System.out.println( wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Verify Your Email"))));
  wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.tagName("a"))).get(i).click();
 System.out.println(driver.findElements(By.tagName("a")).get(i).getLocation());
  driver.findElements(By.tagName("a")).get(i).click();
break;}
ArrayList<String> tabs= new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(tabs.get(1));

}
String result=driver.getCurrentUrl();


return result;
	    
		
		
		
	}
							
}
