package Chapters.chapter7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class BarcodeToZip {
	public static void main(String[] args) throws FileNotFoundException {
		FileReader reader = new FileReader("src/Chapters/chapter7/Barcode");
		Scanner file = new Scanner(reader);
		while (file.hasNextLine()) {
			String input = file.nextLine();
			DecodeBarcode hi = new DecodeBarcode(input);
			System.out.printf("%s%s%n%s%s%n%n", "Barcode: ", input, "ZIP: ", hi.getZip());
		}
	}
}
