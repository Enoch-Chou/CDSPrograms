package Chapters.Semester1Review.Shirt;

import java.util.Scanner;

public class ShirtTest {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Testing the first constructor: ");
		System.out.print("Enter the collar size: ");
		int a = console.nextInt();
		System.out.print("Enter the sleeve length: ");
		int b = console.nextInt();
		Shirt hi = new Shirt(a,b);
		System.out.println("   collar size = " + hi.getCollarSize());
		System.out.println("   sleeve size = " + hi.getSleeveLength());
		System.out.println("   material = " + hi.getMaterial());
		System.out.println("");
		System.out.println("Testing the second constructor: ");
		System.out.print("Enter the collar size: ");
		int x = console.nextInt();
		System.out.print("Enter the sleeve length: ");
		int y = console.nextInt();
		System.out.print("Enter the sleeve material: ");
		String z = console.next();
		Shirt hi2 = new Shirt(x,y,z);
		System.out.println("   collar size = " + hi2.getCollarSize());
		System.out.println("   sleeve size = " + hi2.getSleeveLength());
		System.out.println("   material = " + hi2.getMaterial());
	}
}
