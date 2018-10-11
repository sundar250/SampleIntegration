package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_002 {

	@Test
	public void testcase2() {
		System.setProperty("webdriver.chrome.driver",
				"./Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		driver.findElement(By.id("email")).sendKeys("user1");
		driver.findElement(By.id("pass")).sendKeys("pass1");
	}

}
