package Chapters.chapter5;

import java.util.Scanner;

public class UnitConverterTest {
	public static void main(String[] args) {
		Scanner file = new Scanner(System.in);
		System.out.print("Convert from: ");
		String x = file.nextLine();
		System.out.print("Convert to: ");
		String y = file.next();
		System.out.print("Value: ");
		double z = file.nextDouble();
		UnitConverter hi = new UnitConverter(x);
		UnitConverter hi2 = new UnitConverter(y);
		System.out.println(z + " " + x + " = " + hi2.fromMetric(hi.toMetric(z)) + " " + y);
	}
}
