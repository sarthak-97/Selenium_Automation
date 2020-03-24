package org.java.selenium.test.classes.account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * 
 * 
 * @author sarthak-pc
 *
 */
public class AddNewAddress {

	public void addNewAddress(WebDriver driver) throws InterruptedException {

		driver.findElement(By.xpath("//a[text()='Address Book']")).click();
		System.out.println("Reached the Edit acoount Page and the Title is " + driver.getTitle());

		Thread.sleep(2000);
		driver.findElement(By.linkText("New Address")).click();

		driver.findElement(By.name("firstname")).sendKeys("Dexter");
		driver.findElement(By.name("lastname")).sendKeys("Gupta");
		driver.findElement(By.name("company")).sendKeys("CTS");
		driver.findElement(By.name("address_1")).sendKeys("Nagpur");
		driver.findElement(By.name("city")).sendKeys("Meerut");
		driver.findElement(By.name("postcode")).sendKeys("250002");
		Thread.sleep(200);

		Select country = new Select(driver.findElement(By.id("input-country")));

		// country.selectByIndex(99);
		country.selectByVisibleText("India");

		Thread.sleep(2000);

		Select zone = new Select(driver.findElement(By.id("input-zone")));
		// zone.selectByVisibleText("Uttar Pradesh");
		zone.selectByValue("1505");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Continue']")).click();

		// System.out.println(driver.findElement(By.className("alert alert-success
		// alert-dismissible")).getText());

	}

}
