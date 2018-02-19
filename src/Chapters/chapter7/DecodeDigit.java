package Chapters.chapter7;

public class DecodeDigit {
	public DecodeDigit(String x) {
		barcode = x;
	}
	public String getDigit() {
		switch (barcode) {
		case "||:::": return "0";
		case ":::||": return "1";
		case "::|:|": return "2";
		case "::||:": return "3";
		case ":|::|": return "4";
		case ":|:|:": return "5";
		case ":||::": return "6";
		case "|:::|": return "7";
		case "|::|:": return "8";
		case "|:|::": return "9";
		default: return "-1";
		}
	}
	private String barcode;
}
