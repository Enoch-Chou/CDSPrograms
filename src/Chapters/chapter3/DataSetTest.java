package Chapters.chapter3;
import java.util.Scanner;

public class DataSetTest {
	public static void main(String args[]) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter four integers");
		int quantity1 = console.nextInt();
		int quantity2 = console.nextInt();
		int quantity3 = console.nextInt();
		int quantity4 = console.nextInt();
		DataSet numbers = new DataSet(quantity1,quantity2,quantity3,quantity4);
		numbers.addValue();
		System.out.println("The largest integer is " + numbers.getLargest());
		System.out.println("The smallest integer is " + numbers.getSmallest());
	}
}
