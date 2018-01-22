package Chapters.chapter6;

import javax.swing.JOptionPane;

public class FactorGeneratorTest {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Please enter a digit to prime factorize");
		int num = Integer.parseInt(input);
		FactorGenerator hi = new FactorGenerator(num);
		System.out.print("Prime Factorization of " + input + ": ");
		while (hi.hasNextFactor()) {
			hi.nextFactor();
		}
	}
}
