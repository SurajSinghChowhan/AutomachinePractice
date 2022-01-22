package SeleniumTests;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserPopupHandler {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suraj\\Downloads\\newneee\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("http://google.com");
		driver.navigate().to("https://www.rrc.texas.gov/resource-center/research/gis-viewer/gis-popup-blocker-test/#");
		driver.findElement(By.linkText("RUN POPUP TEST")).click();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator <String> names = windows.iterator();
		String ParentWindow = names.next();
		System.out.println(ParentWindow);
		
		String Child = names.next();
		System.out.println(Child);
		
		driver.switchTo().window(Child);
		driver.manage().window().maximize();
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.switchTo().window(ParentWindow);
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.quit();
		
		
	}

}
