package Chapters.chapter5.StringComparer;

import java.util.Scanner;

public class StringComparerTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter 4 strings: ");
		String a = scanner.next();
		String b = scanner.next();
		String c = scanner.next();
		String d = scanner.next();
		StringComparer hi = new StringComparer(a,b,c,d);
		System.out.println("");
		System.out.println("The lexicographic minimum is " + hi.getMinString());
		System.out.println("The lexicographic maximum is " + hi.getMaxString());
	}
}
