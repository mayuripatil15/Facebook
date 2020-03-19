package com.facebook.Suite;

import org.testng.annotations.Test;
import com.facebook.Library.LogInLibrary;
import com.facebook.Utility.BaseTest;

public class LogInSuite extends BaseTest{
	
	@Test
	public void login_facebook() throws Exception
	{
		LogInLibrary test = new LogInLibrary();
					
		   test.facebookLogIn();
		
			        
	}

	

}
