package Chapters.chapter5.LeapYear;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LeapYearTest {
	public static void main(String[] args) throws FileNotFoundException {
		FileReader reader = new FileReader("src/Chapters/chapter5/LeapYear/Dates");
		
		Scanner file = new Scanner(reader);
		int a = file.nextInt();
		int b = file.nextInt();
		int c = file.nextInt();
		int d = file.nextInt();
		int e = file.nextInt();
		
		LeapYear hi = new LeapYear(a);
		LeapYear hi2 = new LeapYear(b);
		LeapYear hi3 = new LeapYear(c);
		LeapYear hi4 = new LeapYear(d);
		LeapYear hi5 = new LeapYear(e);
		
		System.out.println("The year 1500" + hi.getResults(hi.isLeapYear()));
		System.out.println("The year 1900" + hi2.getResults(hi2.isLeapYear()));
		System.out.println("The year 2000" + hi3.getResults(hi3.isLeapYear()));
		System.out.println("The year 2003" + hi4.getResults(hi4.isLeapYear()));
		System.out.println("The year 2004" + hi5.getResults(hi5.isLeapYear()));
	}
}
