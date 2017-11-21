//Enoch Chou,Mr. Heiser, Honors Computer Programming Period 6
import static java.lang.Math.pow;

public class SodaCan { //constructor
	public SodaCan(double radius, double height) {
		r = radius;
		h = height;
	}
	public double getSurfaceArea() { //surface area
		return (2 * pi * (Math.pow(r, 2)) + (2 * pi * r * h));
	}
	public double getVolume() { //volume
		return pi * Math.pow(r, 2) * h;
	}
	private double pi = 3.14159;
	private double r;
	private double h;
}
