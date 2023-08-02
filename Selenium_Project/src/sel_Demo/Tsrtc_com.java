package sel_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tsrtc_com 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
				
		By by_search_text=By.xpath("//input[@id='search2']");
		WebElement ele_search_text=driver.findElement(by_search_text);
		ele_search_text.sendKeys("javaScript t");
		
		Thread.sleep(6000);
		
		By by_select_cource=By.xpath("//span[text()='JavaScript T']");
		WebElement ele_select_cource=driver.findElement(by_select_cource);
	
		ele_select_cource.isSelected();
		
		Thread.sleep(3000);
		
		ele_select_cource.click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		By by_search_text1=By.xpath("//input[@id='search2']");
		WebElement ele_search_text1=driver.findElement(by_search_text1);
		ele_search_text1.sendKeys("html tutorial");
		
		Thread.sleep(3000);
		
		By by_select_cource1=By.xpath("//span[text()='HTML Tutorial']");
		WebElement ele_select_cource1=driver.findElement(by_select_cource1);
		ele_select_cource1.isSelected();
		
		Thread.sleep(3000);
		
		ele_select_cource1.click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		By by_bootcamp=By.xpath("//div[@class='w3-right w3-white']//a[@title='W3Schools Bootcamps']");
		WebElement ele_bootcamp=driver.findElement(by_bootcamp);
		ele_bootcamp.click();
		
		Thread.sleep(3000);
		
		By by_Home_IMG=By.xpath("//div[@id='pagetop']//a[@title='Home']");
		WebElement ele_Home_IMG=driver.findElement(by_Home_IMG);
		ele_Home_IMG.click();
		
		Thread.sleep(3000);
		
		By by_Not_Sure=By.xpath("//a[text()='Not Sure Where To Begin?']");
		WebElement ele_Not_Sure=driver.findElement(by_Not_Sure);
		ele_Not_Sure.click();
		
		Thread.sleep(3000);
		
		By by_Home_IMG2=By.xpath("//div[@id='pagetop']//a[@title='Home']");
		WebElement ele_Home_IMG2=driver.findElement(by_Home_IMG2);
		ele_Home_IMG2.click();
		
		Thread.sleep(3000);
		
		By by_Login_button=By.xpath("//a[@id='w3loginbtn']");
		WebElement ele_Login_button=driver.findElement(by_Login_button);
		ele_Login_button.click();
		
		Thread.sleep(3000);
		
		By by_Home_IMG3=By.xpath("//a[@class='TopBarMenuLegacy2_logo__08SSu']");
		WebElement ele_Home_IMG3=driver.findElement(by_Home_IMG3);
		ele_Home_IMG3.click();
		
	}
}
