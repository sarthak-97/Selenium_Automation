package org.java.selenium.test.classes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 
 * @author sarthak-pc
 *
 */
public class GetErrorMsgs {

	public void getErrorMsgs(WebDriver driver) {

		driver.findElement(By.xpath("//input[@value='Continue' and @type='submit']")).click();
		System.out.println("Submit clicked");

		System.out.println("The new title is :" + driver.getTitle());

		List<WebElement> list = driver.findElements(By.className("text-danger"));

		for (WebElement a : list) {

			if (a.getText().contains("First Name"))
				System.out.println(a.getText());

			if (a.getText().contains("E-Mail"))
				System.out.println(a.getText());

			if (a.getText().contains("Password"))
				System.out.println(a.getText());
		}

	}

}
