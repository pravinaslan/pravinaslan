package com.pract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDataProv {
	
	@DataProvider
	public Object[][] getData() {
		Object [][] data=new Object[5][2];
		data[0][0]="a";
		data[0][1]="b";
		
		data[1][0]="aa";
		data[1][1]="bb";
				
	    data[2][0]="aaa";
	   data[2][1]="bbb";
	   
	   
	   data[3][0]="aaaa";
	   data[3][1]="bbbb";
	   
	   data[4][0]="aaa";
	   data[4][1]="bbb";
	   
	  return data; 
	}
	@Test(dataProvider="getData")
	private void tc01(String s1,String s2) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement txtuser = driver.findElement(By.id("email"));
		txtuser.sendKeys(s1);
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys(s2);
		
	}

}
