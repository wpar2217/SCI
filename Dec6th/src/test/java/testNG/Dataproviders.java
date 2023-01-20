package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

	public class Dataproviders {
		@Test(dataProvider = "Data1")
		public void Data(String username,String password) throws InterruptedException {
			WebDriver a = new ChromeDriver();
			a.manage().window().maximize();
			a.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(1000);
			a.findElement(By.name("username")).sendKeys(username);
			a.findElement(By.name("password")).sendKeys(password);
			a.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
			//Assert.assertTrue(a.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).isDisplayed());
			Thread.sleep(5000);
			a.quit();
			}
        @DataProvider(parallel = true)
		public Object[][] Data1() {
			Object[][] q = new Object[4][2];
			q[0][0] = "Admin";
			q[0][1] = "admin123";
			
			q[1][0] = "Admin1";
			q[1][1] = "Venkat123";
			
			q[2][0] = "Partha";
			q[2][1] = "Partha123";
			
			q[3][0] = "Admin";
			q[3][1] = "test123";
			return q;
			}
}
