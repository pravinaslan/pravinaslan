package com.testNg;

import org.junit.BeforeClass;
import org.junit.Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sample extends BaseClass{
	public Sample() {
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(id="username")
	private WebElement txtuser;
	
@FindBy(id="password")
private WebElement txtpass;

public WebElement getTxtuser() {
	return txtuser;
}
public WebElement getTxtpass() {
	return txtpass;
}

public void login(String username,String txtpass) {
	type(getTxtuser(),username);
	type(getTxtpass(), txtpass);
	
}

}
