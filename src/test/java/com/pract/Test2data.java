package com.pract;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.testNg.BaseClass;

public class Test2data  extends BaseClass{
	
	@DataProvider
	public Object[][] getData() throws IOException {
		
		return new Object[][] {{getData("adactin", 0, 0),getData("adactin", 0, 1)},{getData("adactin", 1, 0),getData("adactin", 1, 1)},
			{getData("adactin", 2, 0),getData("adactin", 2, 1)}
		};
	}
	@Test(dataProvider="getData")
	private void tc01(String s1,String s2) {
		getDriver();
		loadUrl("https://www.facebook.com/");
		maximize();
		WebElement txtuser = findElementById("email");
		type(txtuser, s1);
		WebElement txtpass = findElementById("pass");
		type(txtpass, s2);

	}
	

}
