package Chapters.Semester1Review;

import javax.swing.JOptionPane;

public class RectangleTest {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("Enter the length of the Rectangle");
		int length = Integer.parseInt(a);
		String b = JOptionPane.showInputDialog("Enter the width of the Rectangle");
		int width = Integer.parseInt(b);
		Rectangle hi = new Rectangle(length,width);
		System.out.println("Entered values: " + length + " and " + width);
		System.out.println("");
		System.out.println("The area is " + hi.getArea());
		System.out.println("The perimeter is " + hi.getPerimeter());
		System.out.printf("The length of a diagonal is %1.2f", hi.getDiagonal());
	}
}
