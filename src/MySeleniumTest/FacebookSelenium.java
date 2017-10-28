package MySeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\310266393\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver drivers = new ChromeDriver();
		drivers.get("https://www.facebook.com/");
		drivers.manage().window().maximize();
		
		drivers.findElement(By.xpath("//*[@id='email']")).sendKeys("delhipinkwight@yahoo.co.in");
		drivers.findElement(By.xpath("//*[@id='pass']")).sendKeys("Ganesh@0123456");
		
		//drivers.findElement(By.xpath("//input[@id='pass']")).submit();
		
		drivers.findElement(By.xpath("//*[@id='u_0_1']")).sendKeys("Rajesh");
		drivers.findElement(By.xpath("//*[@id='u_0_3']")).sendKeys("Kumar");
		
		drivers.findElement(By.xpath("//*[@id='u_0_5']")).sendKeys("9739174443");
		
		drivers.findElement(By.xpath("//*[@id='u_0_8']")).sendKeys("9739174443");
		
		drivers.findElement(By.xpath("//*[@id='u_0_a']")).sendKeys("Rajesh@1");
		
		Select selectDay = new Select(drivers.findElement(By.xpath("//*[@id='day']")));
		selectDay.selectByValue("30");
		
		Select selectMonth = new Select(drivers.findElement(By.xpath("//*[@id='month']")));
		selectMonth.selectByIndex(1);
		
		Select selectYear = new Select(drivers.findElement(By.xpath("//*[@id='year']")));
		selectYear.selectByVisibleText("1988");
		
		
		/*drivers.findElement(By.xpath("//*[@id='day']")).sendKeys("30");
		drivers.findElement(By.xpath("//*[@id='month']")).sendKeys("Jan");
		drivers.findElement(By.xpath("//*[@id='year']")).sendKeys("1988");*/
		
		drivers.findElement(By.xpath("//*[@id='u_0_i']")).click();
		drivers.findElement(By.xpath("//*[@id='u_0_e']")).click();
		
		Thread.sleep(5000);
		((JavascriptExecutor)drivers).executeScript("scroll(0,400)");
		
		drivers.navigate().back();
		
	}

}
