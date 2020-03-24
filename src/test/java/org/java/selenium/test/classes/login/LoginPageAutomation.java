package org.java.selenium.test.classes.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * 
 * @author sarthak-pc
 *
 */
public class LoginPageAutomation {

	public void automateLoginPage(WebDriver driver) throws InterruptedException {

		driver.findElement(By.name("email")).sendKeys("Abcd433@gmail.com");
		driver.findElement(By.name("password")).sendKeys("passWord");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		System.out.println("The title of the Page is :" + driver.getTitle());
		Thread.sleep(2000);
	}

}
