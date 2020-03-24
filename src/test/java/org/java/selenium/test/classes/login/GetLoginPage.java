package org.java.selenium.test.classes.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 
 * @author sarthak-pc
 *
 */
public class GetLoginPage {

	
	public void getLoginLink(WebDriver driver) {
		
		
		WebElement loginLink = driver.findElement(new By.ByXPath("//a[text()='Login']"));
		if (loginLink.isEnabled()) {
			System.out.println(" Login  link found");

			   loginLink.click();
		
		}
		
	}
	

	
}
