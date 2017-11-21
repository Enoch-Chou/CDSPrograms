//Enoch Chou,Mr. Heiser, Honors Computer Programming Period 6
import java.awt.Rectangle; //imports REctangle class

public class RectangleIntersection {
	public static void main(String[] args) {
		Rectangle A = new Rectangle(2,2,5,2); //creates Rectangle A
		Rectangle B = new Rectangle(5,3,5,2); //creates Rectangle B
		Rectangle C = new Rectangle(3,6,8,2); //creates Rectangle C
		
		System.out.println("Rectangle A: " + A); //output
		System.out.println("Rectangle B: " + B);
		System.out.println("Rectangle C: " + C);
		System.out.println("Intersection of A and B: " + A.intersection(B)); //intersects
		System.out.println("Intersection of A and C: " + A.intersection(C));
	}
}
