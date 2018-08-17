package Chapters.chapter6.EvenEntryLoop;

import javax.swing.JOptionPane;

public class EvenEntryLoop {
	public static void main(String[] args) {
		boolean done = true;
		while (done) {
			String input = JOptionPane.showInputDialog("Please Enter in an even number, type in 999 to stop");
			if (Integer.parseInt(input) % 2 == 0) {
				System.out.println("Good Job!");
			}
			else if (Integer.parseInt(input) == 999) {
				System.out.println("Your program has ended");
				done = false;
			}
			else {
				System.out.println("That's not an even number! Please try again");
			}
		}
	}
}
