/**
 *Program Name:	GameOf21.java
 *Purpose:			
 *@author			Micheal Taylor
 *@version			
 *@since			Mar 7, 2025
 */

/**
 * 
 */
public class GameOf21 extends CardGame {
	private Player user;
	private Player computer;
	private LeaderBoard record;
	public GameOf21() {
		
	}
	public GameOf21(String gameType, String user) {
		
	}
	/**
	 * Gets the user of this object  
	 * @return the user
	 */
	
	public Player getUser() {
		return user;
	}
	/**
	 * Gets the computer of this object  
	 * @return the computer
	 */
	
	public Player getComputer() {
		return computer;
	}
	/**
	 * Gets the record of this object  
	 * @return the record
	 */
	
	public LeaderBoard getRecord() {
		return record;
	}
	/**
	 * Sets the user of this object
	 * @param user - the value to set
	 */
	
	public void setUser(Player user) {
		this.user = user;
	}
	/**
	 * Sets the computer of this object
	 * @param computer - the value to set
	 */
	
	public void setComputer(Player computer) {
		this.computer = computer;
	}
	/**
	 * Sets the record of this object
	 * @param record - the value to set
	 */
	
	public void setRecord(LeaderBoard record) {
		this.record = record;
	}
	
	public void startGame(){
		
	}
}
