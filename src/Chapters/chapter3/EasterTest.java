package Chapters.chapter3;
import javax.swing.JOptionPane;
public class EasterTest {
	public static void main(String args[]) {
		String year1 = JOptionPane.showInputDialog("Please Enter a year"); //prompts for year
		String year2 = JOptionPane.showInputDialog("Please enter another year");
		Easter hi = new Easter(Integer.parseInt(year1));
		Easter hi2 = new Easter(Integer.parseInt(year2));
		hi.stuffNoOneNeedsToSee();
		hi2.stuffNoOneNeedsToSee();
		System.out.printf("%-17s%4d%n", "Easter Sunday for ", Integer.parseInt(year1)); //prints out easter sunday year
		System.out.printf("%9s%6s%n", "month: ", hi.getEasterSundayMonth()); //prints out month
		System.out.printf("%8s%2d%n", "date: ", hi.getEasterSundayDay()); //prints out day
		System.out.println("");
		System.out.printf("%-17s%4d%n", "Easter Sunday for ", Integer.parseInt(year2)); //prints out easter sunday year
		System.out.printf("%9s%6s%n", "month: ", hi2.getEasterSundayMonth()); //prints out month
		System.out.printf("%8s%3d%n", "date: ", hi2.getEasterSundayDay()); //prints out day
		
	}
}
