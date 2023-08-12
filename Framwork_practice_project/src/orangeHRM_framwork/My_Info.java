package orangeHRM_framwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class My_Info extends Driver_Class
{
	////xpaths
	static By by_MyInfo=By.xpath("//span[text()='My Info']");
	static By by_FristName=By.xpath("//input[@name='firstName']");
	static By by_MiddleName=By.xpath("//input[@name='middleName']");
	static By by_lastName=By.xpath("//input[@name='lastName']");
	static By by_Clicksave=By.xpath("(//button[@type='submit'])[1]");
	//webelements
	public static WebElement ele_Myinfo()
	{
		return driver.findElement(by_MyInfo);
	}
	public static WebElement ele_FristName()
	{
		return driver.findElement(by_FristName);
	}
	public static WebElement ele_middleName()
	{
		return driver.findElement(by_MiddleName);
	}
	public static WebElement ele_lastName()
	{
		return driver.findElement(by_lastName);
	}
	public static WebElement ele_clickSave()
	{
		return driver.findElement(by_Clicksave);
	}

	//Action
	public static void MyInfo()
	{
		ele_Myinfo().click();
	}
	public static void FristName(String fristName)
	{
		ele_FristName().click();
		ele_FristName().sendKeys(fristName);
	}
	public static void MiddleName(String MiddleName)
	{

		ele_middleName().click();
		ele_middleName().sendKeys(MiddleName);
	}
	public static void LastName(String LastName)
	{

		ele_lastName().click();
		ele_lastName().sendKeys(LastName);
	}
	public static void Save_Button()
	{
		ele_clickSave().click();
	}
}
