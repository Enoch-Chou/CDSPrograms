package Chapters.Semester1Review.DigitExtractor;

public class DigitExtractor {
	public DigitExtractor(int x) {
		real = x;
	}
	public int nextDigit() {
		digit = real % 10;
		real = real / 10;
		return digit;
	}
	private int real;
	private int digit;
}
