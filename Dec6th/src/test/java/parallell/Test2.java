package parallell;

import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void Testmethod5() {
			System.out.println("Test2 >>> Testmethod5 >>" + Thread.currentThread().getId());
	}
	@Test
	public void Testmethod6() {
			System.out.println("Test2 >>> Testmethod6 >>" + Thread.currentThread().getId());
	}
	@Test
	public void Testmethod7() {
			System.out.println("Test2 >>> Testmethod7 >>" + Thread.currentThread().getId());
	}
	@Test
	public void Testmethod8() {
			System.out.println("Test2 >>> Testmethod8 >>" + Thread.currentThread().getId());
	}
}
