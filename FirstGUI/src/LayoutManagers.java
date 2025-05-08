/**
 * Program Name:	LayoutManagers.java
 * Purpose:			To illustrate the use of three layout managers
 * @author			Janice Manning
 * @since			March 10, 2025
 * @version			1.0.0
 */

import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;
@SuppressWarnings("serial")
public class LayoutManagers extends JFrame
{
	//Declare instance field, a JButton array
	private JButton [] buttons;	
	
	//No-arg constructor, constructs the frame with its components
	public LayoutManagers()
	{
		//call superclass constructor
		super("Layout Managers");	
		
		//1. Set FlowLayout manager(default layout for JPanel) 
		//FlowLayout layout = new FlowLayout();
		//FlowLayout layout = new FlowLayout(FlowLayout.RIGHT, 10,50);
		//setLayout(layout);
		
		//2. Set BorderLayout manager (default layout for JFrame)
		//BorderLayout layout = new BorderLayout();
		//setLayout(layout);		//inherited from Container, Window, Frame, JFrame
		
		//3. set GridLayout manager (#rows, #columns, horizontal padding, vertical padding)
		GridLayout layout = new GridLayout(5,2,15,15);
		setLayout(layout);
		
		//initialize JButton array
		buttons = new JButton[10];
		//initialize each array element and add to the content pane
		for(int i = 0; i < buttons.length; i++)
		{
			buttons[i] = new JButton(String.valueOf(i + 1));
			add(buttons[i]);			
		}
		/*
		//add the buttons to the BorderLayout regions of this JFrame
		add(buttons[0],BorderLayout.NORTH);		
		add(buttons[1],BorderLayout.SOUTH);
		add(buttons[2],BorderLayout.CENTER);
		add(buttons[3],BorderLayout.EAST);
		add(buttons[4],BorderLayout.WEST);
		*/
		
		//Set up methods for the frame
		setSize(400, 200);								
		setLocationRelativeTo(null);					
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
		setVisible(true);								
	}//End of constructor
	
	//Add an embedded main method for testing
	public static void main (String [] args)
	{
		@SuppressWarnings("unused")
		LayoutManagers frame = new LayoutManagers();
	}//End of main method	
}//End of class