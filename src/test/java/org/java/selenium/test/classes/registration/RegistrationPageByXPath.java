package org.java.selenium.test.classes.registration;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * 
 * @author sarthak-pc
 *
 */
public class RegistrationPageByXPath {
	
	
	public void registrationPageByXPath(WebDriver driver) throws InterruptedException {
		
		/**
		 ******** using random for creating random email ids
		 */
		Random rand = new Random();

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Dexter");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("ksldgjljg");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Abcd" + rand.nextInt(1000) + "@gmail.com");
		driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys("987457763211");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("passWord");
		driver.findElement(By.xpath("//input[@name='confirm']")).sendKeys("passWord");
		driver.findElement(By.xpath("//input[@name='newsletter' and @value='0']")).click();
		driver.findElement(By.xpath("//input[@name='newsletter' and @value='1']")).click();
		driver.findElement(By.xpath("//input[@name='agree']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@value='Continue' and @type='submit']")).click();
		Thread.sleep(2000);

		System.out.println("Registration Successful");
		
		
	}
	

}
