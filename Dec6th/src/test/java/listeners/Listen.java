package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ItestListeners.class)

public class Listen {
	public static WebDriver a;
	@BeforeTest
	public void Apple() {
		a = new ChromeDriver();
	}
	
	@Test(testName = "Launch")
	public void Launch() throws Exception {
	a.get("https://innojc.kredily.com/company/dashboard/");
	}
	@Test(testName = "Login")
	public void Login() throws Exception {
	Thread.sleep(5000);
	a.findElement(By.id("signInFormEmailAddress")).sendKeys("8096291806");
	Thread.sleep(1000);
	a.findElement(By.id("signInFormPassword")).sendKeys("Partha@4434");
	}
	@Test(testName = "Sign_In")
	public void Sign_In() throws Exception {
	Thread.sleep(1000);
	a.findElement(By.id("signinSubmitBtn")).click();
	}
}
