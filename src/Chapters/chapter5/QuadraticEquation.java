package Chapters.chapter5;


public class QuadraticEquation {
	public QuadraticEquation(double x,double y, double z) {
		a = x;
		b = y;
		c = z;
	}
	public double getSolution1() {
		return (0-b + (Math.sqrt(Math.pow(b, 2) - (4 * a * c))))/(2*a);
	}
	public double getSolution2() {
		return (0-b - (Math.sqrt(Math.pow(b, 2) - (4 * a * c))))/(2*a);
	}
	public boolean hasSolution() {
		discriminant = Math.pow(b, 2) - (4 * a * c);
		return (discriminant >= 0);
	}
	private double a;
	private double b;
	private double c;
	private double discriminant;
}
