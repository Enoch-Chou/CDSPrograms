package Chapters.Semester2Review;

public class WordCounter 
{
	public WordCounter()
	{
		w1 = 0;
		w2 = 0;
		w3 = 0;
		w4 = 0;
		w5 = 0;
		w6 = 0;
		w7 = 0;
		w8 = 0;
		w9 = 0;
		w10 = 0;
	}
	public void addWord(String word)
	{
		int length = word.length();
		switch(length)
		{
			case 1: w1++; break;
			case 2: w2++; break;
			case 3: w3++; break;
			case 4: w4++; break;
			case 5: w5++; break;
			case 6: w6++; break;
			case 7: w7++; break;
			case 8: w8++; break;
			case 9: w9++; break;
			case 10: w10++; break;
		}
	}
	public String toString()
	{
		String thing = "";
		if(w1 != 0)
			thing += w1 + " words of length 1" + "\n";
		if(w2 != 0)
			thing += w2 + " words of length 2" + "\n";
		if(w3 != 0)
			thing += w3 + " words of length 3" + "\n";
		if(w4 != 0)
			thing += w4 + " words of length 4" + "\n";
		if(w5 != 0)
			thing += w5 + " words of length 5" + "\n";
		if(w6 != 0)
			thing += w6 + " words of length 6" + "\n";
		if(w7 != 0)
			thing += w7 + " words of length 7" + "\n";
		if(w8 != 0)
			thing += w8 + " words of length 8" + "\n";
		if(w9 != 0)
			thing += w9 + " words of length 9" + "\n";
		if(w10 != 0)
			thing += w10 + " words of length 10" + "\n";
		return thing;
	}
	private int w1;
	private int w2;
	private int w3;
	private int w4;
	private int w5;
	private int w6;
	private int w7;
	private int w8;
	private int w9;
	private int w10;
}
