package Chapters.chapter6;

import javax.swing.JOptionPane;

public class CannonBallTest {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Please enter in the initial velocity");
		int velocity = Integer.parseInt(input);
		double deltaT = 0.01;
		double gravity = 9.81;
		double time = 1;
		int count = 0;
		double max = 0;
		CannonBall hi = new CannonBall(velocity);
		for (int i = 0; i < 100; i++) {
			hi.update(gravity, deltaT);
		}
		System.out.println(hi.getHeight());
		System.out.println(hi.getFormula(gravity, time));
		System.out.printf("%6s%3.0f%21s%4d%10s%4d%11s%4d%n", "Time = ", time, " seconds   Velocity =", Math.round(hi.getVelocity()), "  Height =", Math.round(hi.getHeight()), "  Formula =", Math.round(hi.getFormula(gravity, time)));
		while (hi.getHeight() > 0) {
			while (count < 100) {
				if (hi.getHeight() > 0) {
					hi.update(gravity, deltaT);
					count++;
					if (max < hi.getHeight()) {
						max = hi.getHeight();
					}
				}
				else {
					time += ((double) count / 100);
					break;
				}
			}
			while (count == 100) {
				if (hi.getHeight() > 0){
				time++;
				System.out.printf("%6s%3.0f%21s%4d%10s%4d%11s%4d%n", "Time = ", time, " seconds   Velocity =", Math.round(hi.getVelocity()), "  Height =", Math.round(hi.getHeight()), "  Formula =", Math.round(hi.getFormula(gravity, time)));
				count = 0;
				}
			}
		}
		System.out.printf("%12s%3.1f%n", "Total time =", time);
		System.out.printf("%24s%4.1f%n", "Maximum height reached =", max);
	}
}