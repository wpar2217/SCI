package parallell;

import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void Testmethod() {
		System.out.println("Test1 >>> Testmethod >>" + Thread.currentThread().getId());
	}
	@Test
	public void Testmethod1() {
		System.out.println("Test1 >>> Testmethod1 >>" + Thread.currentThread().getId());
	}
	@Test
	public void Testmethod2() {
		System.out.println("Test1 >>> Testmethod2 >>" + Thread.currentThread().getId());
	}
	@Test
	public void Testmethod3() {
		System.out.println("Test1 >>> Testmethod3 >>" + Thread.currentThread().getId());
	}
	@Test
	public void Testmethod4() {
		System.out.println("Test1 >>> Testmethod4 >>" + Thread.currentThread().getId());
	}

}
