/**
 *Program Name:	LeaderBoard.java
 *Purpose:			
 *@author			Micheal Taylor
 *@version			
 *@since			Mar 7, 2025
 */

/**
 * 
 */
public class LeaderBoard {
	private int gameNumber;
	private int userWin;	
	private int computerWin;
	private int draw;
	public LeaderBoard() {
		
	}
	/**
	 * Gets the gameNumber of this object  
	 * @return the gameNumber
	 */
	
	public int getGameNumber() {
		return gameNumber;
	}
	/**
	 * Gets the userWin of this object  
	 * @return the userWin
	 */
	
	public int getUserWin() {
		return userWin;
	}
	/**
	 * Gets the computerWin of this object  
	 * @return the computerWin
	 */
	
	public int getComputerWin() {
		return computerWin;
	}
	/**
	 * Gets the draw of this object  
	 * @return the draw
	 */
	
	public int getDraw() {
		return draw;
	}
	/**
	 * Sets the gameNumber of this object
	 * @param gameNumber - the value to set
	 */
	
	public void setGameNumber(int gameNumber) {
		this.gameNumber = gameNumber;
	}
	/**
	 * Sets the userWin of this object
	 * @param userWin - the value to set
	 */
	
	public void setUserWin(int userWin) {
		this.userWin = userWin;
	}
	/**
	 * Sets the computerWin of this object
	 * @param computerWin - the value to set
	 */
	
	public void setComputerWin(int computerWin) {
		this.computerWin = computerWin;
	}
	/**
	 * Sets the draw of this object
	 * @param draw - the value to set
	 */
	
	public void setDraw(int draw) {
		this.draw = draw;
	}
	
}
