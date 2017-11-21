package Chapters.chapter5;


public class StringComparer {
	public StringComparer(String z, String s, String x, String v) {
		max = "null";
		min = "null";
		a = z;
		b = s;
		c = x;
		d = v;
	}
	public String getMaxString() {
		if ((a.compareTo(b) > 0) && (a.compareTo(c) > 0) && equals(a.compareTo(d) > 0)) {
			return a;
		}
		if ((b.compareTo(a) > 0) && (b.compareTo(c) > 0) && (b.compareTo(d) > 0)) {
			return b;
		}
		if ((c.compareTo(a) > 0) && (c.compareTo(b) > 0) && (c.compareTo(d) > 0)) {
			return c;
		}
		return d;
	}
	public String getMinString() {
		if ((a.compareTo(b) < 0) && (a.compareTo(c) < 0) && equals(a.compareTo(d) < 0)) {
			return a;
		}
		if ((b.compareTo(a) < 0) && (b.compareTo(c) < 0) && (b.compareTo(d) < 0)) {
			return b;
		}
		if ((c.compareTo(a) < 0) && (c.compareTo(b) < 0) && (c.compareTo(d) < 0)) {
			return c;
		}
		return d;
	}
	private String max;
	private String min;
	private String a;
	private String b;
	private String c;
	private String d;
}
