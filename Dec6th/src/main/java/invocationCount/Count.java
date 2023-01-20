package invocationCount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Count {
	@Test(invocationCount = 4, threadPoolSize = 2)
	public void TestCount() throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	driver.findElement(By.name("username")).sendKeys("partha wudaru");
	driver.findElement(By.name("password")).sendKeys("Partha@4434");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='_ab8w  _ab94 _ab99 _ab9f _ab9m _ab9p  _abak _abb8 _abbq _abb- _abcm']")).click();
	driver.quit();
	}
}