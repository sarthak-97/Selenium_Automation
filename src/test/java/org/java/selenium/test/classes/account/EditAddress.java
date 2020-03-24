package org.java.selenium.test.classes.account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * 
 * @author sarthak-pc
 *
 */
public class EditAddress {

	public void editAddress(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.xpath("//a[text()='Address Book']")).click();
		System.out.println("Reached the Edit address  Page and the Title is " + driver.getTitle());
	
		Thread.sleep(2000);
		driver.findElement(By.linkText("Edit")).click();


		driver.findElement(By.name("address_1")).sendKeys("jain nanagr");
		driver.findElement(By.name("postcode")).sendKeys("700031");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		 System.out.println(driver.findElement(By.className("alert alert-success alert-dismissible")).getText());
		
	}
	
}
