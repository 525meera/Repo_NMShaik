package sel_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amzazon_Add_cart 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/b?node=8872558031");
		driver.manage().window().maximize();

		Thread.sleep(3000);

		By by_search_text_box=By.xpath("//input[@id='twotabsearchtextbox']");
		WebElement ele_search_textBox=driver.findElement(by_search_text_box);
		ele_search_textBox.sendKeys("VIVO V20");

		
		Thread.sleep(3000);
		By by_search_button_click=By.xpath("//input[@id='nav-search-submit-button']");
		WebElement ele_search_button_click=driver.findElement(by_search_button_click);
		ele_search_button_click.click();
		
		Thread.sleep(3000);
		
		By by_select_mobile=By.xpath("(//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2'])[1]");
		WebElement ele_select_mobile=driver.findElement(by_select_mobile);
		ele_select_mobile.click();
		
		Thread.sleep(3000);
		
//		By by_add_cart_button=By.xpath("//div[@id='buyNow']");
//		WebElement ele_add_cart_button=driver.findElement(by_add_cart_button);
//		ele_add_cart_button.click();
		
		
		

	}
}
