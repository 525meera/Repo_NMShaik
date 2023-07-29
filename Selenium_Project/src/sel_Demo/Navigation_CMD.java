package sel_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_CMD 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		Thread.sleep(5000);

		driver.manage().window().maximize();
		Thread.sleep(5000);

		//Lunch WebSite
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		Thread.sleep(5000);

		//Click on the Img Link  using click() command    
		By by_imgClick = By.xpath("//img[@class='custom-logo']");
		WebElement ele_img_Click=driver.findElement(by_imgClick);
		ele_img_Click.click();
		Thread.sleep(5000);

		//Go Back To Home Page
		driver.navigate().back();//
		Thread.sleep(5000);

		//Go Back To Home Page
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		Thread.sleep(5000);

		//Go Back to Login Page
		driver.navigate().forward();
		Thread.sleep(5000);

		//Page Refresh
		driver.navigate().refresh();//Refresh the page
		Thread.sleep(5000);

		driver.close();
	}
}
