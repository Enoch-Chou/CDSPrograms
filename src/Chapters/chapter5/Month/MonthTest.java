package Chapters.chapter5.Month;

import java.util.Scanner;

public class MonthTest {
	public static void main(String[] args) {
	Scanner file = new Scanner(System.in);
	System.out.print("Enter the month number: ");
	int month = file.nextInt();
	Month hi = new Month(month);
	if (hi.getDays() != -1) {
		System.out.println("There are " + hi.getDays() + " days");
	}
	else {
		System.out.println("Bad Input");
	}
	}
}
