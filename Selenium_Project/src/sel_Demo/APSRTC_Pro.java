package sel_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class APSRTC_Pro 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.apsrtconline.in/oprs-web/guest/home.do?h=1");
		driver.manage().window().maximize();
		Thread.sleep(3000);


		By by_From=By.xpath("//input[@id='fromPlaceName']");
		WebElement ele_FromAddress=driver.findElement(by_From);
		ele_FromAddress.sendKeys("Hyderabad");

		Thread.sleep(4000);

		By by_Hyd_=By .xpath("//li[@class='HYDERABAD ui-menu-item']");
		ele_FromAddress=driver.findElement(by_Hyd_);
		ele_FromAddress.click();

		Thread.sleep(4000);

		By by_To=By.xpath("//input[@id='toPlaceName']");
		WebElement ele_To_Address=driver.findElement(by_To);
		ele_To_Address.sendKeys("Khammam");

		Thread.sleep(4000);

		By by_Khamma=By .xpath("//li[@class='KHAMMAM ui-menu-item']");
		ele_To_Address=driver.findElement(by_Khamma);
		ele_To_Address.click();

		Thread.sleep(4000);

		By by_Depart_On=By.xpath("//input[@id='txtJourneyDate']");
		WebElement ele_by_Depart_On=driver.findElement(by_Depart_On);
		ele_by_Depart_On.click();

		Thread.sleep(4000);


		By by_select_date=By.xpath("(//a[text()='31'])[1]");
		WebElement ele_Select_date=driver.findElement(by_select_date);
		ele_Select_date.isSelected();
		ele_Select_date.click();
		Thread.sleep(3000);

		By by_check_Availabilty=By.xpath("//input[@id='searchBtn']");
		WebElement ele_check_Availabilty=driver.findElement(by_check_Availabilty);
		ele_check_Availabilty.click();




	}
}
