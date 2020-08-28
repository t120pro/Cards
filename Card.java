package cardGame;

public class Card {
	private String suit;
	private String value;
	
	public Card(String suit, String value){
		this.suit = suit;
		this.value = value;
	}

	public String toString() {
		return(value + " of " + suit);
	}
	
	public static void main(String[] args) {
		Card card1 = new Card("Clubs", "King");
		System.out.println(card1);
	}
}
