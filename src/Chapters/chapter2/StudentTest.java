//Enoch Chou,Mr. Heiser, Honors Computer Programming Period 6
public class StudentTest {
	public static void main(String[] args) {
		Student smart = new Student("Enoch Chou", 0, 0); //object
		smart.addTest(85); //output and methods
		smart.addTestNumber(1);
		smart.addTest(97);
		smart.addTestNumber(1);
		smart.addTest(99);
		smart.addTestNumber(1);
		smart.addTest(176);
		smart.addTestNumber(2);
		System.out.println(smart.getName() + " has an average test score of " + smart.getAverageScore());
	}
}
