package Chapters.Semester1Review;

public class Shirt {
	public Shirt(int collar, int sleeve) {
		collarSize = collar;
		sleeveLength = sleeve;
		material = "cotton";
	}
	public Shirt(int collar, int sleeve, String type) {
		collarSize = collar;
		sleeveLength = sleeve;
		material = type;
	}
	public int getCollarSize() {
		return collarSize;
	}
	public int getSleeveLength() {
		return sleeveLength;
	}
	public String getMaterial() {
		return material;
	}
	private int collarSize;
	private int sleeveLength;
	private String material;
}
