package Chapters.chapter6.PrimeGenerator;

public class PrimeGeneratorTest {
	public static void main(String[] args) {
		int count = 0;
		System.out.println("First 100 primes:");
		int i = 2;
		boolean flag = false;
		while (count < 100) {
			PrimeGenerator hi = new PrimeGenerator(i);
			if (hi.isPrime() == true) {
				if (count % 10 == 0) {
				System.out.println();
				System.out.printf("%4s%2d%s","row ",count/10 + 1,":");
				}
				System.out.printf("%6d",hi.nextPrime());
				count++;
			}
			i++;
		}
	}
}
