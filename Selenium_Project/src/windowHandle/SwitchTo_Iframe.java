package windowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class SwitchTo_Iframe 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\ChromeExe\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		By by_Iframe=By.tagName("iframe");

		WebElement ele_Iframe=driver.findElement(by_Iframe);
		ele_Iframe.Size();
		for(int i=0;i<Size();i++)
		{
			driver.switchTo().frame(i);
		}
	}
}
