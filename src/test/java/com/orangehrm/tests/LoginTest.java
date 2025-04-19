package com.orangehrm.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	// private static final Logger log = LogManager.getLogger(LoginTest.class);

	@Test
	public void validLoginTest() throws InterruptedException {
		// log.info("Starting valid login test");

		// Find and enter username
		Thread.sleep(1000);
		WebElement usernameField = driver.findElement(By.name("username"));
		usernameField.sendKeys("Admin");
		// log.debug("Entered username");

		// Find and enter password
		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("admin123");
		// log.debug("Entered password");

		// Click login button
		WebElement loginButton = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		loginButton.click();
		// log.debug("Clicked on login button");

		// Validate successful login (you can check for specific element after login)
//        WebElement welcomeMessage = driver.findElement(By.id("welcome"));
//        assert welcomeMessage.isDisplayed();
//        log.info("Login successful, welcome message displayed");
	}
}