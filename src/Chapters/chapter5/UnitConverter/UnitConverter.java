package Chapters.chapter5.UnitConverter;


public class UnitConverter {
	public UnitConverter(String x) {
		factor = x;
	}
	public double toMetric(double a) {
		if (factor.equalsIgnoreCase("in")) {
			return a * 0.0254;
		}
		else if (factor.equalsIgnoreCase("ft")) {
			return a * 0.305;
		}
		else if (factor.equalsIgnoreCase("mi")) {
			return a * 1609;
		}
		else if (factor.equalsIgnoreCase("mm")) {
			return a * 0.001;
		}
		else if (factor.equalsIgnoreCase("cm")) {
			return a * 0.01;
		}
		else if (factor.equalsIgnoreCase("km")) {
			return a * 1000;
		}
		else if (factor.equalsIgnoreCase("m")) {
			return a;
		}
		else {
			return -1;
		}
	}
	public double fromMetric(double a) {
		if (factor.equalsIgnoreCase("in")) {
			return a / 0.0254;
		}
		else if (factor.equalsIgnoreCase("ft")) {
			return a / 0.305;
		}
		else if (factor.equalsIgnoreCase("mi")) {
			return a / 1609;
		}
		else if (factor.equalsIgnoreCase("mm")) {
			return a / 0.001;
		}
		else if (factor.equalsIgnoreCase("cm")) {
			return a / 0.01;
		}
		else if (factor.equalsIgnoreCase("km")) {
			return a / 1000;
		}
		else if (factor.equalsIgnoreCase("m")) {
			return a;
		}
		else {
			return -1;
		}
	}
	private String factor;
}
