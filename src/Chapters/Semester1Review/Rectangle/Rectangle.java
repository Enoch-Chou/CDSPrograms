package Chapters.Semester1Review.Rectangle;

public class Rectangle {
	public Rectangle(int x, int y) {
		length = x;
		width = y;
	}
	public int getArea() {
		return length * width;
	}
	public int getPerimeter() {
		return 2 * (length + width);
	}
	public double getDiagonal() {
		return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
	}
	private int length;
	private int width;
}
