package Chapters.chapter3.CircumferenceAndVolume;
import javax.swing.JOptionPane;

public class CircumferenceAndVolumeTest {
	public static void main(String args[]) {
		String radius = JOptionPane.showInputDialog("Please enter a radius for the circle calculations");
		CircumferenceAndVolume Circle = new CircumferenceAndVolume(Double.parseDouble(radius));
		System.out.printf("%-22s%4.3f%n", "The area of the circle:", Circle.getArea());
		System.out.printf("%-31s%4.3f%n", "The circumference of the circle:", Circle.getCircumference());
		String radius2 = JOptionPane.showInputDialog("Please enter in another radius for the sphere calculations");
		CircumferenceAndVolume Sphere = new CircumferenceAndVolume(Double.parseDouble(radius2));
		System.out.printf("%-29s%4.3f%n", "The Volume of the sphere is:", Sphere.getVolume());
		System.out.printf("%-35s%4.3f%n", "The Surface Area of the sphere is:", Sphere.getSurfaceArea());
		
	}
}
