package org.java.selenium.test.classes;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * 
 * @author sarthak-pc
 *
 */
public class RegistrationPageAutomation {

	public void registrationPageAutomation(WebDriver driver) throws InterruptedException {

		/**
		 ******** using random for creating random email ids
		 */
		Random rand = new Random();

		driver.findElement(By.name("firstname")).sendKeys("Dexter");
		driver.findElement(By.name("lastname")).sendKeys("ksldgjljg");
		driver.findElement(By.name("email")).sendKeys("Abcd" + rand.nextInt(1000) + "@gmail.com");
		driver.findElement(By.name("telephone")).sendKeys("987457763211");
		driver.findElement(By.name("password")).sendKeys("passWord");
		driver.findElement(By.name("confirm")).sendKeys("passWord");
		driver.findElement(By.xpath("//input[@name='newsletter' and @value='1']")).click();

		driver.findElement(By.name("agree")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@value='Continue' and @type='submit']")).click();
		Thread.sleep(2000);

		System.out.println("Registration Successful");

	}

}
