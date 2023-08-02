package registrationTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class RegistrationTest {
	WebDriver driver;

	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	public void closeBrowser() {

		driver.quit();

	}

	public void performTest() throws InterruptedException {
		
		driver.get(
				"http://localhost:4200/login");
		System.out.println("AadharApp Opened in Browser");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Azad@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Azad@123");
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Chandrashekhar");
		driver.findElement(By.cssSelector(".form-group:nth-child(5) > .ng-untouched")).sendKeys("Azad Colony");
		driver.findElement(By.cssSelector(".form-group:nth-child(6) > .ng-untouched")).sendKeys("9089761234");
		driver.findElement(By.xpath("//div[7]/input")).sendKeys("23/06/1934");
		driver.findElement(By.xpath("(//input[@name='typeOfUser'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Sign up']")).click();
		
		System.out.println("Clicked On SignUp Button");

	}

	@Test
	public void registrationTest() {
		RegistrationTest obj = new RegistrationTest();

		try {
			obj.launchBrowser();
			obj.performTest();
			obj.closeBrowser();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Testing is Going to start..");

	}

	@AfterTest
	public void afterTest() {
		System.out.println("Testing is Done!");
	}

}
