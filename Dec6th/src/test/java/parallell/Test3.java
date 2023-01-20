package parallell;

import org.testng.annotations.Test;

public class Test3 {
	@Test
	public void Testmethod9() {
			System.out.println("Test3 >>> Testmethod9 >>" + Thread.currentThread().getId());
	}
	@Test
	public void Testmethod10() {
			System.out.println("Test3 >>> Testmethod10 >>" + Thread.currentThread().getId());
	}
}