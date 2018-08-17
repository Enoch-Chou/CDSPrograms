package Chapters.Semester1Review.CompoundInterest;

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
		System.out.printf("%-35s%-3d%9s%s%n", "The amount of the investment after ", years , "years is ", hi.getAmount());
		hi.incrementYear();
		System.out.printf("%-35s%-3d%9s%s%n", "The amount of the investment after ", years + 1, "years is ", hi.getAmount());
		hi.incrementYear();
		System.out.printf("%-35s%-3d%9s%s%n", "The amount of the investment after ", years + 2, "years is ", hi.getAmount());
		hi.incrementYear();
		System.out.printf("%-35s%-3d%9s%s%n", "The amount of the investment after ", years + 3, "years is ", hi.getAmount());

	}
}
