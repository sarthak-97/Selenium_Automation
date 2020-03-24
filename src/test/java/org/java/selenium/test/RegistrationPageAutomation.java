package org.java.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * 
 * @author sarthak-pc
 *
 */
public class RegistrationPageAutomation {

	public void registrationPageAutomation(WebDriver driver) throws InterruptedException {
		
		
		driver.findElement(By.name("firstname")).sendKeys("Dexter");
		driver.findElement(By.name("lastname")).sendKeys("ksldgjljg");
		driver.findElement(By.name("email")).sendKeys("Abc1234@gmail.com");
		driver.findElement(By.name("telephone")).sendKeys("987457763211");
		driver.findElement(By.name("password")).sendKeys("passWord");
		driver.findElement(By.name("confirm")).sendKeys("passWord");
		driver.findElement(By.name("newsletter")).sendKeys("1");
	
		driver.findElement(By.name("agree")).click();
		
		Thread.sleep(2000);
		

		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[2]")).click();
		Thread.sleep(2000);

		System.out.println("Registration Successful");
		
	}
	
	
}
