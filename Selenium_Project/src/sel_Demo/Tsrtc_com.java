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
	}
}
