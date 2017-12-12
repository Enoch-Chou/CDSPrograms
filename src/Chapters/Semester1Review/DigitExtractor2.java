package Chapters.Semester1Review;

public class DigitExtractor2 {
	public DigitExtractor2(String x) {
		original = x;
	}
	public String reverse() {
		for (int i = original.length()-1; i > -1; i--) {
			reversed += " " + original.substring(i,i+1);
		}
		return reversed;
	}
	private String original;
	private String reversed;
}
