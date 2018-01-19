package Chapters.chapter6;

import javax.swing.JOptionPane;

public class InBetween {
	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog("Enter in an integer please");
		String input2 = JOptionPane.showInputDialog("Enter in another integer please");
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		int difference = Math.abs(num1-num2);
		if (num1 == num2) {
			System.out.print("There are no integers between these two numbers");
		}
		else {
			for (int i = 1; i < difference; i++) {
				System.out.print(Math.min(num1, num2) + i + " ");
			}
		}
	
	}
}
