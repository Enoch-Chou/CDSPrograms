package Chapters.chapter6.FactorGenerator;

import javax.swing.JOptionPane;

public class FactorGeneratorTest {
	public static void main(String[] args) {
		boolean flag = true;
		while (flag) {
			String input = JOptionPane.showInputDialog("Please enter a digit to prime factorize, press cancel to cancel the program");
			if (input == null) {
				flag = false;
				System.out.println("Congratulations, your program has ended");
			}
			else {
			int num = Integer.parseInt(input);
			FactorGenerator hi = new FactorGenerator(num);
			System.out.print("Prime Factorization of " + input + ": ");
			while (hi.hasNextFactor()) {
				hi.nextFactor();
				}
			System.out.println();
			}
		}
	}
}
