package core;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;

public class Testcase01_24 extends Main implements  URL, Xpath,data,Data_for_user {
	
	
	public static void TestCase01_24 () throws InterruptedException, IOException{
		JavascriptExecutor jse = ((JavascriptExecutor) driver);
		driver=br();
		driver.get(URL.url);
		jse.executeScript("window.scrollBy(0,100)");}
	
	
}
