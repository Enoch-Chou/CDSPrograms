package Chapters.chapter5;


public class Card {
	public Card(String x, String y) {
		number = x;
		suit = y;
	}
	public String getDescription() {
		if (number.length() + suit.length() > 3) {
			return "too many characters";
		}
		switch (number) {
		case "2": number = "2 of "; break;
		case "3": number = "3 of "; break;
		case "4": number = "4 of "; break;
		case "5": number = "5 of "; break;
		case "6": number = "6 of "; break;
		case "7": number = "7 of "; break;
		case "8": number = "8 of "; break;
		case "9": number = "9 of "; break;
		case "10": number = "10 of "; break;
		case "J": number = "Jack of "; break;
		case "Q": number = "Queen of "; break;
		case "K": number = "King of "; break;
		default: number = "illegal card number";
		}
		switch (suit) {
		case "C": suit = "Clubs"; break;
		case "S": suit = "Spades"; break;
		case "D": suit = "Diamonds"; break;
		case "H": suit = "Hearts"; break;
		default: suit = "illegal suit";
		}
		if (number.equals("illegal card number")) {
			return number;
		}
		else if (suit.equals("illegal suit")) {
			return suit;
		}
		return number + suit;
		
	}
	private String number;
	private String suit;
}
