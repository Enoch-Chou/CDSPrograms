package Chapters.chapter7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class GeometryTest {
		public static void main(String[] args) throws FileNotFoundException {
			String radius = JOptionPane.showInputDialog("Enter in the length of the radius");
			double r = Double.parseDouble(radius);
			String height = JOptionPane.showInputDialog("Enter in the length of height");
			double h = Double.parseDouble(height);
			System.out.println("The radius entered is: " + r);
			System.out.println("The height entered is: " + h);
			Geometry hi = new Geometry();
			System.out.printf("%s%5.2f%n", "The volume of the sphere is: ", hi.SphereVolume(r));
			System.out.printf("%s%5.2f%n", "The surface area of the sphere is: ", hi.sphereSurface(r));
			System.out.printf("%s%5.2f%n", "The volume of the cylinder is: ", hi.cylinderVolume(r, h));
			System.out.printf("%s%5.2f%n", "The surface area of the cylinder is: ", hi.cylinderSurface(r, h));
			System.out.printf("%s%5.2f%n", "The volume of a cone is: ", hi.coneVolume(r, h));
			System.out.printf("%s%5.2f%n", "The surface area of a cone is: ", hi.coneSurface(r, h));
			FileReader reader = new FileReader("src/Chapters/chapter7/points");
			Scanner file = new Scanner(reader);
			int i = 0;
			while (file.hasNextLine()) {
				String input = file.nextLine();
				StringTokenizer tokenizer = new StringTokenizer(input);
				i++;
				while (tokenizer.hasMoreTokens()) {
					double x1 = Double.parseDouble(tokenizer.nextToken());
					double y1 = Double.parseDouble(tokenizer.nextToken());
					double x2 = Double.parseDouble(tokenizer.nextToken());
					double y2 = Double.parseDouble(tokenizer.nextToken());
					System.out.printf("%s%2.2f%s%2.2f%s%2.2f%s%2.2f%s%2.2f%n", "The distance between (",x1, ",", y1, ") and (", x2, ",", y2, ") = ",hi.pointDistance(x1, y1, x2, y2));
				}
			}
	}
}
	
