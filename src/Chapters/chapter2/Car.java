//Enoch Chou,Mr. Heiser, Honors Computer Programming Period 6
public class Car{
	public Car(int x) { //constructor sets efficiency to x and sets fuel to 0
		efficiency = x;
		fuel = 0;
	}
	public void addGas(int y) { //adds y to fuel
		fuel = fuel + y;
	}
	public void drive(int z) { //substracts gallons from the amount driven
		fuel = fuel - (z/efficiency);
	}
	public double getGas() { //returns fuel
		return fuel;
	}
	private double efficiency;
	private double fuel;
	
}