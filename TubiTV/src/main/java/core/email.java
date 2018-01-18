package core;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class email {
	public static String randomemail(){
		String ch = "abcdefghijklmnopqrstuvwxyz23456789";
	String randomString="";
	String a="vladb";
	String b="@rmail.com";
	Random rand = new Random();
	int lenght= rand.nextInt(10);
	char[] text = new char[lenght];
	for (int i=0; i<lenght;i++) {
		text[i]= ch.charAt(rand.nextInt(ch.length()));
	}
	for (int i=0; i<text.length;i++) {
		randomString+=text[i];
	}
	return a+randomString+b;

	
	
	
	
	
	
	}

}
