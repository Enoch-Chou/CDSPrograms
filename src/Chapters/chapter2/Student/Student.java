package Chapters.chapter2.Student;

//Enoch Chou,Mr. Heiser, Honors Computer Programming Period 6
public class Student {
	public Student(String str, int x, int y) { //constructor sets name to input, sum to input, and number to input
		name = str;
		sumScores = x;
		numScores = y;
	}
	public String getName() { //returns name method
		return name;
	}
	public void addTest(int score) { //method adds score to sum
		sumScores = sumScores + score;
	}
	public void addTestNumber(int z) { //method adds amount of tests to number
		numScores = numScores + z;
	}
	public int getAverageScore() {//method calculates average
		return sumScores/numScores;
	}
	private String name;
	private int sumScores;
	private int numScores;
	
}
