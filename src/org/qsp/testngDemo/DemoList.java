package org.qsp.testngDemo;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(org.qsp.testngDemo.DemoListners.class)
public class DemoList {
	@Test
	public void m1() {
		System.out.println("hi m");
	}

	@Test
	public void m2() {
		System.out.println("hi m2");
		Assert.fail();
	}

}
