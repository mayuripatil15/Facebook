package com.facebook.Library;

import org.openqa.selenium.support.PageFactory;

import com.facebook.Page.LogInPage;
import com.facebook.Utility.BaseTest;

public class LogInLibrary extends BaseTest{

	public void facebookLogIn() throws Exception {
		
		LogInPage logIn = PageFactory.initElements(dr, LogInPage.class);
		logIn.EmailTxtBox.sendKeys("mayuripatil");//Enter your Username
		logIn.PassTxtBox.sendKeys("password");//Enter Password
		logIn.LogInBtn.click();
		Thread.sleep(5000);
		
        //dr.switchTo().alert().dismiss();
		
		
		//logIn.PostTxtBox.click();
		logIn.PostTxtBox.sendKeys("Hello");
		Thread.sleep(5000);
		logIn.PostBtn.click();
		
		
		
	}

}
