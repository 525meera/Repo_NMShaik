package orangeHRM_framwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Performance_Page extends Driver_Class
{
	////Xpaths
	static By by_Performance=By.xpath("//span[text()='Performance']");
	
	///WebElements
	public static WebElement ele_Performance()
	{
		return driver.findElement(by_Performance);
	}
	///Actions
	public static void Performance()
	{
		ele_Performance().click();
	}

}
