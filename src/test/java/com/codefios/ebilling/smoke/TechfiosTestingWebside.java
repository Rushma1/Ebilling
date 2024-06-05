package com.codefios.ebilling.smoke;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TechfiosTestingWebside {
	static WebDriver driver;

	// positive:correct username and correct password
	@Test
	public void positiveLoginTest() {
		login("demo@codefios.com ", "abc123");

	}

	// negative correct username and incorrect password
	@Test
	public void negativeLoginTest1() {
		login("demo@codefios.com", "garbage");

	}

	// negative incorrect username and incorrect password
	@Test
	public void negativeLoginTest2() {

		login("wrongUserName", "garbage");
	}

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rushma\\Selenium\\EBilling\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://codefios.com/ebilling/");
	}

	@After
	public void teardown() {
		driver.close();
	}

	private static void login(String user, String pwd) {
		driver.findElement(By.id("user_name")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("login_submit")).click();

	}

}
