package Chapters.Semester1Review;

import javax.swing.JOptionPane;

public class DigitExtractorTest {
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Enter a 5-digit number that you want to reverse");
		int x = Integer.parseInt(s);
		System.out.printf("%-24s%5d%n","Entered 5-digit number: ",x);
		DigitExtractor hi = new DigitExtractor(x);
		System.out.printf("%-14s%2d%2d%2d%2d%2d", "Reverse order:", hi.nextDigit(),hi.nextDigit(),hi.nextDigit(),hi.nextDigit(),hi.nextDigit());
	}
}
