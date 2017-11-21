//Enoch Chou,Mr. Heiser, Honors Computer Programming Period 6
public class CarTest {
	public static void main(String[] args) {
		Car mybeemer = new Car(29); //object
		mybeemer.addGas(20); //outputs and methods
		System.out.println(mybeemer.getGas());
		mybeemer.drive(100);
		System.out.println(mybeemer.getGas());
	}
}
