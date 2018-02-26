package Chapters.chapter7.ZipToBarcode;

public class Digit {
	public Digit(char x) {
		digit = x;
	}
	public String getCode() {
		switch (digit) {
		case '1': return ":::||";
		case '2': return "::|:|";
		case '3': return "::||:"; 
		case '4': return ":|::|"; 
		case '5': return ":|:|:"; 
		case '6': return ":||::"; 
		case '7': return "|:::|"; 
		case '8': return "|::|:"; 
		case '9': return "|:|::"; 
		default: return "||:::";
		}
	}
	private char digit;
}
