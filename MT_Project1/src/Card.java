/**
 *Program Name:	Card.java
 *Purpose:			this is the card object file
 *@author			Micheal Taylor
 *@version			1.0
 *@since			Feb 3, 2025
 */

//dealer hit max is 17
public class Card {
	private String suit;
	private int rank;

	Card()
	{
		suit = null;
		rank = 0; //needs to have been random
	}
	
	Card(String suit)
	{
		this.suit = suit;
		rank = 1; //needs to have been random
	}
	
	Card(String suit, int rank)
	{
		this.suit = suit;
		this.rank = rank;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
	public boolean isSameSuit(Card c)
	{
		return this.suit.equals( c.suit);
	}
	 
	public boolean isSameRank(Card c)
	{
		return this.rank == c.rank;		
	}
	
	public String findFaceValue()
	{
		String[] faces ={"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Jack","Queen","King"};
				
		return faces[getRank()];
	}
	
	public int findCardValue()
	{
		if(rank<11)
			return rank;
		else
			return 10;
	}
	
	public boolean isGreaterThan(Card c)
	{
		if (this.rank >= c.rank)
			return true;
		else
			return false;	
	}
	
	public boolean equals(Card c) 
	{
		if(this.suit.equals(c.suit) && c.rank == this.rank) 
		{				
			return true;
			
		}else return false;
		
	}
	/*
		Card[] array = new Card[13];
		for(int i=0;i<array.length;++i)
		{
			array[i] = new Card("Clubs");
			array[i].setRank(i+1);
		}
		
		for(Card c: array)
			System.out.println(c);
	*/
	
	
}//end class
