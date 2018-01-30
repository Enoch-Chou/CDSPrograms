package Chapters.chapter6;

public class CannonBall {
	public CannonBall(double x) {
		initialVelocity = x;
		velocity = x;
	}
	public void update(double gravity, double deltaT) {
		velocity = velocity - gravity * deltaT;
		height = height + velocity * deltaT;
	}
	public double getVelocity() {
		return velocity;
	}
	public double getHeight() {
		return height;
	}
	public double getFormula(double gravity, double time) {
		return (-0.5 * gravity * Math.pow(time, 2) + initialVelocity * time);
	}
	
	private double initialVelocity;
	private double height;
	private double velocity;
}
