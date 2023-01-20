package integrationExcel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProvi {
	@Test(dataProvider = "getData", dataProviderClass = ReadDataFrExcel.class)
	public void Data(String username,String password) throws InterruptedException {
		WebDriver a = new ChromeDriver();
		a.manage().window().maximize();
		a.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		a.findElement(By.name("username")).sendKeys(username);
		a.findElement(By.name("password")).sendKeys(password);
		a.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(5000);
		a.quit();
		}

}
