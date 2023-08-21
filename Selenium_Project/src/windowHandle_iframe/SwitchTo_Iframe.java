package windowHandle_iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SwitchTo_Iframe 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\ChromeExe\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("a077aa5e");//switching the frame by ID
		System.out.println("********We are switch to the iframe*******");
		
		By by_frame_img=By.xpath("//img[@src='Jmeter720.png']");
		Thread.sleep(3000);
		WebElement ele_frame_img_click=driver.findElement(by_frame_img);
		ele_frame_img_click.click();
		
		System.out.println("We are done ");
		
		driver.close();
		
	}
}
