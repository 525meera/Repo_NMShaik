package sel_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_Exercise_Login
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://automationexercise.com/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		/*By by_Home_Page=By.xpath("//a[@style='color: orange;']");
		WebElement ele_Home=driver.findElement(by_Home_Page);
		ele_Home.click();
		Thread.sleep(5000);
	
		By by_Poduct_Page=By.xpath("//i[@class='material-icons card_travel']");
		WebElement ele_Product_Page=driver.findElement(by_Poduct_Page);
		ele_Product_Page.click();
		Thread.sleep(5000);
		
		driver.navigate().back();
		Thread.sleep(5000);*/

		By by_User_Name=By.xpath("//input[@data-qa='login-email']");
		WebElement ele_UserName=driver.findElement(by_User_Name);
		ele_UserName.sendKeys("sonusallu143@gmail.com");
		
		Thread.sleep(3000);
		
		By by_User_Passward=By.xpath("//input[@data-qa='login-password']");
		WebElement ele_UserPasward=driver.findElement(by_User_Passward);
		ele_UserPasward.sendKeys("N@gul786");
		
		Thread.sleep(5000);
		
		By by_Login_button=By.xpath("//button[@data-qa='login-button']");
		WebElement ele_Login_Button=driver.findElement(by_Login_button);
		ele_Login_Button.click();
		
		Thread.sleep(5000);
		
		By by_View_Product=By.xpath("//a[@href='/product_details/1']");
		WebElement ele_View_Product=driver.findElement(by_View_Product);
		ele_View_Product.click();
		
		Thread.sleep(5000);
		
		By by_Click_Men=By.xpath("//a[@href='#Men']");
		WebElement ele_click_men=driver.findElement(by_Click_Men);
		ele_click_men.click();
		
		Thread.sleep(5000);
		
		By by_Jeans=By.xpath("//a[text()='Jeans ']");
		WebElement ele_Jeans=driver.findElement(by_Jeans);
		ele_Jeans.click();
		
		Thread.sleep(5000);
		
		By by_View_Product_page=By.xpath("//a[@href='/product_details/33']");
		WebElement ele_View_Product_page=driver.findElement(by_View_Product_page);
		ele_View_Product_page.click();
		
		Thread.sleep(5000);
		
		By by_Quantity=By.xpath("//input[@id='quantity']");
		WebElement ele_Quantity=driver.findElement(by_Quantity);
		ele_Quantity.clear();
		
		Thread.sleep(5000);
		
		ele_Quantity.sendKeys("2");
		
		Thread.sleep(5000);
		
		By by_add_Cart=By.xpath("//button[@class='btn btn-default cart']");
		WebElement ele_add_Cart=driver.findElement(by_add_Cart);
		ele_add_Cart.click();
		
		Thread.sleep(5000);
		
		By by_View_Cart=By.xpath("//u[text()='View Cart']");
		WebElement ele_view_Cart=driver.findElement(by_View_Cart);
		ele_view_Cart.click();
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		By by_Continue_Shopping=By.xpath("//button[text()='Continue Shopping']");
		WebElement ele_Continue_Shopping=driver.findElement(by_Continue_Shopping);
		ele_Continue_Shopping.click();
		
		Thread.sleep(5000);
		
		By by_your_name=By.xpath("//input[@id='name']");
		WebElement ele_your_name=driver.findElement(by_your_name);
		ele_your_name.sendKeys("NM Shaik");
		
		Thread.sleep(5000);
		
		By by_email_Address=By.xpath("//input[@id='email']");
		WebElement ele_Email_address=driver.findElement(by_email_Address);
		ele_Email_address.sendKeys("nmshaik@gmail.com");
		
		Thread.sleep(5000);
		
		By by_Review_Box=By.xpath("//textarea[@id='review']");
		WebElement ele_Review_Box=driver.findElement(by_Review_Box);
		ele_Review_Box.sendKeys("My Oder is succssfull");
		
		Thread.sleep(5000);
		
		By by_Oder_submit_button=By.xpath("//button[@id='button-review']");
		WebElement ele_Oder_submit_button=driver.findElement(by_Oder_submit_button);
		ele_Oder_submit_button.click();
		
		Thread.sleep(5000);
		
		By by_click_Cart=By.xpath("//i[@class='fa fa-shopping-cart']");
		WebElement ele_click_Cart=driver.findElement(by_click_Cart);
		ele_click_Cart.click();
		
		Thread.sleep(5000);
		
//		By by_cancel_cart=By.xpath("//a[@data-product-id='2']");
//		WebElement ele_cancel_cart=driver.findElement(by_cancel_cart);
//		ele_cancel_cart.click();
//		
		
		//driver.close();
		
		
	}
}
