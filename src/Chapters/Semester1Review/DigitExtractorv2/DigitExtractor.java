package Chapters.Semester1Review.DigitExtractorv2;

public class DigitExtractor {
	public DigitExtractor(String x) {
		original = x;
	}
	public String reverse() {
		for (int i = original.length()-1; i > -1; i--) {
			reversed += " " + original.substring(i,i+1);
		}
		return reversed;
	}
	private String original;
	private String reversed = "";
}
