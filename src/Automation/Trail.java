package Automation;

import java.util.Scanner;
import java.util.StringJoiner;

public class Trail {

	public static void main(String[] args) {
		Scanner sa = new Scanner(System.in);
		System.out.println("Enteer");
		String s = sa.nextLine();
		StringJoiner joiner = new StringJoiner("");
		String[] s1 = s.split(" ");
		String[] a = new String[s1.length];
		for (int i = 0; i < s1.length; i++) {
			String s2 = s1[i].substring(1).toLowerCase();
			String s3 = s1[i].substring(0, 1).toUpperCase();
			String name1 = s3 + s2 + " ";
			a[i] = name1;
		}
		for (int i = 0; i < a.length; i++) {
			joiner.add(a[i]);
		}
		String main = joiner.toString().trim();
		System.out.print(main);

	}

}
