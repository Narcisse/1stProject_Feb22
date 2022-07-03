package variousConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		init();
		loginTest();
		teardown();
		
	
		init();
		negloginTest();
		teardown();
	}
		public static void init() {
		//	user.dir
		//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\kanar\\QA_Selenium\\crm\\driver\\chromedriver.exe");
		//	System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		//	System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		}
		public static void loginTest() throws InterruptedException {
		
		
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");	
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		}
		public static void negloginTest() throws InterruptedException {
			
			
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc1234");	
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
			}
		
		public static void teardown() {
		driver.close();
		}
	}



