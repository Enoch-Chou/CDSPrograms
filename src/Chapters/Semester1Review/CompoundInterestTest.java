package Chapters.Semester1Review;

import java.util.Scanner;

public class CompoundInterestTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the principal: ");
		double principal = scanner.nextDouble();
		System.out.print("Enter the rate: ");
		int rate = scanner.nextInt();
		System.out.print("Enter the time in years: ");
		int years = scanner.nextInt();
		CompoundInterest hi = new CompoundInterest(principal,rate,years);
		System.out.println("The amount of the investment after 10 years is " + hi.getAmount());
		hi.incrementYear();
		System.out.println("The amount of the investment after 11 years is " + hi.getAmount());
		hi.incrementYear();
		System.out.println("The amount of the investment after 12 years is " + hi.getAmount());
		hi.incrementYear();
		System.out.println("The amount of the investment after 13 years is " + hi.getAmount());

	}
}
