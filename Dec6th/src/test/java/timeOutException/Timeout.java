package timeOutException;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Timeout {
	
	@Test(expectedExceptions = NoSuchElementException.class)
	public void Test() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com/");
	driver.quit();
	}
}