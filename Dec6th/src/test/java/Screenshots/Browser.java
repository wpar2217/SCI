package Screenshots;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Browser {
	
	public static WebDriver a;
	public static String datetimeformat;
	@BeforeTest
	public void Start() {
	a = new ChromeDriver();
	a.manage().window().maximize();
	}
	@AfterTest
    public void Stop() {
	a.quit();
	}
	public void CaptureScreenshot(String fileName) {
	if(datetimeformat == null) {
	LocalDateTime myDateObj = LocalDateTime.now();
	DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH mm ss");
	datetimeformat = myDateObj.format(myFormatObj);
	}
	TakesScreenshot takesScreenshot = (TakesScreenshot) a;
	File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
	File destFile = new File("C:\\Users\\ADMIN\\OneDrive - Innojc Technologies Pvt. Ltd\\Pictures\\Screenshots\\"+datetimeformat+'/'+fileName);
	try {
	FileUtils.copyFile(sourceFile, destFile);
	} catch (IOException e) {
	e.printStackTrace();
	}
	System.out.println("Screenshot saved successfully");
	}
}