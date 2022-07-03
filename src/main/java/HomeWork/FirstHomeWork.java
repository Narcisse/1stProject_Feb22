package HomeWork;

import java.awt.Label;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstHomeWork {

	WebDriver driver;
	
	@Before
	public void init() {
		System.out.println("Init Method");
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://techfios.com/billing/?ng=admin/");
	}
	
	@Test
	public void loginTest() throws InterruptedException {
		System.out.println("Login Test");
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Bank & Cash")).click();
		driver.findElement(By.partialLinkText("New Account")).click();
		driver.findElement(By.id("account")).sendKeys("Savings Accounts");
		driver.findElement(By.id("description")).sendKeys("Saving");
		driver.findElement(By.name("balance")).sendKeys("$ 2000");
		driver.findElement(By.name("account_number")).sendKeys("239482727722");
		driver.findElement(By.id("contact_person")).sendKeys("K K");
		driver.findElement(By.name("contact_phone")).sendKeys("81827363");
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button")).click();
		
	
		Thread.sleep(2000);
	}
	
	
	}
	
	//@After
	//public void tearDown() {
	//	System.out.println("Tear down"); 
		
	//	driver.close();
	//	driver.quit();
	//}



