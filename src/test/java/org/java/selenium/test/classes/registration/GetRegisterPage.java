package org.java.selenium.test.classes.registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 
 * @author sarthak-pc
 *
 */
public class GetRegisterPage {

	public void getRegisterLink(WebDriver driver) {
		WebElement regLink = driver.findElement(new By.ByXPath("//a[text()='Register']"));
		if (regLink.isEnabled()) {
			System.out.println(" register link found");

			   regLink.click();
		}
		
		
	}
	
}
