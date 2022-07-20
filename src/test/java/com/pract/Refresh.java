package com.pract;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.testNg.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Refresh extends BaseClass {
	
	@BeforeClass
	private void beforeClass() throws InterruptedException {
		getDriver();
		loadUrl("https://www.facebook.com/");
		maximize();
		staticWait(3000);
		
	}
	
	
	@Test(priority=1)
	private void withOutPom() {
		WebElement txtuser = driver.findElement(By.id("email"));
		txtuser.sendKeys("pravin");
	     driver.navigate().refresh();
		String attribute = txtuser.getAttribute("value");
		System.out.println(attribute);
		
	}
	@Parameters({"username","password"})
	@Test(priority=0)
	private void withPom(String s,String s1) {
		LoginPage page=new LoginPage();
		page.LoginPage1(s, s1);
		navigation();
		String domAttribute = page.getTxtUserName().getDomAttribute("value");
		System.out.println(domAttribute);
		
		
		
	
	
	}
	
		
	}


