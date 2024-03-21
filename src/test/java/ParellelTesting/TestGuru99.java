package ParellelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class TestGuru99 {
	WebDriver driver;
	@Test(priority=1)
	public void ExecuteSessionOne()
	{
		driver=new EdgeDriver();
		driver.get("https://demo.guru99.com");
		driver.manage().window().maximize();
	}
	@Test(priority=2)
	public void ExecuteSessionTwo()
	{
		System.setProperty("C:\\Program Files\\Java\\chromedriver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://google.com");

	}
	@Test(priority=3)
	public void ExecuteSessionThree()
	{
		
		driver=new FirefoxDriver();
		driver.get("https://demo.guru99.com");
		
	}

	@Test(priority=4)
	public void ExecuteSessionFour()
	{
		driver=new InternetExplorerDriver();
		driver.get("https://demo.guru99.com");
		
	}
}
