package chapter08.EightPoint1;

import java.util.Queue;
import java.util.LinkedList;

public class Deck <T extends Card> {
	private Queue<T> deck;	// IMPORTANT: can't use a fixed size array[] since we are using generics.
	public Deck(){
		deck = new LinkedList<T>();
		initializeCards();
	}
	
	public void addCard(T card){
		deck.add(card);
	}
	
	public T dealCard(){
		return deck.remove();
	}
	
	public LinkedList<T> dealHand(int numCards){
		LinkedList<T> cards = new LinkedList<T>();
		for (int i = 0; i < numCards; i++){
			cards.add(deck.remove());
		}
		return cards;
	}
	
	public void shuffle(){
		// unimplemented
	}
	
	public int cardsLeft(){
		return deck.size();
	}
	
	private void initializeCards(){
		// Unimplemented. Would create 52 instances of cards here and add them to "deck"
	}
}
