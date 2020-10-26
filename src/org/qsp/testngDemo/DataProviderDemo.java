package org.qsp.testngDemo;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	@DataProvider
	public String[][] demo() {
		String[][] arr = new String[3][2];
		arr[0][0] = "Aarti";
		arr[0][1] = "Khatale";
		arr[1][0] = "Vikram";
		arr[1][1] = "Tidake";
		arr[2][0] = "Roshan";
		arr[2][1] = "Khatale";
		return arr;
	}

	@Test(dataProvider = "demo")
	public void tc3(String name, String Lastname) {
		Reporter.log(name + " " + Lastname, true);

	}
}
