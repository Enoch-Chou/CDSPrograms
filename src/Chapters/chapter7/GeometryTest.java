package Chapters.chapter7;

import javax.swing.JOptionPane;

public class GeometryTest {
		public static void main(String[] args) {
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

	}
}
	
