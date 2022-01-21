package SeleniumTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled_Disabled_Displayed {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suraj\\Downloads\\newneee\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("http://Google.com");
		driver.navigate().to("http://facebook.com");
		System.out.println(driver.findElement(By.cssSelector("button[name='login']")).isDisplayed());
		//This method can be used to verify the element is present in page or not
		System.out.println(driver.findElement(By.cssSelector("button[name='login']")).isEnabled());
		//This method can be used to verify the mentioned element is enabled or disabled - usually used for buttons
		System.out.println(driver.findElement(By.cssSelector("button[name='login']")).isSelected());
		//This method can be used to verify the mentioned element is selected or not
		
		driver.quit();
	}

}
