package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.Applyleave;
import pageobject.Login;
import testbase.Baseclass;

public class TC_002ApplyLeave extends Baseclass
{
	@Test
	public void test_applyleave()
	{ 
		try
		{
		logger.info("starting TC_002ApplyLeave");
		driver.get(rb.getString("appurl"));
		driver.manage().window().maximize();
		Login lp=new Login(driver);
		lp.setusername(rb.getString("user"));
		logger.info("Entered Valid Username");
		lp.setpassword(rb.getString("pass"));
		logger.info("Entered Valid Password");
		lp.setclickbutton();
		logger.info("Click on Submit Button");
		Applyleave al=new Applyleave(driver);
		al.setleavereg();
		logger.info("Click on Leave/Regularisation");
		al.setapplyleave();
		logger.info("Click on Apply Leave");
		al.setleavefrmdt("11/03/2023");
		logger.info("Entered From Date");
		al.setleavetodt("11/03/2023");
		logger.info("Entered To Date");
		al.setleavetype("Casual Leave");
		logger.info("Click on Leave Type");
		al.setleaveres("Sister Marriage");
		logger.info("Entered Leave Reason");
		al.setalternum("9964615482");
		logger.info("Enter Alternative Phone Number");
		al.setleaveadd("18/56A,kondapuram junction,hyderabad");
		logger.info("Enter Alternative Address");
		al.setleaveapply();
		logger.info("Click on Apply Leave Button");
		}
		catch (Exception e)
		{
			logger.fatal("Login Failed");
			Assert.fail();
		}
		logger.info("Finished TC_002ApplyLeave");
	
	}

}
