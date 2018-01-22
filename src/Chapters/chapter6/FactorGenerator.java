package Chapters.chapter6;

public class FactorGenerator {
	public FactorGenerator(int x) {
		number = x;
	}
	public void nextFactor() {
		for (factor = 2; factor <= number; factor++) {
			if (number % factor == 0) {
				System.out.print(factor + " ");
				number /= factor;
				break;
			}
		}
	}
	public boolean hasNextFactor() {
		if (number != 1) {
			return true;
		}
		return false;
	}
	private int number;
	private int factor;
}
