//Enoch Chou,Mr. Heiser, Honors Computer Programming Period 6
public class RoachPopulationTest {
	public static void main(String[] args) {
		RoachPopulation house = new RoachPopulation(10.0); //object
		house.waitForDoubling(); //methods and output 
		house.spray();
		System.out.println("After 1 wait period: " + house.getPopulation() + " roaches" );
		house.waitForDoubling();
		house.spray();
		System.out.println("After 2 wait period: " + house.getPopulation() + " roaches" );
		house.waitForDoubling();
		house.spray();
		System.out.println("After 3 wait period: " + house.getPopulation() + " roaches" );
	}
}
