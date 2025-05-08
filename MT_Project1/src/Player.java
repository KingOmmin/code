/**
 *Program Name:	Player.java
 *Purpose:			
 *@author			Micheal Taylor
 *@version			
 *@since			Feb 25, 2025
 */
import java.util.*;
/**
 * 
 */
public class Player {
	
	private String name;
	ArrayList<Card> hand;
	
	public Player() {
		name = "Computer";
	}
	
	public Player(String name) {
		this.name = name;
	}
	/**
	 * Gets the name of this object  
	 * @return the name
	 */
	
	public String getName() {
		return name;
	}
	/**
	 * Gets the hand of this object  
	 * @return the hand
	 */
	
	public ArrayList<Card> getHand() {
		return hand;
	}
	/**
	 * Sets the name of this object
	 * @param name - the value to set
	 */
	
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Sets the hand of this object
	 * @param hand - the value to set
	 */
	
	public void setHand(ArrayList<Card> hand) {
		this.hand = hand;
	}
	public void draw(Card c) {
		Card[] array = new Card[13];
		for(int i=0;i<array.length;++i)
		{
			array[i] = new Card("Clubs");
			array[i].setRank(i+1);
		}		
	}
	int totalHand() {
	int total =	getHand().size();
	return total;
	}
	int findAceValue(int total) {
		int aceValue;
		if (total >= 11 )
			aceValue = 1;
		else
			aceValue = 11;
		return aceValue;		
	}
	void emptyHand() {
		
	}
	public String toString(){
		String print=" ";
		return print;
	}
	
}//end class
