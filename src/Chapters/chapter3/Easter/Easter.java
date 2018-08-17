package Chapters.chapter3.Easter;

public class Easter {
	public Easter(int year) {
		y = year;
	}
	public void stuffNoOneNeedsToSee() { //does all the insignificant equations
		int a = y % 19;
		int b = (int) ((y / 100) + 0.5);
		int c = y % 100;
		int d = (int) ((b / 4) + 0.5);
		int e = b % 4;
		int g = (int) (((8 * b + 13)/25)+0.5);
		int h = (19 * a + b - d - g + 15) % 30;
		int j = (int) ((c / 4) + 0.5);
		int k = c % 4;
		int m = (int) (((a + 11 * h)/319)+0.5);
		int r = (2 * e + 2 * j - k - h + m + 32)%7;
		n = (int) (((h - m + r + 90)/25)+0.5);
		p = (h - m + r + n + 19)%32;
	}
	public String getEasterSundayMonth() { //returns month based on value
		String Calendar = "January  February March    April    May      June     July     August   SeptemberOctober  November December ";
		if (n == 1) {
			return Calendar.substring(9);
		}
		if (n == 2) {
			return Calendar.substring(9,18);
		}
		if (n == 3) { 
			return Calendar.substring(18,27);
		}
		if (n == 4) {
			return Calendar.substring(27,36);
		}
		if (n == 5) {
			return Calendar.substring(36,45);
		}
		if (n == 6) {
			return Calendar.substring(45,54);
		}
		if (n == 7) {
			return Calendar.substring(54,63);
		}
		if (n == 8) {
			return Calendar.substring(63,72);
		}
		if (n == 9) {
			return Calendar.substring(72,81);
		}
		if (n == 10) {
			return Calendar.substring(81,90);
		}
		if (n == 11) {
			return Calendar.substring(90,99);
		}
		return Calendar.substring(99,108);
	}
	public int getEasterSundayDay() { //returns day
		return p;
	}
	private int y;
	private int n;
	private int p;
}
