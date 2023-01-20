package Screenshots;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITest extends Browser implements ITestListener{

	public void onTestSuccess(ITestResult result) {
		CaptureScreenshot(result.getMethod().getMethodName()+".jpg");
	}
}
