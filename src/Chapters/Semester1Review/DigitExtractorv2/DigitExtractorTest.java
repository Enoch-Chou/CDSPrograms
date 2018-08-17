package Chapters.Semester1Review.DigitExtractorv2;

import javax.swing.JOptionPane;

public class DigitExtractorTest {
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Enter in a 5-digit number that you would like to reverse");
		DigitExtractor hi = new DigitExtractor(s);
		System.out.printf("%-24s%5s%n","Entered 5-digit number: ",s);
		System.out.printf("%-14s%10s%n","Reverse order:", hi.reverse());
	}
}
