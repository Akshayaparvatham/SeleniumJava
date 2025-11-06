package testNGconcepts;

import org.testng.annotations.*;

public class TestNGannotations {
	@Test
public void test1() {
	System.out.println("test1");
}
	@Test
	public void test2() {
		System.out.println("test2");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("beforetest");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("aftertest");
	}
	@BeforeMethod
	public void BeforeMethod () {
		System.out.println("BeforeMethod");
	}
	@AfterMethod
	public void AfterMethod() {
		System.out.println("AfterMethod");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("BeforeClass");
	}
	@AfterClass
	public void AfterClass () {
		System.out.println("AfterClass");
	}
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("BeforeSuite");
	}
	@AfterSuite
	public void AfterSuite() {
		System.out.println("AfterSuite");
	}
	
}
