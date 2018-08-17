package Chapters.chapter2.RoachPopulation;

//Enoch Chou,Mr. Heiser, Honors Computer Programming Period 6
public class RoachPopulation {
	public RoachPopulation(double x) { //constructor
		population = x;
	}
	public void waitForDoubling() { //method doubles
		population = population * 2;
	}
	public void spray() { //method reduces 10 percent
		population = population * 0.9;
	}
	public double getPopulation() { //method
		return population;
	}
	private double population; //instance field
}
