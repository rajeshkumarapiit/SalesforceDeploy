package MySeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("Hello");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\310266393\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		
		driver.get("https://test.salesforce.com");
		driver.findElement(By.cssSelector("#username")).sendKeys("rajesh.kumar_3@philipshomecarepmm--devfix..com");
		driver.findElement(By.cssSelector("#password")).sendKeys("Ganesh@123");
		driver.findElement(By.cssSelector("#password")).submit();
		
		System.out.println(driver.getPageSource());
		//driver.findElement(By.cssSelector("#Login")).click();
		Thread.sleep(20000);
		//driver.findElement(By.xpath("//a[@title='Patients Tab - Selected']")).click();
		driver.findElement(By.xpath("//a[contains(.,'Patients')]")).click();
		Thread.sleep(20000);
		
		driver.findElement(By.xpath("//input[@title='New']")).click();
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//select[@name='p3']")).sendKeys("PMM Patient");
		driver.findElement(By.xpath("//input[@title='Continue']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@title='Save']")).click();
		
		//fill all information about patient
		driver.findElement(By.xpath("//select[@title='Salutation']")).sendKeys("Mr.");//
		driver.findElement(By.xpath("//input[@id='name_firstacc2']")).sendKeys("Swati");
		driver.findElement(By.xpath("//input[@id='name_lastacc2']")).sendKeys("Bansal");
		//driver.findElement(By.xpath("//label[text()='']/following::")).sendKeys("Female");
		//driver.findElement(By.xpath("//label[contains(.,'Gender')]/td[@class='dataCol col02']/select")).sendKeys("Female");
		driver.findElement(By.xpath("//select[@id='00N2800000Hxbeg']")).sendKeys("Female");
		driver.findElement(By.xpath("//input[@name='CF00NR0000001hOVL']")).sendKeys("sam");
		driver.findElement(By.xpath("//input[@name='00NR0000001qbqM']")).sendKeys("30");
		driver.findElement(By.xpath("//input[@name='CF00NR0000001hOVN']")).sendKeys("000000");
		driver.findElement(By.xpath("//input[@name='00NR0000001hOV6']")).sendKeys("Keshav");
		driver.findElement(By.xpath("//input[@name='00NR0000001hOV7']")).sendKeys("Brother");
		driver.findElement(By.xpath("//input[@name='00NR0000001hOV5']")).sendKeys("9739174443");
		driver.findElement(By.xpath("//input[@name='00NR0000001hOVH']")).sendKeys("105");
		driver.findElement(By.xpath("//input[@name='PersonMobilePhone']")).sendKeys("9739174443");
		driver.findElement(By.xpath("//input[@name='PersonHomePhone']")).sendKeys("9739174443");
		driver.findElement(By.xpath("//textarea[@name='acc17street']")).sendKeys("B Naranyanpura");
		driver.findElement(By.xpath("//input[@name='acc17city']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//input[@name='acc17state']")).sendKeys("Karnataka");
		driver.findElement(By.xpath("//input[@name='acc17zip']")).sendKeys("560016");
		driver.findElement(By.xpath("//input[@name='acc17country']")).sendKeys("India");
		driver.findElement(By.xpath("//input[@name='PersonEmail']")).sendKeys("rajeshkumarapiit@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='00NR0000001qfXJ']")).sendKeys("105");
		driver.findElement(By.xpath("//textarea[@name='acc18street']")).sendKeys("B Naranyanpura");
		driver.findElement(By.xpath("//input[@name='acc18city']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//input[@name='acc18state']")).sendKeys("Karnataka");
		driver.findElement(By.xpath("//input[@name='acc18zip']")).sendKeys("560016");
		driver.findElement(By.xpath("//input[@name='acc18country']")).sendKeys("India");
		
		driver.findElement(By.xpath("//input[@title='Save']")).click();
		
		Thread.sleep(30000);
		//driver.findElement(By.xpath("//input[@name='onboard_patient']")).click();
		
		
		
		//driver.findElement(By.xpath("//a[@title='Physician Lookup (New Window)']")).click();
		//Thread.sleep(3000);
		/*driver.findElement(By.xpath("//input[@id='lksrch']")).sendKeys("raj");
		driver.findElement(By.xpath("//input[@name='go']")).click();
		driver.findElement(By.xpath("//tr[@class='dataRow even first']/th/a")).click();*/
		
		
		
		
		
		
		
		//driver.findElement(By.xpath("//[@id='01rR00000009zNG_Tab']/a")).click();
		
		
		Thread.sleep(10000);
		
		//driver.close();
		
		
	}

}
