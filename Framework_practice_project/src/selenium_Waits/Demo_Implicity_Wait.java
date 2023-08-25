package selenium_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Demo_Implicity_Wait extends Demo_cyclos_Based
{
	
	static By by_userName=By.xpath("//input[@id='input-email']");

	//webelement
	public static WebElement ele_userName()
	{
		implicitywait();
		
		return driver.findElement(by_userName);
	}
	//Action
	public static void enterUserName()
	{
	
		ele_userName().sendKeys("demo");;
	}

}
