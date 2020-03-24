package org.java.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * 
 * @author sarthak-pc
 *
 */

public class InvokeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.opencart.com");

		WebElement accountLink = driver.findElement(new By.ByXPath("//a[@title='My Account']"));
		if (accountLink.isEnabled()) {
			System.out.println("link found");

			accountLink.click();

			WebElement regLink = driver.findElement(new By.ByXPath("//a[text()='Register']"));
			if (regLink.isEnabled()) {
				System.out.println(" register link found");

				regLink.click();

				//Using By name 
				
			/*	RegistrationPageAutomation regPageAuto = new RegistrationPageAutomation();

				regPageAuto.registrationPageAutomation(driver);
				
				*/
				
				
				//*********Using Xpath***************
				
				RegistrationPageByXPath regByXPath = new RegistrationPageByXPath();
				regByXPath.registrationPageByXPath(driver);
				
			}

		}

		System.out.println("The new title is :" + driver.getTitle());

		/**
		 ******** for pausing the browser screen
		 */
		// System.console().readLine();
		driver.close();

	}

}
