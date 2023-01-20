package practise;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multiply {
	@Test
	@Parameters({"c","d"})
	public void add(@Optional int a, int b) {
		int multiply = a * b;
		System.out.println("Multiplication of two numbers:" + multiply);
	}

}
