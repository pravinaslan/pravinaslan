package com.pract;

import java.time.Duration;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.testNg.BaseClass;

public class Execution extends BaseClass{
	@BeforeClass
	private void beforeClass() {
		getDriver();
		loadUrl("https://adactinhotelapp.com/");
		maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Parameters({"username","password"})
	@Test
	private void login(String username,String password) {
		LoginPage page=new LoginPage();
		page.LoginPage1(username, password);
	}
	

}
