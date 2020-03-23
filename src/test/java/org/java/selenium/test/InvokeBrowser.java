package org.java.selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.amazon.in");
		
		System.out.println(	driver.getTitle());
		
		System.console().readLine();
		driver.close();

	}

}
