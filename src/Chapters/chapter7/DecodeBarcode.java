package Chapters.chapter7;

public class DecodeBarcode {
	public DecodeBarcode(String x) {
		barcode = x.substring(1,(x.length()-1));
	}
	public String getZip() {
		int i = 0;
		String zipcode = "";
		while (i < (barcode.length() - 5)) {
			DecodeDigit hi = new DecodeDigit(barcode.substring(i, i + 5));
			if (hi.getDigit().equals("-1")) {
				return "Error in barcode";
			}
			else {
				zipcode += hi.getDigit();
			}
			i = i + 5;
		}
		return zipcode;
	}
	private String barcode;
}
