package practise;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {
	@Test
	@Parameters("myName")
	public void paramterTest(String myName) {
		System.out.println("Parameterized value is: " + myName);
	}

}
