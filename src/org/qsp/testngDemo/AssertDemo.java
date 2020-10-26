package org.qsp.testngDemo;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {
	@Test
	public void assertion() {
		String actualTitle = "Login";
		String expectedTitle = "Login";
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("String done");
		List l1 = new ArrayList();
		l1.add(5);
		l1.add("Abc");
		l1.add(false);
		List l2 = new ArrayList();
		l2.add(5);
		l2.add("Abc");
		l2.add(false);
		Assert.assertEquals(l1, l2);
		System.out.println("list done");
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(true, false);
		sa.assertAll();
		System.out.println("done");

	}

}
