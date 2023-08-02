package loginTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class LoginTest {
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
		Thread.sleep(2000);
		driver.get("http://localhost:4200/login");
		driver.findElement(By.cssSelector(".form-group:nth-child(1) > .ng-untouched")).sendKeys("Azad@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Azad@123");
		driver.findElement(By.cssSelector(".ng-untouched:nth-child(4)")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".btn-success")).click();

		System.out.println("Clicked On Login Button");

	}

	@Test
	public void loginTest() {

		LoginTest obj = new LoginTest();
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
