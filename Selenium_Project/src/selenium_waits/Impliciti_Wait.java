package selenium_waits;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Impliciti_Wait 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\ChromeExe\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Thread.sleep(3000);
		String expected_Title="OrangeHRM";
		String aftual_Title="";

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		//get the actual value of the title
		aftual_Title = driver.getTitle();
		//System.out.println(aftual_Title);

		//compare the actual title with the expected title
		if (aftual_Title.equals(expected_Title))
		{
			System.out.println( "Test Passed");
		}
		else 
		{
			System.out.println( "Test Failed" );
		}

		driver.close();
	}	
}
