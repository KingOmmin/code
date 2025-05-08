/**
 *Program Name:	OneButton.java
 *Purpose:			To introduce creating a GUI class ext. JFrame
 *@author			Micheal Taylor
 *@version			
 *@since			Mar 4, 2025
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class OneButton  extends JFrame implements ActionListener
{
	
	private JButton button;
	private int count;
	
	
	public OneButton() 
	{
		//call JFrame superclass const
		super("One Button GUI Example");
				
		count = 0;
		
		//set layout then colour then componets
		setLayout(new FlowLayout());
		this.getContentPane().setBackground(Color.black);
		
		button = new JButton("Button clicked count = "+count);
		this.add(button);
		
		//add the action listener
		button.addActionListener(this);
		
		//frame setup
		setSize(400,100);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
				
		//needs to be last in the constructor
		setVisible(true);	
	}//end of OneButton constructor
	
	public void actionPerformed(ActionEvent e) 
	{
		count++;
		if(count%2==0)
			getContentPane().setBackground(Color.black);
		else
			getContentPane().setBackground(Color.magenta);
		
		button.setText("Button clicked count = "+count);
	}
	
	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		OneButton frame = new OneButton();
	}//end main

}//end class
