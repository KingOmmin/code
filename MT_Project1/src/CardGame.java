/**
 *Program Name:	CardGame.java
 *Purpose:			
 *@author			Micheal Taylor
 *@version			
 *@since			Mar 7, 2025
 */
import java.util.*;
/**
 * 
 */
public class CardGame {
	private String gameType;
	private ArrayList<Card> deck;
	
	public CardGame() {
		
	}
	public CardGame(String gameType) {
		populateDeck();
	}

	/**
	 * Gets the gameType of this object  
	 * @return the gameType
	 */
	
	public String getGameType() {
		return gameType;
	}

	/**
	 * Gets the deck of this object  
	 * @return the deck
	 */
	
	public ArrayList<Card> getDeck() {
		return deck;
	}

	/**
	 * Sets the gameType of this object
	 * @param gameType - the value to set
	 */
	
	public void setGameType(String gameType) {
		this.gameType = gameType;
	}

	/**
	 * Sets the deck of this object
	 * @param deck - the value to set
	 */
	
	public void setDeck(ArrayList<Card> deck) {
		this.deck = deck;
	}
	private void populateDeck() {
	ArrayList<Card> deck = new ArrayList<Card>();	
	//deck.add(Card("Diamond",2));
	
	}
	/*public Card dealCard() {
		Card dealtCard;
		
		return dealtCard;
	}*/
	private void shuffle() {
		
	}
	public void startGame() {
		
	}
	
}//end class
