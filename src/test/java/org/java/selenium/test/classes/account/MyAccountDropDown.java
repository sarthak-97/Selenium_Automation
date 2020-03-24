package org.java.selenium.test.classes.account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 
 * @author sarthak-pc
 *
 */
public class MyAccountDropDown {

	public void getMyAccountDropDown(WebDriver driver) {
		
		WebElement accountLink = driver.findElement(new By.ByXPath("//a[@title='My Account']"));
		if (accountLink.isEnabled()) {
			System.out.println("link found");

			accountLink.click();
			
		}
		
		
		
		
	}
	
}
