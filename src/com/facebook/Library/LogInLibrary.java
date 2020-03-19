package com.facebook.Library;

import org.openqa.selenium.support.PageFactory;

import com.facebook.Page.LogInPage;
import com.facebook.Utility.BaseTest;

public class LogInLibrary extends BaseTest{

	public void facebookLogIn() throws Exception {
		
		LogInPage logIn = PageFactory.initElements(dr, LogInPage.class);
		logIn.EmailTxtBox.sendKeys("mayuripatil1505@gmail.com");
		logIn.PassTxtBox.sendKeys("sumitchougule");
		logIn.LogInBtn.click();
		Thread.sleep(5000);
		
        //dr.switchTo().alert().dismiss();
		
		
		//logIn.PostTxtBox.click();
		logIn.PostTxtBox.sendKeys("Hello");
		Thread.sleep(5000);
		logIn.PostBtn.click();
		
		
		
	}

}
