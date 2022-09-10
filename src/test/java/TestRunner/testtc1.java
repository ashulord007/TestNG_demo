package TestRunner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testtc1 {
	long start2 = 0l;
	@BeforeSuite
	public void suitebefore() {
		
		start2 = System.currentTimeMillis();
	}
	@BeforeMethod
	public void beforemethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\muska\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("-before-method-passed-");
		driver.close();
	}
	@Test
	public void tc1() {
		System.out.println("tc1");
	}
	@Test
	public void tc2() {
		System.out.println("tc2");
	}
	@AfterSuite
	public void suiteafter() {
		long end2 = System.currentTimeMillis();
		System.out.println("Time Taken : "+(end2-start2)/1000+"sec");
	}
}
