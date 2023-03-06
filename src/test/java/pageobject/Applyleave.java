package pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Applyleave 
{
	public WebDriver driver;
	public Applyleave(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//body/nav[@class='navbar navbar-expand-md bg-dark navbar-dark']/div[@id='collapsibleNavbar']/ul[@class='navbar-nav']/li[1]/a[1]")
	WebElement txtleavereg;
	@FindBy(xpath="//a[text()='Apply Leave']")
	WebElement txtapplyleave;
	@FindBy(xpath="//input[@id='leave-from_date']")
	WebElement txtleavefrmdt;
	@FindBy(xpath="//input[@id='leave-to_date']")
	WebElement txtleavetodt;
	@FindBy(xpath="//select[@id='leave-type']")
	WebElement txtleavety;
	@FindBy(xpath="//input[@id='leave-reason']")
	WebElement txtleaveres;
	@FindBy(xpath="//input[@id='leave-alt_mobile_number']")
	WebElement txtaltermbnum;
	@FindBy(xpath="//textarea[@id='leave-address']")
	WebElement txtleaveadd;
	@FindBy(xpath="//div[@class='form-group col-md-4']//button")
	WebElement clickapplyleave;
	
	public void setleavereg()
	{
		txtleavereg.click();
	}
	public void setapplyleave()
	{
		txtapplyleave.click();
	}
	public void setleavefrmdt(String fromdate)
	{
		txtleavefrmdt.sendKeys(fromdate);
	}
	public void setleavetodt(String todate)
	{
		txtleavetodt.sendKeys(todate);
	}
	public void setleavetype(String option)
	{
		Select dropdown=new Select(txtleavety);
		dropdown.selectByVisibleText(option);
		
	}
	public void setleaveres(String leavereason)
	{
		txtleaveres.sendKeys(leavereason);
	}
	public void setalternum(String altrmbnum)
	{
		txtaltermbnum.sendKeys(altrmbnum);
	}
	public void setleaveadd(String address)
	{
		txtleaveadd.sendKeys(address);
	}
	public void setleaveapply() 
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", clickapplyleave);
	}

}
