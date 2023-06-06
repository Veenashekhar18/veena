package generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Framework
{
	public WebDriver driver;
	@BeforeMethod
	public void openapl()
	{
	System.setProperty(chrome_key,chrome_value);
	driver=new ChromeDriver();
	driver.get(baseurl);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();

	}
	@AfterMethod
	public void closeapln(ITestResult res) throws IOException 
	{
		if(ITestResult.FAILURE==res.getStatus())
		{
			Generic_screenshot.getphoto(driver);
		}
		driver.close();
	}
}

