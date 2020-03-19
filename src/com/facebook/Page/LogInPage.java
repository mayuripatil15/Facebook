package com.facebook.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage {

	  @FindBy(xpath=".//*[@id='email']")
	  public WebElement EmailTxtBox;
	  
	  @FindBy(xpath=".//*[@id='pass']")
	  public WebElement PassTxtBox;
	  
	  @FindBy(xpath=".//*[@id='u_0_b']")
	  public WebElement LogInBtn;
	  
	  @FindBy(xpath=".//*[@name='xhpc_message']")
	  public WebElement PostTxtBox;
		
	  @FindBy(xpath="//button[contains(.,'Post')]")
	   public WebElement PostBtn;
	  
	  
	  
}
