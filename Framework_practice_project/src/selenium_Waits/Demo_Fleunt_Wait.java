package selenium_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Demo_Fleunt_Wait extends Demo_cyclos_Based
{
	static By by_userName=By.xpath("//input[@id='input-email']");

	//webelement
	public static WebElement ele_userName()
	{

		//fleuntwait();
		return driver.findElement(by_userName);
	}
	//action
	public static void fleunt_wait() throws InterruptedException
	{

		ele_userName().click();
		ele_userName().sendKeys("demo");
	}
}
