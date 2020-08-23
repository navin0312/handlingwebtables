package webtable;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PrintHeaders
{

	public WebDriver driver;
	@Test
	public void headers()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("file:///C:/Users/user/Desktop/WebTable.html");
	    List<WebElement> headers=driver.findElements(By.xpath("//th"));
	    System.out.println(headers.size());
	    for(int i=0;i<headers.size();i++)
	    {
	    	System.out.println(headers.get(i).getText());
	    }
	}
}
