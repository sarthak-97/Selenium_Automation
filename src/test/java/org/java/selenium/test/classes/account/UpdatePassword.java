package org.java.selenium.test.classes.account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * 
 * @author sarthak-pc
 *
 */
public class UpdatePassword {

	public void changePassword(WebDriver driver) throws InterruptedException {
		
		
		driver.findElement(By.xpath("//a[text()='Password']")).click();
		System.out.println("Reached the Edit password Page and the Title is " + driver.getTitle());
		
	
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("NewPassword");
		driver.findElement(By.xpath("//input[@name='confirm']")).sendKeys("NewPassword");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		
		System.out.println(driver.findElement(By.className("alert alert-success alert-dismissible")).getText());
		
	}
	
}
