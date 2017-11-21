package Chapters.chapter2;

//Enoch Chou, Mr. Heiser, Honors Computer Programming Program 6, Employee program
public class EmployeeTest {
	public static void main(String[] args) {
		Employee Employee1 = new Employee("John Doe",0.0); //objects
		Employee Employee2 = new Employee("Horatio Hornblower", 80000.0);
		Employee2.raiseSalary(10); //method acting on object
		System.out.println("After a 10% raise Horatio Hornblower has a salary of $" + Employee2.getSalary()); //output
	}
}
