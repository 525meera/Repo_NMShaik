package qafox_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Software_page extends Based_class_Qafox
{
	////xpathas
	public static By by_saftware=By.xpath("//a[text()='Software']");
	public static By by_continues= By.xpath("//a[text()='Continue']");

	////webelements
	static WebElement ele_saftware()
	{
		return driver.findElement(by_saftware);
	}

	static WebElement ele_continues()
	{
		return driver.findElement(by_continues);
	}

	////Actions
	public static void saftware()
	{
		ele_saftware().click();
	}
	public static void continues()
	{
		ele_continues().click();
	}
}
