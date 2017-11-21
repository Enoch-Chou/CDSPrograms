package Chapters.chapter5;

import java.util.Scanner;

public class CardTest {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter the card notation: ");
		String hi = console.nextLine();
		if (hi.length() == 2) {
		String x = hi.substring(0,1);
		String y = hi.substring(1);
		x = x.toUpperCase();
		y = y.toUpperCase();
		Card test = new Card(x,y);
		System.out.println(test.getDescription());
		}
		else {
		String x = hi.substring(0,2);
		String y = hi.substring(2);
		x = x.toUpperCase();
		y = y.toUpperCase();
		Card test = new Card(x,y);
		System.out.println(test.getDescription());
		}
	}
}
