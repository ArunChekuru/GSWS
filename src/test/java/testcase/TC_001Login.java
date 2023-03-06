package testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.Login;
import testbase.Baseclass;

public class TC_001Login extends Baseclass
{
	@Test
	public void test_login() throws IOException
	{
		try
		{
		logger.info("starting TC_001Login");
		driver.get(rb.getString("appurl"));
		driver.manage().window().maximize();
		Login lp=new Login(driver);
		lp.setusername(rb.getString("user"));
		logger.info("Entered Valid Username");
		lp.setpassword(rb.getString("pass"));
		logger.info("Entered Valid Password");
		lp.setclickbutton();
		logger.info("Click on Submit Button");
		boolean targetpage = lp.sucessfullogin();
		{
			if(targetpage)
			{
				logger.info("Login Sucess");
				Assert.assertTrue(true);
			}
			else
			{
				logger.error("Login Failed");
				captureScreen(driver,"test_login");
				Assert.assertTrue(false);
			}

		}
		}
		catch(Exception e)
		{
			logger.fatal("Login Failed");
			Assert.fail();
			
			
		}
		
		logger.info("Finished TC_001Login");
	}
	

}
