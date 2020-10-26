package org.qsp.testngDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnotationDemo {
	@BeforeSuite
	public void bs() {
		System.out.println("Before suite");
	}

	@BeforeTest
	public void bt() {
		System.out.println("Before test");
	}

	@BeforeClass
	public void bc() {
		System.out.println("Before class");
	}

	@BeforeMethod
	public void bm() {
		System.out.println("Before method");
	}

	@Test(dependsOnMethods = "tc3")
	public void tc1() {
		System.out.println("test 1");
	}

	@Test
	public void tc2() {
		System.out.println("test 2");
	}

	@Test
	public void tc3() {
		System.out.println("test 3");
	}

	@AfterMethod
	public void am() {
		System.out.println("After method");
	}

	@AfterClass
	public void ac() {
		System.out.println("After class");
	}

	@AfterTest
	public void at() {
		System.out.println("After test");
	}

	@AfterSuite
	public void as() {
		System.out.println("After Suite");
	}

}
