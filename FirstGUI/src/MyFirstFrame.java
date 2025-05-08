/**
 *Program Name:	MyFirstFrame.java
 *Purpose:		Create an instance of jframe object	
 *@author			Micheal Taylor
 *@version			1.0
 *@since			Mar 4, 2025
 */
import java.awt.*;
import javax.swing.*;

public class MyFirstFrame 
{

	public static void main(String[] args) 
	{
		// create an instance
		JFrame frame = new JFrame("My First Frame");
		
		//inherited from window
		frame.setSize(600,600);//size(width , height)
		
		//inherited from window
		frame.setLocation(400,200);//postition on the desktop
		
		//inherited from frame
		frame.getContentPane().setBackground(Color.black);
		
		//inherited from window
		frame.setVisible(true);
		
		
		
	}

}
