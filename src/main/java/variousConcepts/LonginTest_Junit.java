package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LonginTest_Junit {

	WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}

	@Before
	public void init() {
		System.out.println("Init Method");
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies(); // needed if there is any update
		driver.get("https://techfios.com/billing/?ng=admin/");
	}

	@Test
	public void loginTest() throws InterruptedException {
		System.out.println("Login Test");
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
	}

	@Test
	public void negLoginTest() throws InterruptedException {
		System.out.println("Neg Login Test");
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123324");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
	}

	@After
	public void tearDown() {
		System.out.println("Tear down");

		driver.close();
		driver.quit();
	}

}
