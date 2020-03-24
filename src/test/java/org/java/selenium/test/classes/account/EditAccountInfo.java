package org.java.selenium.test.classes.account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * 
 * @author sarthak-pc to be used after Login
 */
public class EditAccountInfo {

	public void editAccountInfo(WebDriver driver) throws InterruptedException {

		driver.findElement(By.xpath("//a[text()='Edit your account information']")).click();
		System.out.println("Reached the Edit acoount Page and the Title is " + driver.getTitle());

		String orignalLastName = driver.findElement(By.xpath("//input[@name='lastname']")).getText();

		String updatedLastName = "Thakare";

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(updatedLastName);
		driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys("8874545745");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Continue']")).click();

		System.out.println(driver.findElement(By.className("alert alert-success alert-dismissible")).getText());

	}

}
