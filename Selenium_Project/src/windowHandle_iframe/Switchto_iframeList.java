package windowHandle_iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchto_iframeList 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\ChromeExe\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();

		//		By by_totalFrame=By.tagName("iframe");
		//		WebElement ele_total=driver.findElement(by_totalFrame);
		//		Dimension size=	ele_total.getSize();
		//		System.out.println(size);


		//driver.switchTo().frame("moneyiframe");// name and id
		//driver.switchTo().frame(0);// index frame



		By by_tagname=By.xpath("//iframe[@id='moneyiframe']");

		WebElement ele_tagname=driver.findElement(by_tagname);

		driver.switchTo().frame(ele_tagname);// webelement iframe

		By by_NSE_Frame=By.xpath("//span[@id='nseindex']");
		WebElement ele_nse=	driver.findElement(by_NSE_Frame);
		System.out.println(ele_nse.getText());

		Thread.sleep(3000);

		driver.switchTo().defaultContent();// Focusing on parent HTML page (getting out of the frame)

		By by_sportstabclick=By.xpath("//a[text()='SPORTS']");
		WebElement ele_sportstabclick=driver.findElement(by_sportstabclick);
		ele_sportstabclick.click();

		Thread.sleep(3000);
		driver.close();

	}
}
