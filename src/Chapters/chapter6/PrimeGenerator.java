package Chapters.chapter6;

public class PrimeGenerator {
	public PrimeGenerator(int x) {
		num = x;
	}	
	public boolean isPrime() {
		 for (int i = 1; i <= num; i++) {
			 if (num % i == 0) {
				 factors++;
			 }
		 }
		 if (factors == 2) {
			 return true;
		 }
		 return false;
	}
	public int nextPrime() {
		return num;
	}
	public boolean isPrime(int z) {
		 for (int i = z; i <= z; i++) {
			 if (z % i == 0) {
				 factors++;
			 }
		 }
		 if (factors == 2) {
			 return true;
		 }
		 return false;
	}
	private int num;
	private int factors;
}
