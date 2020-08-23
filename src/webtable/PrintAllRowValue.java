package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PrintAllRowValue
{
 public WebDriver driver;
 @Test
 public void headers()
 {
	    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("file:///C:/Users/user/Desktop/WebTable.html");
	    List<WebElement> rowvalue=driver.findElements(By.xpath("//tr"));
	    System.out.println(rowvalue.size());
	    for(int i=1;i<rowvalue.size();i++)
	    {
	    	System.out.println(rowvalue.get(i).getText());
	    }
 }
}
