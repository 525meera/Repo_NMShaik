package sel_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube_dotcom 
{
	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		By by_youtube_search=By.xpath("//input[@id='search']");
		WebElement ele_youtube_search=driver.findElement(by_youtube_search);
		ele_youtube_search.sendKeys("virat kohli lifestyle");
		
		Thread.sleep(3000);
		
		By by_youtube_search_Button=By.xpath("//button[@id='search-icon-legacy']");
		WebElement ele_youtube_search_Button=driver.findElement(by_youtube_search_Button);
		ele_youtube_search_Button.click();
		
		Thread.sleep(3000);
		
		By by_click_video_title=By.xpath("//h3[@id='video-title']");
		WebElement ele_click_video_title=driver.findElement(by_click_video_title);
		ele_click_video_title.click();
		
		Thread.sleep(3000);
		
		By by_Youtube_icon=By.xpath("//ytd-topbar-logo-renderer[@id='logo']//div[@class='style-scope ytd-topbar-logo-renderer']//yt-icon[@id='logo-icon']");
		WebElement ele_Youtube_icon=driver.findElement(by_Youtube_icon);
		ele_Youtube_icon.click();
		
		Thread.sleep(4000);
		
		By by_click_pre_order=By.xpath("//a[@aria-label='Pre Order']//div[@class='yt-spec-touch-feedback-shape__fill']");
		WebElement ele_click_pre_order=driver.findElement(by_click_pre_order);
		ele_click_pre_order.click();
		
		Thread.sleep(4000);
		
		//driver.quit();
		driver.close();
		
		
	}
}
