package sel_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Book_My_Show 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.bookmyshow.com/");
		driver.manage().window().maximize();

		Thread.sleep(3000);

		By by_Popular_City=By.xpath("//img[@alt='HYD']");
		WebElement ele_Popular_City=driver.findElement(by_Popular_City);
		ele_Popular_City.click();

		Thread.sleep(3000);


/*		By by_write_text_box=By.xpath("//span[text()='Search for Movies, Events, Plays, Sports and Activities']");
		WebElement ele_write_text_box=driver.findElement(by_write_text_box);
		ele_write_text_box.sendKeys("bro");

		Thread.sleep(3000);

		ele_write_text_box.isSelected();

		Thread.sleep(3000);

		By by_select_Movies=By.xpath("//strong[text()='BRO']");
		WebElement ele_select_Movies=driver.findElement(by_select_Movies);
		ele_select_Movies.click();


		Thread.sleep(3000);

		By by_book_tickets=By.xpath("(//span[starts-with(text(),'Book ')])[1]");
		WebElement ele_book_tickets=driver.findElement(by_book_tickets);
		ele_book_tickets.click();*/



	}
}
