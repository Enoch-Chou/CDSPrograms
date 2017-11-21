package Chapters.chapter2;

//Enoch Chou, Mr. Heiser, Honors Computer Programming Program 6, Employee program
public class Employee {
	public Employee(String str, double x) { //constructor, sets name to imput and salary to input
		name = str;
		salary = x;
	}
	public String getName() { // returns the name, method
		return name;
	}
	public double getSalary() { //returns the salary, method
		return salary; 
	}
	public void raiseSalary(double byPercent) { //raises the salary by the input percentage, method
		salary = salary * (1 + (byPercent/100));
	}
	private String name; //instance fields
	private double salary;
	
}
