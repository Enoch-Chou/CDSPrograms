package Chapters.chapter7.ZipToBarcode;

public class BarCode {
	public BarCode(String x) {
		zipcode = x;
	}
	public String getCode() {
		String code = "";
		int digitSum = 0;
		int i = 0;
		while (i < zipcode.length()) {
		Digit hi = new Digit(zipcode.charAt(i));
		code += hi.getCode();
		int digit = Integer.parseInt(zipcode.substring(i, i+1));
		digitSum += digit;
		i++;
		}
		String remainder = "" + (10 - digitSum % 10);
		char correction = remainder.charAt(0);
		Digit hi2 = new Digit(correction);
		code += hi2.getCode();
		return code;
	}
	private String zipcode;
}
