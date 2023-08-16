package pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Call 
{
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Selenium_jarfiles\\chromedriver-win32\\chromedriver-win32");
		WebDriver driver=new ChromeDriver();
	}
}
