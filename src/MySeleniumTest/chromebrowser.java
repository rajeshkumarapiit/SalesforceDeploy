package MySeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowser {

 public static void main(String[] args) throws InterruptedException {
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\310266393\\Downloads\\chromedriver_win32\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  driver.get("http://www.google.com");
 
  if (driver.findElement(By.xpath("//input[@name='q']")).isEnabled()) {
   System.out.println("Google search text box Is enabled.");
   driver.findElement(By.xpath("//input[@name='q']")).sendKeys("WebDriver Test successful.");
   driver.findElement(By.xpath("//button[@name='btnG']")).click();
   Thread.sleep(5000);
   System.out.println("Google search completed.");
  } else {
   System.out.println("Google search test box Is Not enabled.");

  }
  WebElement element = driver.findElement(By.xpath("//input[@name='q']"));
  element.sendKeys("WebDriver Test successful.");
  
  Thread.sleep(5000);
  //driver.close();
 }
}
