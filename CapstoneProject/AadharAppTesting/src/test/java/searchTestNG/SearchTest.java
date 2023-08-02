package searchTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class SearchTest {
	WebDriver driver;

	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	public void closeBrowser() {

		driver.quit();

	}

	@SuppressWarnings("deprecation")
	public void performTest() throws InterruptedException {
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("charger");

		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.findElement(By.id("nav-search-bar-form")).submit();
        driver.findElement(By.id("a-autoid-0-announce")).click();
        driver.findElement(By.id("s-result-sort-select_2")).click();
        List<WebElement> resultsList = driver.findElements(By.xpath(".//span[@class='a-size-medium a-color-base a-text-normal']"));
        int size = resultsList.size();
        System.out.println("Size of list = " + size);
        resultsList.get(2).click();
		System.out.println("The title of the page is :" + driver.getTitle());
		//Add to cart
		 driver.findElement(By.cssSelector("#add-to-cart-button")).click();

	}

	@Test
	public void searchTest() {
		SearchTest obj = new SearchTest();
		try {
			obj.launchBrowser();
			obj.performTest();
			//obj.closeBrowser();
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
