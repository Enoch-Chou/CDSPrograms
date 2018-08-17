package Chapters.chapter3.Pair;
import javax.swing.JOptionPane;

public class PairTest {
	public static void main(String args[]) {
		String first = JOptionPane.showInputDialog("Enter an integer");
		String second = JOptionPane.showInputDialog("Enter another integer");
		Pair program = new Pair(Integer.parseInt(first),Integer.parseInt(second));
		System.out.println("The sum is " + program.getSum());
		System.out.println("The difference is " + program.getDifference());
		System.out.println("The product is " + program.getProduct());
		System.out.println("The average is " + program.getAverage());
		System.out.println("The distance is " + program.getDistance());
		System.out.println("The maximum of these two numbers is " + program.getMaximum());
		System.out.println("The minimum of these two numbers is " + program.getMinimum());
		System.exit(0);
	}
}
