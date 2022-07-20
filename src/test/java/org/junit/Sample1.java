package org.junit;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample1 {
	static WebDriver driver;
	
	@BeforeClass
	public static void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
	}
	@Before
//	public void beforeMet() throws IOException {
//		TakesScreenshot take=(TakesScreenshot) driver;
//		File screenshotAs = take.getScreenshotAs(OutputType.FILE);
//		System.out.println(screenshotAs);
//		File fil=new File("D:\\screenshot/.png");
//		FileUtils.copyFile(screenshotAs, fil);
		
	
	@Test
	public void login() {
		WebElement txtuser = driver.findElement(By.xpath("//input[@name='email']"));
		txtuser.sendKeys("pravin");
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("9874");
	}
//	@After
//	public void afterMethod() throws IOException {
//		TakesScreenshot take=(TakesScreenshot) driver;
//		File screenshotAs = take.getScreenshotAs(OutputType.FILE);
//		System.out.println(screenshotAs);
//		File fil=new File("D:\\screenshot/.jpg");
//		FileUtils.copyFile(screenshotAs, fil);
//	}
	
	@AfterClass
	public static void afterClass() {
		//driver.quit();
		
	}
	

}
