package org.java.selenium.test;

import org.java.selenium.test.classes.GetErrorMsgs;
import org.java.selenium.test.classes.account.AddNewAddress;
import org.java.selenium.test.classes.account.LogoutMyAccount;
import org.java.selenium.test.classes.account.MyAccountDropDown;
import org.java.selenium.test.classes.login.GetLoginPage;
import org.java.selenium.test.classes.login.LoginPageAutomation;
import org.java.selenium.test.classes.registration.GetRegisterPage;
import org.java.selenium.test.classes.registration.RegistrationPageByXPath;
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

		/**
		 ************ opening the demo cart in google chrome**********
		 */

		driver.get("https://demo.opencart.com");

		// *************** opening the My Account DropDown

		MyAccountDropDown myaccount = new MyAccountDropDown();
		 myaccount.getMyAccountDropDown(driver);

		// *************Going to login page ****************

		GetLoginPage getLoginPage = new GetLoginPage();
		 getLoginPage.getLoginLink(driver);

		 
		 //*********Automating Login page**********
		 
		 LoginPageAutomation loginPage = new  LoginPageAutomation(); 
		 loginPage.automateLoginPage(driver);
		 
		 LogoutMyAccount logout = new LogoutMyAccount();
		 logout.logout(driver);
		 
		/* AddNewAddress addnewAddress = new AddNewAddress();
		 addnewAddress.addNewAddress(driver);*/
		 
		// **********Getting to the register page ******************

		GetRegisterPage getRegisterPage = new GetRegisterPage();
		// getRegisterPage.getRegisterLink(driver);

		// ************registration page automation using class name****************

		/*
		 * RegistrationPageAutomation regPageAuto = new RegistrationPageAutomation();
		 * 
		 * regPageAuto.registrationPageAutomation(driver);
		 * 
		 */

		// *********registration page automation Using Xpath***************

		/*
		 * RegistrationPageByXPath regByXPath = new RegistrationPageByXPath();
		 * regByXPath.registrationPageByXPath(driver);
		 */

		// ************getting error msgs************

		GetErrorMsgs errorMessages = new GetErrorMsgs();
		//errorMessages.getErrorMsgs(driver);

		/**
		 ******** for pausing the browser screen
		 */
		// System.console().readLine();
		driver.close();

	}

}
