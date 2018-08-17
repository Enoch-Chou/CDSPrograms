package Chapters.chapter3.Converter;
import javax.swing.JOptionPane;

public class ConverterTest {
	public static void main(String args[]) {
		String first = JOptionPane.showInputDialog("Enter the amount of meters you want to convert");
		Converter calculator = new Converter(Double.parseDouble(first));
		double miles = calculator.convertToMiles();
		double inches = calculator.convertToInches();
		double feet = calculator.convertToFeet();
		System.out.println(first + " meters is the same as:");
		System.out.printf("%-9.3f%5s%n",feet,"feet" );
		System.out.printf("%-7.3f%7s%n",inches,"inches");
		System.out.printf("%-5.3f%6s%n",miles,"miles");
	}
}
