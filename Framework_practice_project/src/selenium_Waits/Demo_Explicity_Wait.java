package selenium_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Demo_Explicity_Wait extends Demo_cyclos_Based
{
	//static By by_userName=By.xpath("//input[@type='text']");
	
	static By by_userName=By.xpath("//input[@id='input-email']");

	//webelement
	public static WebElement ele_userName()
	{
		return driver.findElement(by_userName);
	}
	//Action
		public static void expliciti_wait() 
		{
			//explicitiwait(ele_userName(), 20);
			//wait.until(ExpectedConditions.visibilityOfAllElements(ele_userName()));
			
			ele_userName().click();
			ele_userName().sendKeys("demo");
		}	
}
