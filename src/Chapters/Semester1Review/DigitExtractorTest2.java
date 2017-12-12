package Chapters.Semester1Review;

import javax.swing.JOptionPane;

public class DigitExtractorTest2 {
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Enter in a 5-digit number that you would like to reverse");
		DigitExtractor2 hi = new DigitExtractor2(s);
		System.out.printf("%-24s%5s%n","Entered 5-digit number: ",s);
		System.out.printf("%-14s%10s%n","Reverse order:", hi.reverse());
	}
}
