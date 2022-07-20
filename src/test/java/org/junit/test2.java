package org.junit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test2 {
	 static WebDriver driver;
	@BeforeClass
	public static void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Test
	public void login() {
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("java");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("987");
	}
	@AfterClass
	public static void afterClass() {
	//	driver.quit();
	}

}
