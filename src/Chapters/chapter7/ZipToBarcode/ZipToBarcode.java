package Chapters.chapter7.ZipToBarcode;

import javax.swing.JOptionPane;

public class ZipToBarcode {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Please enter in your zipcode");
		BarCode hi = new BarCode(input);
		System.out.println("|" + hi.getCode() + "|");
	}
}
