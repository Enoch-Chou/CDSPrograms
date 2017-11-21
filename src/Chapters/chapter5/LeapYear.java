package Chapters.chapter5;


public class LeapYear {
	public LeapYear(int x) {
		year = x;
	}
	public boolean isLeapYear() {
		if (year < 1582 && year % 4 == 0) {
			return true;
		}
		else if (year % 400 == 0) {
			return true;
		}
		else if (year % 100 == 0) {
			return false;
		}
		else if (year % 4 == 0) {
			return true;
		}
		return false;
	}
	public String getResults(boolean x) {
		if (x == true) { 
			return " is a leap year";
		}
		return " is not a leap year";
	}
	private int year;
}
