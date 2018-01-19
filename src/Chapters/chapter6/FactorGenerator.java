package Chapters.chapter6;

public class FactorGenerator {
	public FactorGenerator(int x) {
		number = x;
	}
	public int nextFactor() {
		for (factor = 2; factor < number; factor++) {
			if (number % factor == 0) {
				number /= factor;
				return factor;
			}
		}
	}
	private int number;
	private int factor;
}
