package orangeHRM_framwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Admin_page extends Driver_Class
{
	////Xpath
	static By by_adminetab=By.xpath("//span[text()='Admin']");
	static By by_addbutton=By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
	//static By by_Userrole=By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]");
	////Webelemets
	public static WebElement ele_admintab()
	{
		return driver.findElement(by_adminetab);
	}
	
	public static WebElement addbutton_click()
	{
		return driver.findElement(by_addbutton);
	}
	////Actions
	
	public static void admin_tab()
	{
		ele_admintab().click();
	}
	public static void Click_addButton()
	{
		addbutton_click().click();
	}
}
