package com.testNg;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Execute extends BaseClass {
	@BeforeClass
	private void beforeMethod() {
		getDriver();
		loadUrl("https://adactinhotelapp.com/");
		maximize();
		
	}
	@Parameters({"username","password"})
	@Test
	public void login(String s,String s1) {
		Sample s4=new Sample();
		s4.login(s, s1);
	}
	{
		
	}
	
	
	}
	
	

