package Chapters.chapter6.EverySum;

import javax.swing.JOptionPane;

public class EverySum {
	public static void main(String[] args) {
		int sum = 0;
		String input = JOptionPane.showInputDialog("Please enter an integer between 1 and 50 to find the sum of all numbers from 1 to the entered integer");
		int num = Integer.parseInt(input);
		for (int i = 0; i <= num; i++) {
			sum += i;
		}
		System.out.println("The sum of all numbers from 1 to " + input + " is: " + sum);
	}
}
