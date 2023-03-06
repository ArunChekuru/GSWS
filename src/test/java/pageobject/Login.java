package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	public WebDriver driver;
	public Login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='user-name']")
	WebElement txtusername;
	@FindBy(xpath="//input[@id='password']")
	WebElement txtpassword;
	@FindBy(xpath="//button[@id='save']")
	WebElement txtbutton;
	@FindBy(xpath="//div[@class='col-md-6']//a[text()='forgot password']")
	WebElement frgtpassword;
	@FindBy(xpath="//input[@id='remember_me']")
	WebElement chckbox;
	@FindBy(xpath="//h4[text()='Attendance Regularization']")
	WebElement cnfmsg;
	
	public void setusername(String usrnam)
	{
		txtusername.sendKeys(usrnam);
	}
	public void setpassword(String urpwd)
	{
		txtpassword.sendKeys(urpwd);
	}
	public void setforgotpassword()
	{
		frgtpassword.click();
	}
	public void setclickchkbox()
	{
		chckbox.click();
	}
	public void setclickbutton()
	{
		txtbutton.click();
	}
	public boolean sucessfullogin()
	{
		try
		{
		return(cnfmsg.isDisplayed());
		}
		catch(Exception e)
		{
		return(false);
		}
	}
	

}
