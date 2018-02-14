package Chapters.chapter7;

public class Geometry {
	public static double SphereVolume(double r) {
		return 4.0/3 * Math.PI * Math.pow(r, 3);
	}
	public static double sphereSurface(double r) {
		return 4.0 * Math.PI * Math.pow(r, 2);
	}
	public static double cylinderVolume(double r, double h) {
		return h * Math.PI * Math.pow(r, 2);
	}
	public static double cylinderSurface(double r, double h) {
		return (2.0 * Math.PI * Math.pow(r, 2)) + (2 * Math.PI * r * h);
	}
	public static double coneVolume(double r, double h) {
		return 1.0/3 * Math.PI * Math.pow(r, 2) * h;
	}
	public static double coneSurface(double r, double h) {
		return Math.PI * r * (h + r);
	}
}
