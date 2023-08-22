package windowHandle_iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_switchTo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\ChromeExe\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		/*	By by_Frame_1=By.xpath("//frame[@src='frame_1.html']");
		WebElement ele_frame=driver.findElement(by_Frame_1);

		driver.switchTo().frame(ele_frame);

		By by_text_frame1=By.xpath("//input[@name='mytext1']");
		WebElement ele_text_frame1=driver.findElement(by_text_frame1);
		ele_text_frame1.sendKeys("NM Shaik");

		driver.switchTo().defaultContent();

		By by_frame2=By.xpath("//frame[@src='frame_2.html']");
		WebElement ele_frame2=driver.findElement(by_frame2);

		driver.switchTo().frame(ele_frame2);

		By by_text_frame2=By.xpath("//input[@name='mytext2']");
		WebElement ele_text_frame2=driver.findElement(by_text_frame2);
		ele_text_frame2.sendKeys("Shaik");

		driver.switchTo().defaultContent();*/

		By by_frame3=By.xpath("//frame[@src='frame_3.html']");
		WebElement ele_frame3=driver.findElement(by_frame3);

		driver.switchTo().frame(ele_frame3);

		By by_text_frame3=By.xpath("//input[@name='mytext3']");
		WebElement ele_text_frame3=driver.findElement(by_text_frame3);
		ele_text_frame3.sendKeys("Saleem");
		
		Thread.sleep(3000);
		
		
		By by_ClickCheckbox=By.xpath("//span[text()='Web Testing']");
		
		WebElement ele_ClickCheckbox =	driver.findElement(by_ClickCheckbox);
		
		ele_ClickCheckbox.click();


//		driver.switchTo().defaultContent();
//
//		By by_frame4=By.xpath("//frame[@src='frame_4.html']");
//		WebElement ele_frame4=driver.findElement(by_frame4);
//
//		driver.switchTo().frame(ele_frame4);
//
//		By by_text_frame4=By.xpath("//input[@name='mytext4']");
//		WebElement ele_text_frame4=driver.findElement(by_text_frame4);
//		ele_text_frame4.sendKeys("Nagul");
//
//		driver.close();

	}
}
