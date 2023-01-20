package practise;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Substract {
	@Test
	@Parameters({"a","b"})
	public void add(int a, int b) {
		int substract = a - b;
		System.out.println("Substraction of two numbers:" + substract);
	}

}
