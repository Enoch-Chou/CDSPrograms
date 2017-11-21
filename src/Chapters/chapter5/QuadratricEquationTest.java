package Chapters.chapter5;

import java.util.Scanner;

public class QuadratricEquationTest {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter in the coefficients for a quadratric: ");
		double a = console.nextDouble();
		double b = console.nextDouble();
		double c = console.nextDouble();
		System.out.println("Equation: " + a + "x^2 + " + b + "x + " + c);
		QuadraticEquation test = new QuadraticEquation(a,b,c);
		if (test.hasSolution() == true) {
			System.out.println("Roots: " + test.getSolution1() + " and " + test.getSolution2());
		}
		else {
			System.out.println("Roots: no real roots");
		}
	}
}
