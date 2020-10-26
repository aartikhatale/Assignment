package org.qsp.testngDemo;

import org.testng.annotations.Test;

public class TestNgGroup {
	@Test(groups = "Functionl", dependsOnGroups = "Acceptance")
	public void tc1() {
		System.out.println("test 1");
	}

	@Test(groups = "Acceptance", dependsOnGroups = "Smoke")
	public void tc2() {
		System.out.println("test 2");
	}

	@Test(groups = "Smoke")
	public void tc3() {
		System.out.println("test 3");
	}

	@Test(groups = "Functional", dependsOnGroups = "Acceptance")
	public void tc4() {
		System.out.println("test 4");
	}

	@Test(groups = "Smoke")
	public void tc5() {
		System.out.println("test 5");
	}
}
