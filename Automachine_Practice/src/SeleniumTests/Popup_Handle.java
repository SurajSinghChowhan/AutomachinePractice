package SeleniumTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_Handle {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suraj\\Downloads\\newneee\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.get("https://www.rediff.com/");
		driver.findElement(By.id("subnews_icon")).click();
		driver.findElement(By.xpath("//input[@class= 'subscribe_btn_in']")).click();
		Alert Popup = driver.switchTo().alert();
		
		if(Popup.getText().contains("Please enter a valid email"))
		{
			System.out.println("Pop is correct");
		}
		else {
			System.out.println("Wait for the correct pop up");
		}
		Popup.accept();
	}

}
