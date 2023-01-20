package com.psr.groupTest;

import org.testng.annotations.Test;
@Test(groups = {"all"})
public class NewTest {

  @Test(groups = {"smoke"})
  public void test1() {
	  System.out.println("test1");
  }
  @Test(groups = {"smoke", "functional"})
  public void test2() {
	  System.out.println("test2");
  }
  @Test(groups = {"functional", "regression"})
  public void test3() {
	  System.out.println("test3");
  }
}