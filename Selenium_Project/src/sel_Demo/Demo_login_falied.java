package sel_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_login_falied 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);


		By by_username=By.xpath("//input[@id='username']");
		WebElement ele_UserName=driver.findElement(by_username);
		ele_UserName.sendKeys("incorrectUser");
		Thread.sleep(3000);


		By by_passward=By.xpath("//input[@id='password']");
		WebElement ele_passward=driver.findElement(by_passward);
		ele_passward.sendKeys("Password123");
		Thread.sleep(3000);

		By by_Login_Button=By.xpath("//button[@id='submit']");
		WebElement ele_Login_Button=driver.findElement(by_Login_Button);
		ele_Login_Button.click();
		Thread.sleep(3000);

//		By by_Logout_Button=By.xpath("//a[text()='Log out']");
//		WebElement ele_Logout_Button=driver.findElement(by_Logout_Button);
//		ele_Logout_Button.click();
//		Thread.sleep(3000);

		driver.close();


	}
}
