package Chapters.chapter5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ThreeNumbersTest {
	public static void main(String[] args) throws FileNotFoundException {
		FileReader reader = new FileReader("src/numbers");
		Scanner file = new Scanner(reader);
		double num1 = file.nextDouble();
		double num2 = file.nextDouble();
		double num3 = file.nextDouble();
		double num4 = file.nextDouble();
		double num5 = file.nextDouble();
		double num6 = file.nextDouble();
		double num7 = file.nextDouble();
		double num8 = file.nextDouble();
		double num9 = file.nextDouble();
		
		ThreeNumbers hi = new ThreeNumbers(num1,num2,num3);
		ThreeNumbers hi2 = new ThreeNumbers(num4,num5,num6);
		ThreeNumbers hi3 = new ThreeNumbers(num7,num8,num9);
		System.out.printf("%20s%6.1f%6.1f%6.1f%n","First set of inputs:", num1,num2,num3);
		System.out.printf("%14s%6.1f%6.1f%6.1f%n%n", "Sorted inputs:", hi.getSmallest(),hi.getMiddle(),hi.getLargest());
		System.out.printf("%21s%6.1f%6.1f%6.1f%n", "Second set of inputs:", num4,num5,num6);
		System.out.printf("%14s%6.1f%6.1f%6.1f%n%n", "Sorted inputs:", hi2.getSmallest(),hi2.getMiddle(),hi2.getLargest());
		System.out.printf("%20s%6.1f%6.1f%6.1f%n","Third set of inputs:", num7,num8,num9);
		System.out.printf("%14s%6.1f%6.1f%6.1f%n%n", "Sorted inputs:", hi3.getSmallest(),hi3.getMiddle(),hi3.getLargest());
		
	}
}
