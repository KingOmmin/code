/*
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
public class Panels extends JFrame
{
	private JPanel topPanel;
	private JPanel bottomPanel;
	
	
	//No-arg constructor, constructs the frame with its components
	public Panels()
	{
		//1. call superclass constructor
		super("Panels");
		
		//2. set layout manager for the frame
		setLayout(new GridLayout(2,1));
		
		//3. instantiate JPanel objects and build the panels
		buildTopPanel();
		buildBottomPanel();
		
		//4. add the panels to the frame
		add(topPanel);
		add(bottomPanel);
		
		//5. Set up methods for the frame
		setSize(400, 200);		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);			
	}//End of constructor
	
	//Method to build top panel
	private void buildTopPanel()
	{
		topPanel = new JPanel();
		
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER,20,20);
		topPanel.setLayout(layout);
		
		JButton [] buttons = new JButton[5];
		for(int i=0;i<buttons.length;i++) 
		{
			buttons[i] = new JButton(String.valueOf(i+1));
			topPanel.add(buttons[i]);
		}
		
	}//End of buildTopPanel method
	
	//Method to build bottom panel
	private void buildBottomPanel()
	{
		bottomPanel = new JPanel();
		
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER,20,20);
		bottomPanel.setLayout(layout);
		
		JButton [] buttons = new JButton[5];
		for(int i=0;i<buttons.length;i++) 
		{
			buttons[i] = new JButton(String.valueOf(i+1));
			bottomPanel.add(buttons[i]);
		}
		
		bottomPanel.add(buttons[0],BorderLayout.NORTH);
		bottomPanel.add(buttons[1],BorderLayout.SOUTH);
		bottomPanel.add(buttons[2],BorderLayout.WEST);
		bottomPanel.add(buttons[3],BorderLayout.EAST);
		bottomPanel.add(buttons[4],BorderLayout.CENTER);
	}//End of buildBottomPanel method
	
	//Add an embedded main method for testing
	public static void main (String [] args)
	{
		@SuppressWarnings("unused")
		Panels frame = new Panels();
	}//End of main method	
}//End of class
