package MySeleniumTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteProcessBuilder {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\310266393\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		
		driver.get("https://login.salesforce.com");
		driver.findElement(By.cssSelector("#username")).sendKeys("rajeshkumar.apiit@gmail.com.appone");
		driver.findElement(By.cssSelector("#password")).sendKeys("Ganesh+123");
		driver.findElement(By.cssSelector("#Login")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//a[@title='Setup']")).click();
		
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@name='setupSearch']")).sendKeys("process builder");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='ProcessAutomation_font']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//td[@title='First Process B1']/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@headers='action']/a")).click();
		Thread.sleep(2000);
		String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
		String subWindowHandler = null; 

		Set<String> handles = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler); // switch to popup window
		driver.findElement(By.xpath("//button[@type='button']")).click();                                            // perform operations on popup

		driver.switchTo().window(parentWindowHandler);  // switch back to parent window
		
		

	}

}
