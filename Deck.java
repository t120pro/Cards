package cardGame;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	public ArrayList<Card> deck = new ArrayList<Card>();
	
	public Deck(){
		//builds a deck of cards (52 cards)
		String[] suits = {"Spades", "Clubs", "Diamonds", "Hearts"};
		String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		for(String suit : suits){
			for(String value : values) {
			deck.add(new Card(value, suit));	
			}
		}
	}
	public Deck(String empty) {
		//creating a not-full deck
	}
	
	public void addToDeck(String value, String suit) {
		deck.add(new Card(value, suit));
	}
	
	public void shuffle() {
		Collections.shuffle(deck);
	}
	
	public Card drawCard() {
		Card popped = deck.remove(deck.size() -1);
		return popped;
	}
	
	@Override
	public String toString() {
		String deckString = "[";
		for (int i = 0; i < deck.size(); i++) {
			Card currentCard = deck.get(i);
			deckString += "/' " + currentCard + " /'";
		}
		deckString += "]";
		return deckString;
	}
}
