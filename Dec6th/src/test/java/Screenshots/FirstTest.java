package Screenshots;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ITest.class)

public class FirstTest extends Browser {
	@Test(testName = "Launch")
	public void Launch() throws Exception {
	a.get("https://innojc.kredily.com/company/dashboard/");
	}
	@Test(testName = "Login")
	public void Login() throws Exception {
	Thread.sleep(1000);
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
