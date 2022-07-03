package HomeWork;

import java.util.Random;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JustATry {
	@Test
	public void addAndVerifyDeposit() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://techfios.com/billing/?ng=admin/");
	
	driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
	
	driver.findElement(By.id("password")).sendKeys("abc123");
	
	driver.findElement(By.name("login")).click();
	driver.findElement(By.linkText("Bank & Cash")).click();
	// driver.get("http://demo.guru99.com/test/newtours/register.php");
	 WebElement element = driver.findElement(By.name("Bank & Cash"));
	// Select select = new Select(element);
	// select.selectByValue("ANGOLA");

	//Thread.sleep(3000);
	
	//WebElement element = driver.findElement(By.name("Add New Account"));
	Select select = new Select(element);
	select.selectByIndex(8);
	//driver.findElement(By.xpath("//select[@id='account']/option[@value='Sarker']")).click();
	Random rnd = new Random();
	int randomNumber = rnd.nextInt(999);
	String description = "Shopping"+randomNumber;
	String amount = String.valueOf(randomNumber);
	//driver.findElement(By.name("description")).sendKeys(description);
	driver.findElement(By.name("amount")).sendKeys(amount);
	driver.findElement(By.id("submit")).click();
	//Thread.sleep(5000);
}
}