/**
 *Program Name:	TwoButton1.java
 *Purpose:			To introduce creating a GUI class ext. JFrame
 *@author			Micheal Taylor
 *@version			
 *@since			Mar 4, 2025
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class TwoButton2  extends JFrame implements ActionListener
{
	
	private JButton btnOne;
	private JButton btnTwo;
	private int countToggle;
	private int countCycle;
	
	public TwoButton2() 
	{
		//call JFrame superclass const
		super("Two Button 1 GUI Example");
				
		countToggle = 0;
		
		//set layout then colour then componets
		setLayout(new FlowLayout());
		this.getContentPane().setBackground(Color.black);
		
		btnOne = new JButton("Colour Toggle");
		this.add(btnOne);
		btnTwo = new JButton("Colour Cycle");
		this.add(btnTwo);
		
		
		
		//add the action listener
		btnOne.addActionListener(this);
		btnTwo.addActionListener(this);
		
		//frame setup
		setSize(400,100);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);				
		//needs to be last in the constructor
		setVisible(true);	
	}//end of OneButton constructor
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == btnOne) 
		{
			countToggle++;
			if(countToggle%2==0)
				getContentPane().setBackground(Color.black);
			else
				getContentPane().setBackground(Color.magenta);			
			btnOne.setText("Button clicked count = "+countToggle);
		}
		else if(e.getSource() == btnTwo)
		{
			countCycle++;					
			btnTwo.setText("Button clicked count = "+countCycle);
			
			switch(countCycle) 
			{
			case 1:
				getContentPane().setBackground(Color.red);
				break;
			case 2:
				getContentPane().setBackground(Color.blue);
				break;
			case 3:
				getContentPane().setBackground(Color.green);
				break;
			case 4:
				getContentPane().setBackground(Color.magenta);
				break;			
			}	
			if(countCycle==4)
				countCycle = 0;
		}
			
	}
	
public static void main(String[] args) 
{
	@SuppressWarnings("unused")
	TwoButton2 frame = new TwoButton2();
}//end main

}//end class
