package orangeHRM_framwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PIM_Page extends Driver_Class
{

	////xpaths
	static By by_pim=By.xpath("//span[text()='PIM']");
	static By by_addButton=By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
	static By by_emp_FristName=By.xpath("//input[@name='firstName']");
	static By by_emp_MiddleName=By.xpath("//input[@name='middleName']");
	static By by_emp_LastName=By.xpath("//input[@name='lastName']");
	static By by_emp_ID=By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters']//input[@class='oxd-input oxd-input--active']");
	static By by_emp_save_button=By.xpath("//button[@type='submit']");

	////webelements
	public static WebElement ele_pim_page()
	{
		return driver.findElement(by_pim);
	}

	public static WebElement ele_addButton()
	{
		return driver.findElement(by_addButton);
	}

	public static WebElement ele_emp_FristName()
	{
		return driver.findElement(by_emp_FristName);
	}
	public static WebElement ele_emp_MiddleName()
	{
		return driver.findElement(by_emp_MiddleName);
	}
	public static WebElement ele_emp_LastName()
	{
		return driver.findElement(by_emp_LastName);
	}
	public static WebElement ele_emp_Id()
	{
		return driver.findElement(by_emp_ID);
	}
	public static WebElement ele_emp_saveButton()
	{
		return driver.findElement(by_emp_save_button);
	}
	
	///Action
	public static void PIM_page()
	{
		ele_pim_page().click();
	}
	public static void AddButton()
	{
		ele_addButton().click();
	}
	public static void FristName(String fristName)
	{
		ele_emp_FristName().click();
		ele_emp_FristName().sendKeys(fristName);
	}
	public static void MiddleName(String middleName)
	{
		ele_emp_MiddleName().click();
		ele_emp_MiddleName().sendKeys(middleName);
	}
	public static void LastName(String lastName)
	{
		ele_emp_LastName().click();
		ele_emp_LastName().sendKeys(lastName);
	}
	public static void Emp_Id(String EmpID) 
	{
		
		
		ele_emp_Id().clear();
		//ele_emp_Id().click();
		ele_emp_Id().sendKeys(EmpID);
	}
	public static void SaveButton()
	{
		ele_emp_saveButton().click();
	}
}
